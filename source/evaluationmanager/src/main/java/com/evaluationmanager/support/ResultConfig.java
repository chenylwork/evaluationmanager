package com.evaluationmanager.support;

public interface ResultConfig {
	/**
	 * 跳转登录返回配置
	 */
	static String LOGIN = "login";
	/**
	 * 返回信息为jsonzi字符串的配置返回
	 */
	static String JSONOCHAR = "json";
	/**
	 * 返回json数组
	 */
	static String JSONARRAY = "jsonArray";
	/**
	 * 
	 * @Author 陈彦磊
	 * @Datetime 2018年7月27日-下午2:09:23
	 * @Description 描述信息：paper模块的返回值
	 *
	 */
	/**
	 * 评教详细信息result返回值
	 */
	static String EVALUATION = "evaluation";
	/**
	 * 
	 * @Author 邢燕蕊
	 * @Datetime 2018年7月27日-下午2:09:23
	 * @Description 描述信息：student模块的返回值
	 *
	 */
	static String GETALL_STUDENT = "all";
	static String SELECT_TYPES = "seltype";
	static String DETAILS_STUDENT = "details";
	static String BYNO_STUDENT = "byNo";
	/**
	 * 
	 * @Author 邢燕蕊
	 * @Datetime 2018年7月27日-下午4:39:23
	 * @Description 描述信息：role模块的返回值
	 *
	 */
	static String GETALL_ROLE = "all";
	static String BYNO_ROLE = "byNo";
	static String SELECT_ROLE="selectType";

	/**
	 * @Author 张鼎瑜
	 * @DateTime 2018年7月27日-下午15:31:43
	 * @Description 定义Action类中方法的返回信息，用于Struts配置文件中的配置
	 */
	static String INSERT_DEPT = "addDept";
	static String DELETE_DEPT = "deleteDept";
	static String UPDATE_DEPT = "updateDept";
	static String ALL_DEPT = "allDept";
	static String MAJOR_DEPT = "majorDept";
	static String BYNO_DEPT = "noByDept";

	/**
	 * @author 韩笑
	 * @DateTime 2018年7月27日-下午14:35:10
	 *           定义TeacherAction类中方法的返回值信息，用于struts-teacher配置文件的配置
	 */
	static String SELECT_ADD = "addTea";
	static String UPDATE_TEACHER = "updateTea";
	static String SELECT_TEACHER = "selectTea";
	static String SELECT_TYPE = "selectType";
	static String TEACHER_DETAIL = "detail";
	static String UPDATE_SELECT = "updateSelect";
	static String EVALUATION_LIST = "evaluation_list";

	/**
	 * @author 韩笑
	 * @DateTime 2018年7月27日-下午16:20:26
	 *           定义OptionAction类中方法的返回值信息，用于struts-option配置文件的配置
	 */
	static String INSERT_OPTION = "addOpt";
	static String DELETE_OPTION = "deleteOpt";
	static String UPDATE_OPTION = "updateOpt";

	/**
	 * @author 韩笑
	 * @DateTime 2018年7月30日-下午10:54:09
	 *           定义PaperAction类中方法的返回值信息，用于struts-paper配置文件的配置
	 */
	static String INSERT_PAPER = "addPap";
	static String DELETE_PAPER = "deletePap";
	static String UPDATE_PAPER = "updatePap";
	static String RAND_PAPER = "randPap";
	static String GETALLQUES = "getAllQues";
	static String ALL_PAPER = "allPaper";
	/**
	 * @author 韩笑
	 * @DateTime 2018年8月09日-下午15:44:34
	 *           定义PowerAction类中方法的返回值信息，用于struts-power配置文件的配置
	 */
	static String GETALLROLE = "allRole";
	static String GETALLINFO = "allInfo";
	static String GETALLUSER = "allUser";
	static String ADDUSER = "addUser";
	static String ADDROLE = "addRole";
	static String AllPowerType = "allPt";
	static String AllPowerInfo = "allPi";
	static String UPDATEPR = "updatePr";
	static String ALLROLEANDINFO = "addall";

	/**
	 * @author 任少华
	 * @DateTime 2018年7月30日-上午11:10:10
	 *           定义MajorAction类中方法的返回值信息，用于struts-teacher配置文件的配置
	 */
	static String INSERT_MAJOR = "addMaj";
	static String DELETE_MAJOR = "deleteMaj";
	static String UPDATE_MAJOR = "updateMaj";
	static String DETAIL_MAJOR = "detail";
	static String GETBYID_MAJOR = "getByIdMaj";
	static String GETALL_MAJOR = "allMaj";
	/**
	 * 
	 * @Author 任少华
	 * @Datetime 2018年7月30日-下午2:45:23
	 * @Description 描述信息：LoginLog模块的返回值struts
	 *
	 */
	static String INSERT_LOGINLOG = "addLog";
	static String DELETE_LOGINLOG = "deleteLog";
	static String UPDATE_LOGINLOG = "updateLog";
	static String GETALL_LOGINLOG = "allLog";
	/**
	 * 
	 * @Author 任少华
	 * @Datetime 2018年7月30日-下午2:45:23
	 * @Description 描述信息：LoginLog模块的返回值struts
	 *
	 */
	static String INSERT_OPERATIONLOG = "addOlog";
	static String DELETE_OPERATIONLOG = "deleteOlog";
	static String UPDATE_OPERATIONLOG = "updateOlog";
	static String GETALL_OPERATIONLOG = "allOlog";

}
