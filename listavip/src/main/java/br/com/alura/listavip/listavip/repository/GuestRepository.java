/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.listavip.listavip.repository;

import br.com.alura.listavip.listavip.model.Guest;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author eder
 */
public interface GuestRepository extends CrudRepository<Guest, Long> {}
