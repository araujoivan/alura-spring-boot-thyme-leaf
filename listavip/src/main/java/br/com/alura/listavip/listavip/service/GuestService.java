/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.listavip.listavip.service;

import br.com.alura.listavip.listavip.model.Guest;
import java.util.List;

/**
 *
 * @author eder
 */


public interface GuestService {
    
    public List<Guest> getGuestList();
    
    public void saveGuest(String name, String email, String phone);
    
}
