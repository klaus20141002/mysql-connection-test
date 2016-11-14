/**
 * @2016-2016年11月14日-下午5:00:25
 * @ Niklaus Mikaelson 
 * @Blog.java
 */
package mikaleson.mysql_connection_test.com.julie.blog.entity;

import mikaleson.mysql_connection_test.com.julie.base.entity.BaseEntity;

/**
 * @Blog
 */
public class Blog extends BaseEntity{
	private Long id ;
	private int like ;
	private int hate ;
	private int forward  ;
	private int comments ;
	
	private Long author ;

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
	 * @return the like
	 */
	public int getLike() {
		return like;
	}

	/**
	 * @param like the like to set
	 */
	public void setLike(int like) {
		this.like = like;
	}

	/**
	 * @return the hate
	 */
	public int getHate() {
		return hate;
	}

	/**
	 * @param hate the hate to set
	 */
	public void setHate(int hate) {
		this.hate = hate;
	}

	/**
	 * @return the forward
	 */
	public int getForward() {
		return forward;
	}

	/**
	 * @param forward the forward to set
	 */
	public void setForward(int forward) {
		this.forward = forward;
	}

	/**
	 * @return the comments
	 */
	public int getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(int comments) {
		this.comments = comments;
	}

	/**
	 * @return the author
	 */
	public Long getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(Long author) {
		this.author = author;
	}
	
	
	
}
