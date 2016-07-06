package com.xsy.architecture1.customermgr.dao;

import org.springframework.stereotype.Repository;

import com.xsy.architecture1.common.dao.BaseDAO;
import com.xsy.architecture1.customermgr.vo.CustomerModel;
import com.xsy.architecture1.customermgr.vo.CustomerQueryModel;


@Repository
public interface CustomerDAO extends BaseDAO<CustomerModel,CustomerQueryModel>{
	
}
