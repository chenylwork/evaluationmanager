package com.evaluationmanager.action;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.evaluationmanager.entiy.Evaluation;
import com.evaluationmanager.entiy.Option;
import com.evaluationmanager.entiy.Paper;
import com.evaluationmanager.entiy.Question;
import com.evaluationmanager.entiy.view.PaperTeacher;
import com.evaluationmanager.entiy.view.PaperView;
import com.evaluationmanager.exception.DataException;
import com.evaluationmanager.service.EvaluationService;
import com.evaluationmanager.service.PaperService;
import com.evaluationmanager.service.TeacherService;
import com.evaluationmanager.support.Action;

/**
 * 
 * @Author 韩笑，陈彦磊
 * @Datetime 2018年7月30日-上午10:48:57
 * @Description 描述信息：试卷操作action类
 *
 */
@Controller("paperAction")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PaperAction extends Action<Paper> {

	private static final long serialVersionUID = 1L;
	@Autowired
	private PaperService paperService;
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private EvaluationService evaluationService;
	
	private Paper paper = new Paper();
	
	private List<Question> questionRandList;
	private List<Option> optionList;
	private List<Question> questionList;
	private List<Paper> paperList;
	private List<PaperTeacher> paperTeacherList;
	private List<Map<String, Object>> mapList;
	private List<Map<String,String>> paperMapList;
	private List<Evaluation> evaluationList;
	
	/*分配测评卷需要的属性配置*/
	/**
	 * 測評開始時間
	 */
	private String startTime;
	/**
	 * 測評結束時間
	 */
	private String endTime;
	/**
	 * 測評分配的教師編號數組
	 */
	private String[] teacherNos;
	/**
	 * 測評分配的試卷編號數組
	 */
	private String[] paperNos;
	/**
	 * 试卷教师关系
	 */
	private PaperTeacher paperTeacher;
	/**
	 * 试卷详细信息列表，包括试题。选项全部信息
	 */
	private List<PaperView> paperViewList;
	/*分配测评卷需要的属性配置*/
	
	
	
	private String data;
	
	/**
	 * 随机抽取试题
	 * @return
	 */
	public String randPap(){
		questionRandList=this.paperService.getRand();
		optionList = this.paperService.getAllOption();
		return RAND_PAPER;
	}
	/**
	 * 分配试卷页面跳转
	 * @Author 陈彦磊
	 * @DateTime 2018年8月19日-下午4:25:23
	 * @Description 作用描述
	 *
	 * @return
	 */
	public String doAppoint() {
		// 获取全部试卷
		paperList = paperService.getAllPaper();
		mapList = teacherService.teacherListbyMap();
		return "paper_appoint";
	}
	/**
	 * 查询全部试题
	 * @return
	 */
	public String getAllQues(){
		questionList = this.paperService.getAllQues();
		return GETALLQUES;
	}
		
	/**
	 * 添加试卷信息
	 * @return
	 */
	public String add(){
//		this.paperService.add(paper);
		System.err.println(data);
		JSON_CHAR_DATA = paperService.add(data) ? "1" : "0";
		return JSONOCHAR;
	}
	/**
	 * 测评详细信息
	 * @Author 陈彦磊
	 * @DateTime 2018年8月23日-下午1:23:16
	 * @Description 作用描述
	 * @return
	 */
	public String evaluation() {
		String teacherNo = data;
		paperTeacher = paperService.getPaperTeacher(paper.getPaperNo(), teacherNo);
		paperViewList = paperService.getPaper(paper.getPaperNo());
		return EVALUATION;
	}
	/**
	 * 删除试卷信息
	 * @return
	 */
	public String delete(){
		this.paperService.delete(paper);
		return DELETE_PAPER;
	}
	/**
	 * 修改试卷信息
	 * @return
	 */
	public String update(){
		this.paperService.update(paper);
		return UPDATE_PAPER;
	}

	/**
	 * 获取试卷类别
	 * @Author 陈彦磊
	 * @DateTime 2018年8月12日-下午10:57:32
	 * @return
	 */
	public String paperType() {
		JSON_CHAR_DATA  = paperService.getPaperType();
		return JSONOCHAR;
	}
	/**
	 * 展示试卷列表
	 * @Author 陈彦磊
	 * @DateTime 2018年8月12日-下午10:58:58
	 * @Description 作用描述
	 *
	 * @return
	 */
	public String showPaper() {
		paperService.paginGetPaper(paginMap, paper);
		System.out.println(paginMap);
		return ALL_PAPER;
	}
	/**
	 * 测评试卷列表
	 * @Author 陈彦磊
	 * @DateTime 2018年8月23日-下午12:57:59
	 * @Description 作用描述
	 * @return
	 * @throws DataException
	 */
	public String evaluationList() throws DataException {
		paperTeacherList = paperService.getPaperTeachers(data);
		evaluationList = evaluationService.getUserEvaluation(data);
		return EVALUATION_LIST;
	}
	/*get 和set方法*/
	public List<Question> getQuestionRandList() {
		return questionRandList;
	}
	
	public void setQuestionRandList(List<Question> questionRandList) {
		this.questionRandList = questionRandList;
	}
	
	public List<Option> getOptionList() {
		return optionList;
	}

	public void setOptionList(List<Option> optionList) {
		this.optionList = optionList;
	}

	public Paper getPaper() {
		return paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	public List<Question> getQuestionList() {
		return questionList;
	}
	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
	}
	@Override
	public Paper getModel() {
		return paper;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public List<Paper> getPaperList() {
		return paperList;
	}
	public void setPaperList(List<Paper> paperList) {
		this.paperList = paperList;
	}
	public List<Map<String, Object>> getMapList() {
		return mapList;
	}
	public void setMapList(List<Map<String, Object>> mapList) {
		this.mapList = mapList;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String[] getTeacherNos() {
		return teacherNos;
	}
	public void setTeacherNos(String[] teacherNos) {
		this.teacherNos = teacherNos;
	}
	public String[] getPaperNos() {
		return paperNos;
	}
	public void setPaperNos(String[] paperNos) {
		this.paperNos = paperNos;
	}
	public List<Map<String, String>> getPaperMapList() {
		return paperMapList;
	}
	public void setPaperMapList(List<Map<String, String>> paperMapList) {
		this.paperMapList = paperMapList;
	}
	public List<PaperTeacher> getPaperTeacherList() {
		return paperTeacherList;
	}
	public void setPaperTeacherList(List<PaperTeacher> paperTeacherList) {
		this.paperTeacherList = paperTeacherList;
	}
	public List<PaperView> getPaperViewList() {
		return paperViewList;
	}
	public void setPaperViewList(List<PaperView> paperViewList) {
		this.paperViewList = paperViewList;
	}
	public PaperTeacher getPaperTeacher() {
		return paperTeacher;
	}
	public void setPaperTeacher(PaperTeacher paperTeacher) {
		this.paperTeacher = paperTeacher;
	}
	public List<Evaluation> getEvaluationList() {
		return evaluationList;
	}
	public void setEvaluationList(List<Evaluation> evaluationList) {
		this.evaluationList = evaluationList;
	}
	
}
