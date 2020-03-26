package com.oldBookSell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oldBookSell.dto.OldBookSellDTO;
import com.oldBookSell.service.OldBookSellServices;

@RestController
@RequestMapping
@CrossOrigin
public class OldBookSellController {
	
		@Autowired
		OldBookSellServices oldBookSellServices;
		
		@GetMapping("/hello")
		public  String hello() {
			return "hello fundtion excute sucessfully";
		}
		
		@RequestMapping("/add")
		public OldBookSellDTO createUser(@RequestBody OldBookSellDTO userDetail) {
			return  oldBookSellServices.createUser(userDetail);
		}
}
