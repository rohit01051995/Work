package com.paytm;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerClass {

	EmployeeDataService eds = EmployeeDataService.getInstance();
	
	@RequestMapping(value="adder",method=RequestMethod.POST)
	public void adder(HttpServletRequest request, HttpServletResponse response) throws IOException
 	{
		int id = Integer.parseInt(request.getParameter("id"));   	
		int salary = Integer.parseInt(request.getParameter("salary"));
		String name=  request.getParameter("name");
		Employee emp =new Employee(id,name,salary);	
		eds.add(emp);
		
		
		
 	}	
	
	@RequestMapping(value="view",method=RequestMethod.GET)
	public void viewall(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		eds.view();
		
	}
		

	@RequestMapping(value="remover",method=RequestMethod.GET)
	public void remover(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		int id = Integer.parseInt(request.getParameter("id"));  
		
		
		eds.remove(id);
		
		
	}
		
	
	@RequestMapping(value="byname",method=RequestMethod.GET)
	public void nameFind(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String name=  request.getParameter("name");
		
		eds.finddByName(name);
		
	}
	
	@RequestMapping(value="salaryrange",method=RequestMethod.GET)
	public void salaryrange(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		int lower = Integer.parseInt(request.getParameter("lower"));   	
		int upper = Integer.parseInt(request.getParameter("upper"));
		
		eds.getsalary(upper, lower);
	}
}
