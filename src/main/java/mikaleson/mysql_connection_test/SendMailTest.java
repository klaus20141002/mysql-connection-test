package mikaleson.mysql_connection_test;

import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

public class SendMailTest {
	public static void main(String[] args) throws Exception {

		String title = "邮件主题";// 所发送邮件的标题
		String from = "love20141002@126.com";// 从那里发送
		String sendTo[] = { "love20141002@126.com", "1309570391@qq.com","niklausjulie@gmail.com" };// 发送到那里
		// 邮件的文本内容，可以包含html标记则显示为html页面
		String content = "mail test!!!!!!<br><a href=#>aaa</a>";
		// 所包含的附件，及附件的重新命名
		String fileNames[] = { "D:\\test.txt,test.txt", "D:\\test2.txt,哈哈.txt" };
		// MailSender mailsender = new MailSender();
		sendmail(title, from, sendTo, content, fileNames,
				"text/html;charset=gb2312");

	}

	@SuppressWarnings("static-access")
	public static void sendmail(String subject, String from, String[] to,
			String text, String[] filenames, String mimeType) throws Exception {
		// ResourceBundle mailProps = ResourceBundle.getBundle("mail");
		// 可以从配置文件读取相应的参数
		Properties props = new Properties();

		String smtp = "smtp.126.com"; // 设置发送邮件所用到的smtp
		String servername = "love20141002@126.com";
		String serverpaswd = "CapgeminiKl@us";

		javax.mail.Session mailSession; // 邮件会话对象
		javax.mail.internet.MimeMessage mimeMsg; // MIME邮件对象

		props = java.lang.System.getProperties(); // 获得系统属性对象
		props.put("mail.smtp.host", smtp); // 设置SMTP主机
		props.put("mail.smtp.auth", "true"); // 是否到服务器用户名和密码验证
		// 到服务器验证发送的用户名和密码是否正确
		Email_Autherticatorbean myEmailAuther = new Email_Autherticatorbean(
				servername, serverpaswd);
		// 设置邮件会话
		mailSession = javax.mail.Session.getInstance(props,
				(Authenticator) myEmailAuther);

		// 设置debug打印信息
		mailSession.setDebug(true);

		// 设置传输协议
		javax.mail.Transport transport = mailSession.getTransport("smtp");
		// 设置from、to等信息
		mimeMsg = new javax.mail.internet.MimeMessage(mailSession);
		if (!from.isEmpty()) {

			InternetAddress sentFrom = new InternetAddress(from);
			mimeMsg.setFrom(sentFrom); // 设置发送人地址
		}

		InternetAddress[] sendTo = new InternetAddress[to.length];
		for (int i = 0; i < to.length; i++) {
			System.out.println("发送到:" + to[i]);
			sendTo[i] = new InternetAddress(to[i]);
		}

		mimeMsg.setRecipients(javax.mail.internet.MimeMessage.RecipientType.TO,
				sendTo);
		mimeMsg.setSubject(subject, "gb2312");

		MimeBodyPart messageBodyPart1 = new MimeBodyPart();
		// messageBodyPart.setText(UnicodeToChinese(text));
		messageBodyPart1.setContent(text, mimeType);

		Multipart multipart = new MimeMultipart();// 附件传输格式
		multipart.addBodyPart(messageBodyPart1);

		for (int i = 0; i < filenames.length; i++) {
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();
			// 选择出每一个附件名
			String filename = filenames[i].split(",")[0];
			System.out.println("附件名：" + filename);
			String displayname = filenames[i].split(",")[1];
			// 得到数据源
			FileDataSource fds = new FileDataSource(filename);
			// 得到附件本身并至入BodyPart
			messageBodyPart2.setDataHandler(new DataHandler(fds));
			// 得到文件名同样至入BodyPart
			// messageBodyPart2.setFileName(displayname);
			// messageBodyPart2.setFileName(fds.getName());
			messageBodyPart2.setFileName(MimeUtility.encodeText(displayname));
			multipart.addBodyPart(messageBodyPart2);
		}
		mimeMsg.setContent(multipart);
		// 设置信件头的发送日期
		mimeMsg.setSentDate(new Date());
		mimeMsg.saveChanges();
		// 发送邮件
		transport.send(mimeMsg);
		transport.close();
	}

}

class Email_Autherticatorbean extends Authenticator {
	private String m_username = null;
	private String m_userpass = null;

	public void setUsername(String username) {
		m_username = username;
	}

	public void setUserpass(String userpass) {
		m_userpass = userpass;
	}

	public Email_Autherticatorbean(String username, String userpass) {
		super();
		setUsername(username);
		setUserpass(userpass);

	}

	public PasswordAuthentication getPasswordAuthentication() {

		return new PasswordAuthentication(m_username, m_userpass);
	}
}