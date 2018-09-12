package com.evaluationmanager.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.evaluationmanager.entiy.Class;
import com.evaluationmanager.entiy.OperationLog;
import com.evaluationmanager.exception.DataException;
import com.evaluationmanager.service.ClassService;
import com.evaluationmanager.service.OlogService;
import com.evaluationmanager.service.StudentService;
import com.evaluationmanager.support.Action;
/**
 * 
 * @author 耿佳康
 * @date 2018年7月27日-下午3:22:15
 * @description 班级信息操作action类
 */
@Controller("classAction")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ClassAction extends Action<Class>{
	@Autowired
    private ClassService classService;
	@Autowired
	private StudentService studentService;
	@Autowired
    private OlogService ologService;
	private Map<String, Object> classMap;
	private List<Map<String, Object>> classmapList;
	private List<Map<String, Object>> studentmapList;
	private List<Class> classList;
    private Class classes;
    HttpServletRequest request = ServletActionContext.getRequest();
    //批量
  	private String[] batchID;
  	//提示消息
  	private String message;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Class getModel() {
		if (classes==null) {
			classes=new Class();
		}
		return classes;
	}
	
   public ClassService getClassService() {
		return classService;
	}

	public void setClassService(ClassService classService) {
		this.classService = classService;
	}

	public Map<String, Object> getClassMap() {
		return classMap;
	}

	public void setClassMap(Map<String, Object> classMap) {
		this.classMap = classMap;
	}

	public List<Map<String, Object>> getClassmapList() {
		return classmapList;
	}

	public void setClassmapList(List<Map<String, Object>> classmapList) {
		this.classmapList = classmapList;
	}

	public List<Class> getClassList() {
		return classList;
	}

	public void setClassList(List<Class> classList) {
		this.classList = classList;
	}

	public Class getClasses() {
		return classes;
	}

	public void setClasses(Class classes) {
		this.classes = classes;
	}
    public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

    public List<Map<String, Object>> getStudentmapList() {
		return studentmapList;
	}

	public void setStudentmapList(List<Map<String, Object>> studentmapList) {
		this.studentmapList = studentmapList;
	}

public String[] getBatchID() {
		return batchID;
	}

	public void setBatchID(String[] batchID) {
		this.batchID = batchID;
	}
	

public OlogService getOlogService() {
		return ologService;
	}

	public void setOlogService(OlogService ologService) {
		this.ologService = ologService;
	}

public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

/**
 * 单个添加班级
 * @return
 */
public String add(){
	   //JSON_CHAR_DATA = super.gson.toJson(classService.add(classes));
	   //return JSONOCHAR;
	classService.add(classes);
	return "add";
   }

/**
 * 修改班级
 * @return
 */
   public String update(){
	   Class updateClass = classService.update(classes);
	   if (updateClass!=null) {
		return "updateClass";
	   }else{
		return "error";
	   }
   }
  /**
   * 
   * 删除、批量删除 
   * @return
   */
   public String delete(){
	   if (batchID!=null&&batchID.length>0) {
		   System.out.println("*************:"+batchID.length);
		      int batchDelete = classService.BatchDelete(batchID);
		      //OperationLog operation = new OperationLog("","删除班级","失败");
		      if (batchDelete!=0) {
		    	  System.out.println("删除班级成功");
		    	  message="删除班级成功";
//		    	  operation.setState("成功");
//		    	  try {
//		  			ologService.add(request, operation);
//		  		} catch (DataException e) {
//		  			e.printStackTrace();
//		  		}
				  
			}else{
				 System.out.println("删除班级失败");
				 message="要删除的班级下存在学生，删除班级失败";
//				 try {
//						ologService.add(request, operation);
//					} catch (DataException e) {
//						e.printStackTrace();
//					}
				
			}
//		  	System.out.println(paginMap);
//		  	System.out.println("****************"+classes);
//		  	classmapList=classService.paginSearch(paginMap, classes);
//		    Map<String, Object> map=new HashMap<>();
//		    map.put("classes", classmapList);
//		    //添加标识
//		    map.put("count",batchDelete);
//		    JSON_CHAR_DATA=super.gson.toJson(map);
	}
//	   else{
//		 message="请勾选数据";
//	}
	   
  	  return "del";
   }
   /**
    * 根据班级编号查询班级
    * @return
    */
  public String ClassMap(){
	  classMap=classService.classbyNo(classes.getClassNo());
	  Map<String, Object> map= new HashMap<>();
	  map.put("classes", classMap);
	  JSON_CHAR_DATA = super.gson.toJson(map);
	  return JSONOCHAR;
  }
  /**
   * 查询全部班级
   * @return
   */
  public String ClassMapList(){
	  classmapList=classService.classMapList();
	  System.out.println(classmapList.size());
	  Map<String, Object> map=new HashMap<>();
	  map.put("classes", classmapList);
	  map.put("size",classmapList.size());
	  JSON_CHAR_DATA = super.gson.toJson(map);
	  //return "allClass";
	  return JSONOCHAR;
  }
  /**
   * 分页条件查询
   * @return
   */
  public String search(){
  	System.out.println(paginMap);
  	System.out.println("****************"+classes);
  	classmapList=classService.paginSearch(paginMap, classes);
  	Map<String, Object> map=new HashMap<>();
      map.put("classes", classmapList);
      map.put("pagin", paginMap);
      JSON_CHAR_DATA = super.gson.toJson(map);
  	return JSONOCHAR;
  } 
  public String getStudentByclassNo(){
	  System.out.println("***********************"+classes.getClassNo());
	  studentmapList=studentService.classNobyMap(classes.getClassNo());
	  if (studentmapList.size()>0) {
		  Map<String, Object> map=new HashMap<>();
		  map.put("student", studentmapList);
		  JSON_CHAR_DATA=super.gson.toJson(map);
	  }
	  Map<String, Object> map=new HashMap<>();
	  map.put("student", studentmapList);
	  JSON_CHAR_DATA=super.gson.toJson(map);
	  return JSONOCHAR;
  }
 public String renameClassbyNo(){
	 boolean hasClass = classService.renameClassbyNo(classes.getClassNo());
	 if (hasClass==true) {
		 JSON_CHAR_DATA = 0+"";		
	}else{
	     JSON_CHAR_DATA = 1+"";
	 }
	 return JSONOCHAR;
 }
 public String classByMajor(){
	 classmapList=classService.classByMajor(classes.getMajor());
	 Map<String, Object> map=new HashMap<>();
	 map.put("classes",classmapList);
	 JSON_CHAR_DATA=super.gson.toJson(map);
	 return JSONOCHAR;
 }
 /**
  * 根据专业获取班级
  * @Author 陈彦磊
  * @DateTime 2018年8月19日-下午10:41:00
  * @Description 作用描述
  *
  * @return
  */
 public String getClassByMajor() {
	 classmapList = classService.classByMajor(classes.getMajor());
	 System.err.println(classmapList);
	 return "select";
 }
 /**
  * 根据ID查询班级信息
  * @return
  */
 public String classById(){
	 System.out.println("根据班级id查询："+classes.getId());
	 classMap=classService.classById(classes.getId());
	 Map<String, Object> map=new HashMap<>();
	 map.put("classes", classMap);
	 JSON_CHAR_DATA=super.gson.toJson(map);
	 return JSONOCHAR;
 }
  
}
