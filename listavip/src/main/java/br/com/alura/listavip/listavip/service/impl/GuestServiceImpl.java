/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.listavip.listavip.service.impl;

import br.com.alura.listavip.listavip.model.Guest;
import br.com.alura.listavip.listavip.repository.GuestRepository;
import br.com.alura.listavip.listavip.service.GuestService;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author eder
 */
@Service
public class GuestServiceImpl implements GuestService {
    
    @Autowired
    private GuestRepository guestRepository;
    
    @Override
    public List<Guest> getGuestList() {
        
        final Iterable<Guest> guests = guestRepository.findAll();
        
        return StreamSupport.stream(guests.spliterator(), Boolean.FALSE)
                        .collect(Collectors.toList());
    }
    
    @Override
    public void saveGuest(String name, String email, String phone) {
        
        final Guest guest = new Guest();
        
        guest.setName(name);
        guest.setEmail(email);
        guest.setPhone(phone);
        
        guestRepository.save(guest);
        
    }
    
}
