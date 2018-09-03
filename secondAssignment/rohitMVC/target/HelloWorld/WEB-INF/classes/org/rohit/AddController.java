package org.rohit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/sample")
class AddController {
  
	 @RequestMapping("/add")
	 public void add() {
		 System.out.println("i m here");
	 }
	
	 
}
