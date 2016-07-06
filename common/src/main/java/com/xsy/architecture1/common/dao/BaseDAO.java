package com.xsy.architecture1.common.dao;

import java.util.List;


public interface BaseDAO<M,QM> {
	public void add(M m);
	public void remove(int id);
	public void update(M m);
	
	public M findById(int id);
	public List<M> listModelPage(QM qm);
}
