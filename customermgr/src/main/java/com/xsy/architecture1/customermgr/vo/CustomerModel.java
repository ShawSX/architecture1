package com.xsy.architecture1.customermgr.vo;

import com.xsy.architecture1.common.vo.BaseModel;

public class CustomerModel extends BaseModel{
	
	private String customerId;
	private String pwd;
	private String showName;
	private String trueName;
	private String regiterTime;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public String getRegiterTime() {
		return regiterTime;
	}
	public void setRegiterTime(String regiterTime) {
		this.regiterTime = regiterTime;
	}
	@Override
	public String toString() {
		return "CustomerModel [id=" + getId() + ", customerId=" + customerId + ", pwd=" + pwd + ", showName=" + showName
				+ ", trueName=" + trueName + ", regiterTime=" + regiterTime + "]";
	}
	
	
}
