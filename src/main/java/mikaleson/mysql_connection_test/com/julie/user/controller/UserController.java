/**
 * @2016-2016年11月14日-下午5:17:12
 * @ Niklaus Mikaelson 
 * @UserController.java
 */
package mikaleson.mysql_connection_test.com.julie.user.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @UserController
 */

@Controller("/u")
public class UserController {
	
	final Logger log = Logger.getLogger(this.getClass()) ;
	
	@RequestMapping("/profile/{id}")
	public String profile(@PathVariable(value="id") String id, Model model) {
		log.info("query user info , id is : "+id);
		
		
		
		
		
		model.addAttribute("userInfo", "userinfo") ;
		
		
		
		
		
		return "user/profile";
	}
	
	

}
