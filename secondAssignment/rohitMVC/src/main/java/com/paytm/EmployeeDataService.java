package com.paytm;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;



public class EmployeeDataService implements DataService<Employee ,Integer> {
	
	private HashSet<Employee> employeeSet= new HashSet<Employee>();
	
	private static EmployeeDataService eds = new EmployeeDataService();
	
	private EmployeeDataService() {                         // private constructor to make singleton class
    }
	
	public static EmployeeDataService getInstance(){        //making the single object through getInstance method
        return eds;
    }

	public void remove(Integer id) {
		// TODO Auto-generated method stub
		
		
		Iterator<Employee> it1 = employeeSet.iterator();

        while(it1.hasNext())
        {
              int tempid =it1.next().getEmpId();

            if(tempid== id)
                it1.remove();
        }
        
		
	}

	public void add(Employee emp) {
		// TODO Auto-generated method stub
		
		if(employeeSet.contains(emp))
        {
            System.out.println("user already exists");
            System.out.println("user already exist");
            return;
        }
		
		 employeeSet.add(emp);
	}

	public void view() {
		// TODO Auto-generated method stub
		
		for(Employee emp : employeeSet)
		{
            System.out.println(emp);   			
		}
	}

	
	public void finddByName(String name)
	{
		 int flag=0;

         for(Employee emp: employeeSet)
         {
             String temp =emp.getName();

             if(temp.equals(name) ) {
                 System.out.println(emp);
                 flag=1;
             }

         }

         if(flag==0)
             System.out.println("Name is not in the set");
         
	}
    
	
	public void getsalary(int upper,int lower)
	{
		 int flag2=0;

         for(Employee emp : employeeSet)
         {
             int tempsalary = emp.getSalary();

             if(tempsalary >= lower && tempsalary <= upper)
             {
                 System.out.println(emp);
                 flag2=1;
             }
         }

         if(flag2 ==0)
             System.out.println("No employee within this salary range");
	}
	
	
	

}
