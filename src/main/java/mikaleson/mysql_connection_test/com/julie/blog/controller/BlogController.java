/**
 * @2016-2016年11月14日-下午4:59:15
 * @ Niklaus Mikaelson 
 * @BlogController.java
 */
package mikaleson.mysql_connection_test.com.julie.blog.controller;

import mikaleson.mysql_connection_test.com.julie.blog.dto.CommentsInfo;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @BlogController
 */
@Controller
@RequestMapping("/b")
public class BlogController {
	
	
	public final Logger logger = Logger.getLogger(BlogController.class) ;
	
	@RequestMapping(method = RequestMethod.GET)
	public String blogs(Model model) {
		
		logger.info("show blog list");
		
		model.addAttribute("blogs", "blogs" ) ;
		
		return "blog/list-blog";
	}
	
	
	
	
	
	
	@RequestMapping(value="",method=RequestMethod.POST)
	private String commentBlog(@RequestBody CommentsInfo comments, Long blogId, Long userId) {
//		CommonUtil.validateUser(userId);
		
		
		
		return "";
	}
	

}
