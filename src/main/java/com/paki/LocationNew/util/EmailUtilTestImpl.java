package com.paki.LocationNew.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class EmailUtilTestImpl implements EmailUtilTest {
	
	@Autowired
	private JavaMailSender sender;

	@Override
	public void sendMessage(String adrese, String subject, String body) {
		
		MimeMessage message=sender.createMimeMessage();
		
		MimeMessageHelper helper=new MimeMessageHelper(message);
		
		try{
			helper.setTo(adrese);
			helper.setSubject(subject);
			helper.setText(body);
		}catch (MessagingException e){
			e.printStackTrace();
		}
		
		sender.send(message);
		

	}

}
