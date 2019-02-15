/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.listavip.listavip.controller;

import br.com.alura.emailsender.simpleemailsender.EmailService;
import br.com.alura.listavip.listavip.model.Guest;
import br.com.alura.listavip.listavip.repository.GuestRepository;
import br.com.alura.listavip.listavip.service.GuestService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author eder
 */
@Controller
public class GuestController {
    
    @Autowired
    private GuestService guestService;
    
    @Autowired
    private EmailService emailService;
    
    
    @RequestMapping("/")
    public String  index() {
        // convention.. the name of the class without extension
        return "index";
    }
    
    
    // ui.Model  to send data to view
    @RequestMapping("guest-list")
    //Model interface is being inject by spring
    public String  guestList(Model model) {
        
        List<Guest> guests = guestService.getGuestList();
        
        model.addAttribute("guests", guests);
        // spring understands this return as being the name of the html template
        return "guest-list";
    }
    
    @RequestMapping(name = "save", method = RequestMethod.POST)
    public String saveGuest(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("phone") String phone, Model model) {
        
        guestService.saveGuest(name, email, phone);
        
        List<Guest> guests = guestService.getGuestList();
        
        emailService.send(name, email);
        
        model.addAttribute("guests", guests);
        
        return "guest-list";
    }
    
}
