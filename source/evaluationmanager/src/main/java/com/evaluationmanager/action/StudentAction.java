package com.evaluationmanager.action;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.evaluationmanager.entiy.*;
import com.evaluationmanager.exception.DataException;
import com.evaluationmanager.service.*;
import com.evaluationmanager.support.Action;
import com.evaluationmanager.unit.Md5Unit;

/**
 * 
 * @Author 邢燕蕊
 * @Datetime 2018年7月27日-上午9:52:31
 * @Description 描述信息：
 *
 */
@Controller("studentAction")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class StudentAction extends Action<Student> {

	private static final long serialVersionUID = 423709953794339294L;
	HttpServletRequest request = ServletActionContext.getRequest();
	@Autowired
	private StudentService studentService;
	@Autowired
	private CodeService codeService;
	@Autowired
	private MajorService majorService;
	@Autowired
	private UserService userService;
	@Autowired
	private OlogService ologService;

	private Student student = new Student();
	private User user = new User();
	private Code code = new Code();

	private Map<String, Object> studentMap;
	private List<Code> sexList;
	private List<Major> majorList;
	private List<Code> stateList;
	// user部分
	private int userID;
	private String account;
	private String password;
	private String name;
	private String stuName;
	private String sex;
	private int age;
	private String pid;
	private String no;
	// 批量
	private String[] batchID;

	@Override
	public Student getModel() {
		return student;
	}

	/**
	 * 添加学生页面下拉框遍历
	 * 
	 * @return
	 */
	public String selectType() {
		majorList = this.majorService.getAllCode();
		sexList = this.codeService.getSex();
		stateList = this.codeService.getStudentState();
		return SELECT_TYPES;
	}

	/**
	 * 添加、两个表同时添加
	 * 
	 * @return
	 */
	public String add() {
		student.setUser(student.getStuNo());
		student.setRole("0203");
		user.setRole("0203");
		user.setAccount(student.getStuNo());
		String password=Md5Unit.encodeByMD5("123456");
		user.setPassword(password);
		user.setName(name);
		user.setSex(sex);
		user.setAge(age);
		user.setPid(pid);
		this.studentService.add(student, user);
		student = null;
		user = null;
		return selectType();
	}

	/**
	 * 删除、批量删除
	 * 
	 * @return
	 */
	public String delete() {
		OperationLog operation = new OperationLog("", "删除学生", "失败");
		this.userService.BatchDelete(batchID);
		this.studentService.delete(batchID);
		operation.setState("成功");
		try {
			ologService.add(request, operation);
		} catch (DataException e) {
			e.printStackTrace();
		}
		return paginAll();
	}

	/**
	 * 修改、两个表同时修改
	 * 
	 * @return
	 */
	public String update() {
		OperationLog operation = new OperationLog("", "修改学生", "失败");
		student.setUser(student.getStuNo());
		student.setRole("0203");
		user.setId(userID);
		user.setRole("0203");
		user.setAccount(student.getStuNo());
		user.setPassword(password);
		user.setName(name);
		user.setSex(sex);
		user.setAge(age);
		user.setPid(pid);
		this.studentService.update(student, user);
		operation.setState("成功");
		try {
			ologService.add(request, operation);
		} catch (DataException e) {
			e.printStackTrace(); 
		}
		student = null;
		user = null;
		return paginAll();
	}

	/**
	 * 查全部、多条件查询
	 * 
	 * @return
	 */
	public String paginAll() {
		majorList = this.majorService.getAllCode();
		sexList = this.codeService.getSex();
		stateList = this.codeService.getStudentState();
		if(stuName!=null && stuName!="" && no!=null && no!=""){
			user.setName(stuName);
			student.setStuNo(no);
		}
		this.studentService.paginSearchStudent(paginMap, student, user);
		return GETALL_STUDENT;
	}

	/**
	 * 详情
	 * 
	 * @return
	 */
	public String details() {
		studentMap = this.studentService.stuNobyMap(student.getStuNo());
		return DETAILS_STUDENT;
	}

	/**
	 * 重置密码
	 * 
	 * @return
	 */
	public String resetPwd() {
		int count = userService.resetPwd(account);
		if (count > 0) {
			return paginAll();
		} else {
			return ERROR;
		}
	}

	/**
	 * 根据stuNo查学生
	 * 
	 * @return
	 */
	public String getStuByNo() {
		studentMap = this.studentService.stuNobyMap(student.getStuNo());
		majorList = this.majorService.getAllCode();
		sexList = this.codeService.getSex();
		stateList = this.codeService.getStudentState();
		return BYNO_STUDENT;
	}

	/**
	 * 获取文件流
	 * @Author 陈彦磊
	 * @DateTime 2018年8月18日-下午6:10:03
	 * @Description 作用描述
	 * 
	 * @return
	 */
	public InputStream getInputStream() throws Exception {
		// 返回这个输入流给struts
		return studentService.export();
	}

	public String download() {
		return INPUT;
	}

	/**
	 * 上传文件
	 * @Author 陈彦磊
	 * @DateTime 2018年8月19日-上午3:45:31
	 * @Description 作用描述
	 *
	 * @return
	 */
	public String upload() {
		listMapData = studentService.importStduent(file,request);
		return "importPage";
	}

	public String batchInsert() {
		boolean batchInsert = studentService.batchInsert(file,request);
		message = batchInsert ? "保存成功" : "保存失败";
		return "importPage";
	}
	/**
	 * 获取某班学生信息
	 * @Author 陈彦磊
	 * @DateTime 2018年8月19日-下午10:40:34
	 * @Description 作用描述
	 * @return
	 */
	public String oneClassStudents() {
		studentService.getStudentsByClass(student.getClassNo());
		return "classStu";
	}
	
	// get、set方法
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Code getCode() {
		return code;
	}

	public void setCode(Code code) {
		this.code = code;
	}

	public List<Code> getSexList() {
		return sexList;
	}

	public void setSexList(List<Code> sexList) {
		this.sexList = sexList;
	}

	public List<Major> getMajorList() {
		return majorList;
	}

	public void setMajorList(List<Major> majorList) {
		this.majorList = majorList;
	}

	public List<Code> getStateList() {
		return stateList;
	}

	public void setStateList(List<Code> stateList) {
		this.stateList = stateList;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public Map<String, Object> getStudentMap() {
		return studentMap;
	}

	public void setStudentMap(Map<String, Object> studentMap) {
		this.studentMap = studentMap;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String[] getBatchID() {
		return batchID;
	}

	public void setBatchID(String[] batchID) {
		this.batchID = batchID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
	

}
