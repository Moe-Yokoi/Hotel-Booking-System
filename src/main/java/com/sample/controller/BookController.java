package com.sample.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.sample.dao.CustomerInfoRepository;
import com.sample.entity.CustomerInfo;


@Controller
@RequestMapping("/book")

public class BookController {
	
	@Autowired
	CustomerInfoRepository infoRepo;
	
	@GetMapping
	public String displayBookingPage(Model model) {
		model.addAttribute("customer", new CustomerInfo());
		return "forms/book";
	}
	
	@PostMapping("/save")
	public String createCustomer(CustomerInfo customer,Model model) {
		infoRepo.save(customer);
		model.addAttribute("customerList", customer);
		return "messages/bookingSuccessful"; 
	}

	

}
