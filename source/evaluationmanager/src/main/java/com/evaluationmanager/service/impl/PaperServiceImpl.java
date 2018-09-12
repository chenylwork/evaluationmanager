package com.evaluationmanager.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.dao.CodeDao;
import com.evaluationmanager.dao.OptionDao;
import com.evaluationmanager.dao.PaperDao;
import com.evaluationmanager.dao.PaperQuestionDao;
import com.evaluationmanager.dao.PaperTeacherDao;
import com.evaluationmanager.dao.QuestionDao;
import com.evaluationmanager.dao.StudentDao;
import com.evaluationmanager.dao.TeacherCourseClassDao;
import com.evaluationmanager.dao.TeacherDao;
import com.evaluationmanager.dao.UserDao;
import com.evaluationmanager.entiy.Option;
import com.evaluationmanager.entiy.Paper;
import com.evaluationmanager.entiy.PaperQuestion;
import com.evaluationmanager.entiy.Question;
import com.evaluationmanager.entiy.TeacherClassCourse;
import com.evaluationmanager.entiy.User;
import com.evaluationmanager.entiy.view.PaperTeacher;
import com.evaluationmanager.entiy.view.PaperView;
import com.evaluationmanager.entiy.view.StudentView;
import com.evaluationmanager.entiy.view.TeacherView;
import com.evaluationmanager.exception.DataException;
import com.evaluationmanager.service.PaperService;
import com.evaluationmanager.support.AbstractService;
import com.evaluationmanager.unit.NoEnum;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * 
 * @Author 韩笑,陈彦磊
 * @Datetime 2018年7月30日-上午10:43:56
 * @Description 描述信息：试卷信息操作业务实现类
 *
 */
@org.springframework.stereotype.Service("paperService")
public class PaperServiceImpl extends AbstractService<Paper> implements PaperService {
	
	@Autowired
	private PaperDao paperDao;
	@Autowired
	private OptionDao optionDao;
	@Autowired
	private QuestionDao questionDao;
	@Autowired
	private CodeDao codeDao;
	@Autowired
	private UserDao userDao;
	@Autowired
	private PaperQuestionDao paperQuestionDao;
	@Autowired
	private PaperTeacherDao paperTeacherDao;
	@Autowired
	private StudentDao studentDao;
	@Autowired
	private TeacherDao teacherDao;
	@Autowired
	private TeacherCourseClassDao teacherClassDao;
	@Autowired
	private Gson gson;
	
	private static final String STUDENTROLELEFT = "02";
	
	@Override
	@Transactional
	@SuppressWarnings("unchecked")
	public boolean add(String data) {
		Map<String,Object> map = gson.fromJson(data, new TypeToken<Map<String,Object>>(){}.getType());
		Map<String, Object> paperMap = (Map<String, Object>) map.get("paper");
		List<Map<String, String>> questionsMap = (List<Map<String, String>>) map.get("questions");
		Paper paper = new Paper();
		String paperNo = NoEnum.Paper.getNo();
		paper.setPaperNo(paperNo);
		paper.setType((String)paperMap.get("type"));
		paper.setDescription((String)paperMap.get("description"));
		paper.setStartTime((String)paperMap.get("startTime"));
		paper.setEndTime((String)paperMap.get("endTime"));
		paperDao.add(paper);
		int successSize = 0;
		int questionSize = questionsMap.size();
		for(int i=0; i<questionSize; i++) {
			Map<String, String> questionMap = questionsMap.get(i);
			PaperQuestion paperQuestion = new PaperQuestion();
			paperQuestion.setQuestion(questionMap.get("question"));
			paperQuestion.setPaper(paperNo);
			paperQuestion.setNumber(Integer.parseInt(questionMap.get("number")));
			paperQuestion.setScore(Integer.parseInt(questionMap.get("score")));
			successSize = paperQuestionDao.add(paperQuestion) ? ++successSize : successSize;
		}
		return successSize == questionSize;
	}

	@Override
	public List<PaperView> getPaper(String paperNo) {
		return paperDao.getPaperInfo(paperNo);
	}
	public PaperTeacher getPaperTeacher(String paperNo, String teacherNo) {
		return paperTeacherDao.getPaperTeacher(paperNo, teacherNo);
	}
	@Override
	@Transactional
	public boolean update(Paper p) {
		return this.paperDao.update(p);
	}

	@Override
	@Transactional
	public boolean delete(Paper p) {
		return this.paperDao.delete(p);
	}

	@Override
	@Transactional
	public List<Question> getRand() {
		return this.paperDao.getRand();
	}
	
	@Override
	@Transactional(readOnly=true)
	public String getPaperType() {
		return gson.toJson(codeDao.getPaperType());
	}

	@Override
	@Transactional(readOnly=true)
	public List<Map<String, Object>> paginGetPaper(Pagin<Map<String, Object>> pagin,Paper paper) {
		pagin.setCount(paperDao.size(paper));
		return paperDao.paginGetPaper(pagin, paper);
	}
	@Override
	public List<Option> getAllOption() {
		return this.optionDao.getDatas("");
	}
	
	@Override
	public List<Question> getAllQues() {
		return this.questionDao.getDatas("");
	}

	@Override
	public List<Paper> getAllPaper() {
		return paperDao.getDatas("");
	}

	@Override
	@Transactional(readOnly=true)
	public List<PaperTeacher> getPaperTeachers(String account) throws DataException {
		// 获取用户信息
		User user = userDao.getDataByNo(account);
		// 专业编号
		String major = "";
		if(STUDENTROLELEFT.equals(user.getRole().substring(0, 2))) { // 学生用户
			StudentView student = studentDao.getStudent(account);
			List<TeacherClassCourse> datas = teacherClassDao.getDatas("this.classes = ?", student.getClassNo());
			List<String> teacherNos = new ArrayList<String>();
			datas.forEach(data -> {
				teacherNos.add(data.getTeacher());
			});
			return  paperTeacherDao.getPaperTeacherByTeacherNo(teacherNos.toArray(new String[]{}));
		} else { // 教师用户
			TeacherView teacher = teacherDao.getTeacher(account);
			String teacherRole = teacher.getRoleNo();
			switch (teacherRole) {
			case "0103": // 系领导
				return  paperTeacherDao.getDeptPaperTeacher(major,account);
			case "0104": // 授课教师
				// 获取教师所属专业
				major = teacherDao.getDataByNo(account).getMajor(); 
				return  paperTeacherDao.getMajorPaperTeacher(major,account);
			default: // 全部试卷信息(管理员、院级领导)
				return  paperTeacherDao.getAllPaperTeacher(account);
			}
		}
	}
	public void getPaperTeacher() {
	}
}
