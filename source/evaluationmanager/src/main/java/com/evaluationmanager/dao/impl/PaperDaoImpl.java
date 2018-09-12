package com.evaluationmanager.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.stereotype.Repository;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.dao.PaperDao;
import com.evaluationmanager.entiy.Paper;
import com.evaluationmanager.entiy.Question;
import com.evaluationmanager.entiy.view.PaperView;
import com.evaluationmanager.support.AbstractDataDao;
import com.evaluationmanager.support.DataDao;

/**
 * 
 * @Author 韩笑
 * @Datetime 2018年7月30日-上午10:39:58
 * @Description 描述信息：试卷操作实现类
 *
 */
@Repository("paperDao")
public class PaperDaoImpl extends AbstractDataDao<Paper> implements PaperDao {
	
	private String conditions;
	private List<String> paramsList;
	
	@Autowired
	private PaperViewDao paperViewDao;
	/**
	 * 试卷视图操作内部类
	 * @Author 陈彦磊
	 * @DateTime 2018年8月23日-上午2:10:00
	 * @Description 作用描述
	 *
	 */
	@Repository("paperViewDao")
	private class PaperViewDao extends AbstractDataDao<PaperView> implements DataDao<PaperView>{}
	
	@Override
	public List<Question> getRand() {
		return template.execute(new HibernateCallback<List<Question>>() {
			@Override
			public List<Question> doInHibernate(Session session) throws HibernateException {
				String hql = " from Question order by rand()";
				@SuppressWarnings("unchecked")
				Query<Question> createQuery = session.createQuery(hql);
				createQuery.setMaxResults(5);
				return createQuery.list();
			}
		});
	}
	public List<PaperView> getPaperInfo(String paperNo) {
		return paperViewDao.getDatas("this.paperNo = ?", paperNo);
	}

	@Override
	public List<Map<String, Object>> paginGetPaper(Pagin<Map<String, Object>> pagin, Paper paper) {
		initConditions(paper);
		return super.paginGetMapDatas(pagin, conditions, paramsList.toArray(new String[]{}));
	}

	public long size(Paper paper) {
		initConditions(paper);
		return super.size(conditions, paramsList.toArray(new String[]{}));
	}
	public void initConditions(Paper paper) {
		conditions = " 1=1";
		paramsList = new ArrayList<>();
		if (paper.getPaperNo() != null && !paper.getPaperNo().equals("")) {
			conditions += " and this.paperNo = ?";
			paramsList.add(paper.getPaperNo());
		}
		if (paper.getType() != null && !paper.getType().equals("")) {
			conditions += " and this.type = ?";
			paramsList.add(paper.getType());
		}
		if (paper.getDescription() != null && !paper.getDescription().equals("")) {
			conditions += " and this.description like ?";
			paramsList.add("%"+paper.getDescription()+"%");
		}
	}
}
