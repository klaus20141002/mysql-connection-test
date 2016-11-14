/**
 * @2016-2016年11月14日-下午5:16:43
 * @ Niklaus Mikaelson 
 * @User.java
 */
package mikaleson.mysql_connection_test.com.julie.user.entity;

import java.util.Date;

/**
 * @User
 */
public class User {
	
	private Long id ;
	private String account ;
	private String password ;
	
	private int active ;// o normal , 1
	private int banType ;//0 normal , 1 ban 1day , 2 ban 1 week, 3 ban 30 days , 4 ban forever
	
	private Date lastLoginTime ;
	
	private int role ;// 0 normal user , 1 

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
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the active
	 */
	public int getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(int active) {
		this.active = active;
	}

	/**
	 * @return the banType
	 */
	public int getBanType() {
		return banType;
	}

	/**
	 * @param banType the banType to set
	 */
	public void setBanType(int banType) {
		this.banType = banType;
	}

	/**
	 * @return the lastLoginTime
	 */
	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	/**
	 * @param lastLoginTime the lastLoginTime to set
	 */
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	/**
	 * @return the role
	 */
	public int getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(int role) {
		this.role = role;
	}
	
	
	

}
