package io.ftpdevelopers.hawkeye;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class EmailDemoApplication implements CommandLineRunner {

	@Autowired
	private JavaMailSender javaMailSender;

	public static void main(String[] args) {
		SpringApplication.run(EmailDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		sendMail();
	}

	public void sendMail() {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("Palash.Lambhate@dxc.com");
		//message.setFrom("shalini@jc.com");
		message.setSubject("Welcome!!");
		message.setText("Test Email");
		javaMailSender.send(message);
	}
}
