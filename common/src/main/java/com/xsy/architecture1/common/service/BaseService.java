package com.xsy.architecture1.common.service;

import java.util.List;

import com.xsy.architecture1.common.dao.BaseDAO;
import com.xsy.architecture1.common.pageutil.Page;
import com.xsy.architecture1.common.vo.BaseModel;

public class BaseService<M,QM extends BaseModel> implements IBaseService<M, QM> {
	
	private BaseDAO dao = null;
	//通过子类注入
	public void setDAO(BaseDAO dao){
		this.dao = dao;
	}
	
	public void add(M m) {
		dao.add(m);
	}

	public void remove(int id) {
		dao.remove(id);
	}

	public void update(M m) {
		dao.update(m);
	}

	public M findById(int id) {
		return (M) dao.findById(id);
	}

	@SuppressWarnings("unchecked")
	public Page<M> listModelPage(QM qm) {
		List<M> list =  dao.listModelPage(qm);
		qm.getPage().setResult(list);
		return qm.getPage();
	}

}
