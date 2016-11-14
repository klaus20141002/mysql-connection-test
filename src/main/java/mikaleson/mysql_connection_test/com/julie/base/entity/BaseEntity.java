/**
 * @2016-2016年11月14日-下午5:06:18
 * @ Niklaus Mikaelson 
 * @BaseEntity.java
 */
package mikaleson.mysql_connection_test.com.julie.base.entity;

import java.util.Date;

/**
 * @BaseEntity
 */
public class BaseEntity {
	
	private Date createDate ;
	private Date updateDate ;
	private Long createId ;
	private Long updateId ;
	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * @return the updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}
	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	/**
	 * @return the createId
	 */
	public Long getCreateId() {
		return createId;
	}
	/**
	 * @param createId the createId to set
	 */
	public void setCreateId(Long createId) {
		this.createId = createId;
	}
	/**
	 * @return the updateId
	 */
	public Long getUpdateId() {
		return updateId;
	}
	/**
	 * @param updateId the updateId to set
	 */
	public void setUpdateId(Long updateId) {
		this.updateId = updateId;
	}
	
	
	

}
