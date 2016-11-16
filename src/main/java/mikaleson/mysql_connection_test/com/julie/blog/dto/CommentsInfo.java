/**
 * @2016-2016年11月15日-下午3:57:14
 * @ Niklaus Mikaelson 
 * @CommentsInfo.java
 */
package mikaleson.mysql_connection_test.com.julie.blog.dto;

import mikaleson.mysql_connection_test.com.julie.base.dto.BaseDto;

/**
 * @CommentsInfo
 */
public class CommentsInfo extends BaseDto{
	
	private int type ;
	private String content ;
	private Long objectFileId ;
	
	/**
	 * @return the objectFileId
	 */
	public Long getObjectFileId() {
		return objectFileId;
	}
	/**
	 * @param objectFileId the objectFileId to set
	 */
	public void setObjectFileId(Long objectFileId) {
		this.objectFileId = objectFileId;
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
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	
	

}
