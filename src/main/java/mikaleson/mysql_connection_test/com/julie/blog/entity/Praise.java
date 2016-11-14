/**
 * @2016-2016年11月14日-下午5:09:00
 * @ Niklaus Mikaelson 
 * @Praise.java
 */
package mikaleson.mysql_connection_test.com.julie.blog.entity;

import mikaleson.mysql_connection_test.com.julie.base.entity.BaseEntity;

/**
 * @Praise
 */
public class Praise extends BaseEntity{
	
	private Long id ;
	private int type ; // 0 blog , 1 dynamic
	private Long objectId ;
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
	 * @return the type
	 */
	public int getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}
	/**
	 * @return the objectId
	 */
	public Long getObjectId() {
		return objectId;
	}
	/**
	 * @param objectId the objectId to set
	 */
	public void setObjectId(Long objectId) {
		this.objectId = objectId;
	}
	
	

}
