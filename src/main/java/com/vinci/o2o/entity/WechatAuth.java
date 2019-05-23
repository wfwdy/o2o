package com.vinci.o2o.entity;

import java.io.Serializable;
import java.util.Date;

public class WechatAuth implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -773928589157220572L;
	
	private Long wechatAuthId;
	private String  openId;
	private Date createTime;
	private personInfo personInfo;
	public Long getWechatAuthId() {
		return wechatAuthId;
	}
	public void setWechatAuthId(Long wechatAuthId) {
		this.wechatAuthId = wechatAuthId;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public personInfo getPersonInfo() {
		return personInfo;
	}
	public void setPersonInfo(personInfo personInfo) {
		this.personInfo = personInfo;
	}
	@Override
	public String toString() {
		return "WechatAuth [wechatAuthId=" + wechatAuthId + ", openId=" + openId + ", personInfo=" + personInfo + "]";
	}
	
}
