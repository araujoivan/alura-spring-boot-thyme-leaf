/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.listavip.listavip.configuration;

import br.com.alura.emailsender.simpleemailsender.EmailService;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author eder
 */
@Configuration
@ComponentScan(basePackages = {"br.com.alura.emailsender.simpleemailsender"}, basePackageClasses = EmailService.class)
public class AppConfiguration {
    
    // ask to spring to manage this class
//    @Bean
//    public DataSource dataSource() {
//        
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/guestapp");
//        dataSource.setUsername("root");
//        dataSource.setPassword("12345678");
//        
//        return dataSource;
//    }
    
    
}
