/**
 * @2016-2016年11月21日-下午2:47:07
 * @ Niklaus Mikaelson 
 * @UserInfoDto.java
 */
package mikaleson.mysql_connection_test.com.julie.user.dto;

/**
 * @UserInfoDto
 */
public class UserInfoDto {
	
	private String nickname ;
	private Long userId;
	private String token ;
	
	private Long coverPicture;
	
	
	
	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
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
	/**
	 * @return the coverPicture
	 */
	public Long getCoverPicture() {
		return coverPicture;
	}
	/**
	 * @param coverPicture the coverPicture to set
	 */
	public void setCoverPicture(Long coverPicture) {
		this.coverPicture = coverPicture;
	}
	
	
	
	
	

}
