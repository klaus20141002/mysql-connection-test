/**
 * @2016-2016年11月3日-下午4:32:09
 * @ Niklaus Mikaelson 
 * @Index.java
 */
package mikaleson.mysql_connection_test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Index
 */

@Controller
public class Index {
	
	@RequestMapping({"/","/index"})
	@ResponseBody
	public String index() {
		return "index , welcome";
	}

}
