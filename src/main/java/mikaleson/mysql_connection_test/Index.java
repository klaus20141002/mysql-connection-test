/**
 * @2016-2016年11月3日-下午4:32:09
 * @ Niklaus Mikaelson 
 * @Index.java
 */
package mikaleson.mysql_connection_test;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Index
 */

@Controller
public class Index {
	
	final Logger log = Logger.getLogger(this.getClass()) ;

	@Autowired
	JavaMailSender sender;
	@RequestMapping({ "/", "/index" })
	@ResponseBody
	public String index() {
		return "index , welcome";
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
		return "index , welcome";
	}
}
