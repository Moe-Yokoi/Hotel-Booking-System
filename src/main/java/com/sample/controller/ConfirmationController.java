package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sample.dao.CustomerInfoRepository;
import com.sample.entity.CustomerInfo;

@Controller
@RequestMapping("/confirm")

public class ConfirmationController {
	
	@Autowired
	CustomerInfoRepository infoRepo;

	@GetMapping
	public String displayBookingPage(Model model) {
      model.addAttribute("customer", new CustomerInfo());
	
	  return "forms/request-confirmation.html";
	}
	
	@PostMapping("/requestedinfo")
	public String request(Model model, @RequestParam("bookingNumber") long bookingNumber) {
		
		CustomerInfo requestedInfo = infoRepo.getOne(bookingNumber);
        model.addAttribute("requestedInfo", requestedInfo);
        return "forms/confirm";
    }
	
}
	 


