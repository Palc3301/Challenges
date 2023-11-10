package com.kipper.emailservice.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kipper.emailservice.adapters.EmailSenderGateway;
import com.kipper.emailservice.core.EmailSenderUseCase;

@Service
public class EmailSenderService implements EmailSenderUseCase {
	
	private final EmailSenderGateway emailSenderGetway;
	
	@Autowired
	public EmailSenderService(EmailSenderGateway emailGateway) {
		this.emailSenderGetway = emailGateway;
	}
	
	@Override
	public void sendEmail(String to, String subject, String body) {
		this.emailSenderGetway.sendEmail(to, subject, body);
	}

}
