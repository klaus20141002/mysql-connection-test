/**
 * @2016-2016年11月14日-下午5:28:24
 * @ Niklaus Mikaelson 
 * @UserSetting.java
 */
package mikaleson.mysql_connection_test.com.julie.user.entity;

/**
 * @UserSetting
 */
public class UserSetting {
	private Long id  ;
	
	private Long userId ;
	
	private String phone ;
	private String email ;
	private String firstName ;
	private String lastName ;
	private String nickName ;
	private String token ;
	
	//0 normal, 1 QQ , 2 Wechat , 3, weibo ,4 TM, 5 google, 6 facebook , 7 twitter, 8 github, 9 other
	private int userChannel ;
	
	private String otherPartyAccount ;
	private String otherPartyNickname ;
	private String otherPartyToken ;
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
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}
	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
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
	 * @return the userChannel
	 */
	public int getUserChannel() {
		return userChannel;
	}
	/**
	 * @param userChannel the userChannel to set
	 */
	public void setUserChannel(int userChannel) {
		this.userChannel = userChannel;
	}
	/**
	 * @return the otherPartyAccount
	 */
	public String getOtherPartyAccount() {
		return otherPartyAccount;
	}
	/**
	 * @param otherPartyAccount the otherPartyAccount to set
	 */
	public void setOtherPartyAccount(String otherPartyAccount) {
		this.otherPartyAccount = otherPartyAccount;
	}
	/**
	 * @return the otherPartyNickname
	 */
	public String getOtherPartyNickname() {
		return otherPartyNickname;
	}
	/**
	 * @param otherPartyNickname the otherPartyNickname to set
	 */
	public void setOtherPartyNickname(String otherPartyNickname) {
		this.otherPartyNickname = otherPartyNickname;
	}
	/**
	 * @return the otherPartyToken
	 */
	public String getOtherPartyToken() {
		return otherPartyToken;
	}
	/**
	 * @param otherPartyToken the otherPartyToken to set
	 */
	public void setOtherPartyToken(String otherPartyToken) {
		this.otherPartyToken = otherPartyToken;
	}
	
	
}
