package models.subSystem;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import models.controllers.EmailController;
 
public class SendMailSSL {
	
	public SendMailSSL getInstance(){
		return new SendMailSSL();
	}
	
	public void sendMail(List<Integer> interessados, EmailController controladorEmail) {
		
		Session session = Session.getInstance(controladorEmail.getProps(), 
				new GMailAuthenticator(controladorEmail.getUsername(), controladorEmail.getPassword()));
 
		try {
 
			for (Integer interessado : interessados) {
				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress(controladorEmail.getUsername()));
				message.setRecipients(Message.RecipientType.TO,
						InternetAddress.parse("diogogr85@gmail.com"));
				message.setSubject("Eu nem abri o GMail pra enviar isso!");
				message.setText("Uhuuuullll!!!!" +
						"\n\n Sent from my Eclipse =)");
				
				Transport.send(message);
				
				System.out.println("Done");
				
			}
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

}
