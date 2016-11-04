/**
 * @2016-2016年11月3日-下午4:46:07
 * @ Niklaus Mikaelson 
 * @MailController.java
 */
package mikaleson.mysql_connection_test.com.niklaus.mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @MailController
 */
@Controller
@RequestMapping("/mail")
public class MailController {

	@Autowired
	JavaMailSender mailSender;

	@RequestMapping("/sendemail")
	@ResponseBody
	public String send() throws MessagingException {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		helper.setTo("niklausjulie@gmail.com");
		helper.setText("Thank you for ordering!");
		mailSender.send(message);
		return "success" ;
	}
	
	
	
	@ResponseBody
	public String email() throws MessagingException {
		System.out.println("send email .....");
		return "email" ;
	}
	
}
