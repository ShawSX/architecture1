package com.xsy.architecture1.common.service;

import com.xsy.architecture1.common.pageutil.Page;
import com.xsy.architecture1.common.vo.BaseModel;

public interface IBaseService<M,QM extends BaseModel> {
	public void add(M m);
	public void remove(int id);
	public void update(M m);
	
	public M findById(int id);
	public Page<M> listModelPage(QM qm);
}
