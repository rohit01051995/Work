package com.paytm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.servlet.ModelAndView;

@Controller
class AddController {
  
	 @RequestMapping("/add")
	 public ModelAndView add() {
//		 System.out.println("i m here");
//		 int i=Integer.parseInt(request.getParameter("t1"));
//		 int j=Integer.parseInt(request.getParameter("t2"));
		 
//		 int k=i+j;
		 ModelAndView mv=new ModelAndView();
		 mv.setViewName("display.jsp");
		 
//		 mv.addObject("result",k);
		 
		 return mv ;
	 }
	
	 
}
