/**
 * @2016-2016年11月14日-下午5:23:09
 * @ Niklaus Mikaelson 
 * @Follower.java
 */
package mikaleson.mysql_connection_test.com.julie.user.entity;

import mikaleson.mysql_connection_test.com.julie.base.entity.BaseEntity;

/**
 * @Follower
 */
public class Follower extends BaseEntity{
	
	private Long id ;
	
	private Long sourId ; // 被关注者
	
	private Long destId ; //  关注者
	
	private int category ;  
	
	private int effective ;// 0 yes , 1 no

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the sourId
	 */
	public Long getSourId() {
		return sourId;
	}

	/**
	 * @param sourId the sourId to set
	 */
	public void setSourId(Long sourId) {
		this.sourId = sourId;
	}

	/**
	 * @return the destId
	 */
	public Long getDestId() {
		return destId;
	}

	/**
	 * @param destId the destId to set
	 */
	public void setDestId(Long destId) {
		this.destId = destId;
	}

	/**
	 * @return the category
	 */
	public int getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(int category) {
		this.category = category;
	}

	/**
	 * @return the effective
	 */
	public int getEffective() {
		return effective;
	}

	/**
	 * @param effective the effective to set
	 */
	public void setEffective(int effective) {
		this.effective = effective;
	}
	
	
	
	
	

}
