/**
 * @2016-2016年11月15日-下午4:09:47
 * @ Niklaus Mikaelson 
 * @CommonUtil.java
 */
package mikaleson.mysql_connection_test.com.julie.base.common;

import java.util.Map;

/**
 * @CommonUtil
 */
public final  class CommonUtil {
	
	public static Map<Long,String > users ;
	
	public final static void validateUser(Long userId) {
		
		String token = users.get(userId) ;
//		if(token!=null&&token) {
//			
//		}
		
	}
	
	
//	public final static boolean expired() {
//		
//	}
	
	private CommonUtil() {
		
	}

}
