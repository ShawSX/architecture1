package com.xsy.architecture1.common.vo;

import com.xsy.architecture1.common.pageutil.Page;

public class BaseModel {
	
	public BaseModel(){
		this.page = new Page();
	}
	
	private int id;
	
	private Page page;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}
	
	
}
