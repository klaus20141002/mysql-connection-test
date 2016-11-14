/**
 * @2016-2016年11月14日-下午5:16:08
 * @ Niklaus Mikaelson 
 * @Comment.java
 */
package mikaleson.mysql_connection_test.com.julie.blog.entity;

import mikaleson.mysql_connection_test.com.julie.base.entity.BaseEntity;

/**
 * @Comment
 */
public class Comment extends BaseEntity{
	private Long id ;
	private int type ; // 0 blog , 1 dynamic
	private int contentType ;// 0 normal , 1 image , 2 video
	private String content ;
	private String contentId ;
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
	 * @return the contentType
	 */
	public int getContentType() {
		return contentType;
	}
	/**
	 * @param contentType the contentType to set
	 */
	public void setContentType(int contentType) {
		this.contentType = contentType;
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
	/**
	 * @return the contentId
	 */
	public String getContentId() {
		return contentId;
	}
	/**
	 * @param contentId the contentId to set
	 */
	public void setContentId(String contentId) {
		this.contentId = contentId;
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
