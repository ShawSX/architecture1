package com.xsy.architecture1.common.pageutil;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class Page<E> implements Serializable {

	private static final long serialVersionUID = 5599632798780L;

	// pagesize ，每一页显示记录数
	private int showCount = 2;
	// 总页数
	private int totalPage;
	// 总记录数
	private int totalResult;
	// 当前页
	private int currentPage;
	// 排序字段
	private String sortField;
	// 排序方式
	private String order;
	//查询结果
	private List<E> result = Collections.emptyList();
	
	public int getShowCount() {
		return showCount;
	}

	public void setShowCount(int showCount) {
		this.showCount = showCount;
	}
	public int getTotalPage(){
		return totalPage;
	}
	

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalResult() {
		return totalResult;
	}

	public void setTotalResult(int totalResult) {
		this.totalResult = totalResult;
	}

	public int getCurrentPage() {
		if(currentPage <= 0){
			currentPage = 1;
		}
		if(currentPage > getTotalPage()){
			currentPage = getTotalPage();
		}
		return currentPage;
	}
	
	public String getSortField() {
		return sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public List<E> getResult() {
		return result;
	}

	public void setResult(List<E> result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Page [showCount=" + showCount + ", totalPage=" + totalPage + ", totalResult=" + totalResult
				+ ", currentPage=" + currentPage + ", sortField=" + sortField + ", order=" + order + ", result="
				+ result + "]";
	}

	
	
}
