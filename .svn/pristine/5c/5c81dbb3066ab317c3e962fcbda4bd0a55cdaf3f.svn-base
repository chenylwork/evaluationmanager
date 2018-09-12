package com.evaluationmanager.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.evaluationmanager.entiy.Code;
import com.evaluationmanager.entiy.Evaluation;
import com.evaluationmanager.entiy.Major;
import com.evaluationmanager.entiy.view.EvaluationView;
import com.evaluationmanager.service.CodeService;
import com.evaluationmanager.service.DepartmentService;
import com.evaluationmanager.service.EvaluationService;
import com.evaluationmanager.service.MajorService;
import com.evaluationmanager.support.Action;

/**
 * @Author 陈彦磊
 * @DateTime 2018年8月23日-下午5:20:48
 * @Description 测评请求action
 */
@Controller("evaluationAction")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class EvaluationAction extends Action<Evaluation>  {

	private static final long serialVersionUID = -6903287325220265172L;
	private Evaluation evaluation = new Evaluation();
	private EvaluationView evaluationView = new EvaluationView();
	@Autowired
	private EvaluationService evaluationService;
	@Autowired
	private CodeService codeService;
	@Autowired
	private MajorService majorService;
	@Autowired
	private DepartmentService departmentService;
	
	private List<Code> paperTypeList;
	private List<Major> majorList;
	private List<Code> deptList;

	@Override
	public Evaluation getModel() {
		return evaluation;
	}
	/**
	 * 添加evaluation信息
	 * @Author 陈彦磊
	 * @DateTime 2018年8月24日-上午2:39:02
	 *
	 * @return
	 */
	public String add() {
		System.out.println(evaluation);
		JSON_CHAR_DATA = evaluationService.insertEvaluation(evaluation) ? "1" : "添加失败";
		return JSONOCHAR;
	}
	/**
	 * 查询测评全部信息
	 * @Author 韩笑
	 * @return
	 */
	public String paginAll(){
		paperTypeList = this.codeService.getPaperType();
		this.evaluationService.paginSearchEvaluation(paginMap, evaluationView);
		return "getall";
	}
	
	/**
	 * 测评统计
	 * @return
	 */
	public String cartogram(){
		majorList = this.majorService.getAllCode();
		deptList = this.departmentService.getAllDeptNo();
		return "cartogram";
	}
	
	
	//get、set方法
	
	public Evaluation getEvaluation() {
		return evaluation;
	}
	public List<Code> getPaperTypeList() {
		return paperTypeList;
	}
	public void setPaperTypeList(List<Code> paperTypeList) {
		this.paperTypeList = paperTypeList;
	}
	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}
	public List<Major> getMajorList() {
		return majorList;
	}
	public void setMajorList(List<Major> majorList) {
		this.majorList = majorList;
	}
	public List<Code> getDeptList() {
		return deptList;
	}
	public void setDeptList(List<Code> deptList) {
		this.deptList = deptList;
	}
	public EvaluationView getEvaluationView() {
		return evaluationView;
	}
	public void setEvaluationView(EvaluationView evaluationView) {
		this.evaluationView = evaluationView;
	}
	
}
