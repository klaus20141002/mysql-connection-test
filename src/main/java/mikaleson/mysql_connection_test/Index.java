/**
 * @2016-2016年11月3日-下午4:32:09
 * @ Niklaus Mikaelson 
 * @Index.java
 */
package mikaleson.mysql_connection_test;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Index
 */

@Controller
public class Index {
	private static final String LOGGED_IN = "logged_in";
	final Logger log = Logger.getLogger(this.getClass()) ;

	@Autowired
	JavaMailSender sender;
	@RequestMapping({ "/"})
	public String index(HttpSession session) {
		System.out.println(session.getAttribute(LOGGED_IN));
		if (session.getAttribute(LOGGED_IN) == null) {
	        return "redirect:/login";
	    }
		
		
		System.out.println("hello world");
		
		return "index";
	}


	@RequestMapping("/send/{email}")
	@ResponseBody
	public String email(@PathVariable("email") String email) {
		log.error(email);
		MimeMessage mail = sender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(mail, true);
			helper.setTo(email+".com");
			helper.setSubject("Lorem ipsum");
			helper.setFrom("love20141002@126.com");
			helper.setText("Lorem ipsum dolor sit amet [...]");
		} catch (MessagingException e) {
			e.printStackTrace();
		} finally {
		}
		sender.send(mail);
		return "index";
	}
	
	
	
	
	

    
    private boolean verify( String username, String password) {
        return "admin".equals(username) && "password".equals(password);
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model,HttpSession session) {
    	
    	System.out.println("going to login page...........");
    	return "login" ;
    
    }
    

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session, String url) {
    	System.out.println("param is :"+username+password);
        if (session.getAttribute(LOGGED_IN) != null) {
            return "redirect:/";
        }
        if (!verify(username, password)) {
            return "login";
        }
        session.setAttribute(LOGGED_IN, true);
        return "redirect:/"+(StringUtils.isEmpty(url)||"null".equalsIgnoreCase(url)?"":url);
    }
    
    @RequestMapping(value = "/logout", method = { RequestMethod.GET, RequestMethod.POST})
    public String logout(HttpSession session) {
        session.removeAttribute(LOGGED_IN);
        return "redirect:/";
    }
	
	
	
	
	
	
}




class Entry {
    public String title;
    public String text;

    public Entry() {
    }

    public Entry(String title, String text) {
        this.title = title;
        this.text = text;
    }
}