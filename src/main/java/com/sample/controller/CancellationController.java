package com.sample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sample.dao.CustomerInfoRepository;
import com.sample.entity.CustomerInfo;

@Controller
@RequestMapping("/cancel")

public class CancellationController {
	
	@Autowired
	CustomerInfoRepository infoRepo;

	@GetMapping
	public String displayBookingPage(Model model) {
      model.addAttribute("customer", new CustomerInfo());
//	
//      List<CustomerInfo> requestedInfo = infoRepo.findAll();
//      model.addAttribute("requestedInfo", requestedInfo);
      
	  return "forms/request-cancellation";
//      return "forms/cancel";
	}
	
	@PostMapping("/requestedInfo")
	public String request(Model model, @RequestParam long bookingNumber) {
		CustomerInfo requestedInfo = infoRepo.getOne(bookingNumber);
        model.addAttribute("requestedInfo", requestedInfo);
    return "forms/cancel";
}
	
	
	@PostMapping("/complete")
	  public String delete(@RequestParam long bookingNumber) { 
	    infoRepo.deleteById(bookingNumber);
	    return "messages/cancellationSuccessful";
	  }

}
