package com.sample.controller;

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
	
	  return "forms/request-cancellation";
	}
	
//	@PostMapping("/requestedinfo")
//	public String request(Model model, @RequestParam("bookingNumber") long bookingNumber) {
//		CustomerInfo requestedInfo = infoRepo.getOne(bookingNumber);
//        model.addAttribute("requestedInfo", requestedInfo);
//    return "forms/cancel";
//}
	
	
	@PostMapping("/complete")
	  public String delete(@RequestParam long bookingNumber) {
	    infoRepo.deleteById(bookingNumber);
	    return "messages/cancellation-successful";
	  }

}
