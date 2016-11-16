/**
 * @2016-2016年11月15日-下午3:57:46
 * @ Niklaus Mikaelson 
 * @BaseDto.java
 */
package mikaleson.mysql_connection_test.com.julie.base.dto;

/**
 * @BaseDto
 */
public class BaseDto {
	
	private Long userId ;
	private String token ;
	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}
	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}
	
	
	

}
