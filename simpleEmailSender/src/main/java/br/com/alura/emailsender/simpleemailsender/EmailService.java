/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.emailsender.simpleemailsender;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.stereotype.Service;

/**
 *
 * @author eder
 */
@Service
public class EmailService {

    public void send(String name, String emailTo) {

        try {
            
            final Email email = new SimpleEmail();
            
            email.setHostName("smtp.googlemail.com");
            email.setSmtpPort(465);
            email.setAuthenticator(new DefaultAuthenticator("email@gmail.com", "123"));
            email.setSSLOnConnect(true);

            email.setFrom("email@gmail.com");
            email.setSubject("You were invited by ListaVIP");
            email.setMsg("Hello " + name + ". Você acaba de ser convidado pelo ListaVIP.");
            email.addTo(emailTo);
            email.send();

        } catch (EmailException e) {
            System.out.println("Email has failed!");
        }

    }

}
