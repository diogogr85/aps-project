package models.controllers;

import java.util.List;
import java.util.Properties;

import models.subSystem.SendMailSSL;


public class EmailController {

	private String username;
	private String password;
	private Properties props;
	private SendMailSSL boundaryMail;
	

	private void setUpProperties() {
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
	}
	
	
	public EmailController(){
		this.username = "aps.projeto.2014@gmail.com";
		this.password = "aps12345";
		this.props = new Properties();
		setUpProperties();
	}
	
	public void sendEmail(List listaObservers, EmailController controllerMail){
		boundaryMail.getInstance().sendMail(listaObservers, this);
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Properties getProps() {
		return props;
	}


	public void setProps(Properties props) {
		this.props = props;
	}
	
	
	
}
