/**
 * @2016-2016年11月14日-下午5:01:50
 * @ Niklaus Mikaelson 
 * @BlogContent.java
 */
package mikaleson.mysql_connection_test.com.julie.blog.entity;

/**
 * @BlogContent
 */
public class BlogContent {
	
	private Long id ;
	private Long blogId ;
	private int contentType ; //0 text, 1 image , 2 video , 3 other
	private String content ;
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
	 * @return the blogId
	 */
	public Long getBlogId() {
		return blogId;
	}
	/**
	 * @param blogId the blogId to set
	 */
	public void setBlogId(Long blogId) {
		this.blogId = blogId;
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
