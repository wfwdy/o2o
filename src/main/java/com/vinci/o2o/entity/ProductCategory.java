package com.vinci.o2o.entity;

import java.io.Serializable;
import java.util.Date;

public class ProductCategory implements Serializable {
	private Long productCategory;
	private Long shopId;
	private String productCategoryName;
	private Integer priority;
	private Date createTime;
	public Long getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(Long productCategory) {
		this.productCategory = productCategory;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public String getProductCategoryName() {
		return productCategoryName;
	}
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "ProductCategory [productCategory=" + productCategory + ", shopId=" + shopId + ", productCategoryName="
				+ productCategoryName + ", priority=" + priority + "]";
	}
	 
}
