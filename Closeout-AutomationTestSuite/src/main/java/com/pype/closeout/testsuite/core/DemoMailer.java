package com.pype.closeout.testsuite.core;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class DemoMailer {

	public static void main(String args[]) throws IOException, EmailException {
		String subject = "Pype Closeout New Password Confirmed";
		String url = "C:\\Sandbox\\AutomationTestSuit\\test-output\\index.html";
		String content = FileUtil.getFileContent(url);
		try {
			SendEmail("kiran.surakanti@pype.io", "Kiran@21", content, true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Create an Attachment
	public void attachment(String desc)
	{
		EmailAttachment attachment = new EmailAttachment();
		attachment.setPath("C:\\Automation\\Closeout-AutomationTestSuite\\test-output\\recordings\\Logintest.mov");
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription(desc);
	}

	public static void SendEmail(String aToEmailAddr, String aSubject, String body, boolean isHtml)
			throws EmailException, MessagingException {
		Email email = new SimpleEmail();
		EmailAttachment attach = new EmailAttachment();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator("pype-dev@pype.io", "P1pe246!#%"));
		email.setSSLOnConnect(true);
		email.setFrom("pype-dev@pype.io");
		email.setSubject(aSubject);
	    //email.setMsg(body);
		email.addTo(aToEmailAddr);
		email.send();
		System.out.println("mail sent");
		MimeMultipart multiPart = new MimeMultipart();
		if (body != null) {
			MimeBodyPart bodyPart = new MimeBodyPart();
			if (isHtml)
				bodyPart.setContent(body, "text/html; charset=utf-8");
			else
				bodyPart.setText(body);
			multiPart.addBodyPart(bodyPart);
		}
		
		

	}

}
