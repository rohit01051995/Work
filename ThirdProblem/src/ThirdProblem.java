import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ThirdProblem {

    public static void main(String[] args)
    {


        HashSet<Employee> objects = new HashSet<Employee>();


        Scanner in = new Scanner(System.in);

        System.out.println("give ur option");

        String ch=in.nextLine();

       while(!ch.equals("exit")  ) {


           switch (ch) {
               case "add":
                   System.out.println("Enter the id ,salary and name");

                   int id = Integer.parseInt(in.nextLine());
                   int salary = Integer.parseInt(in.nextLine());
                   String name = in.nextLine();


                  Employee newobject = new Employee(id,name,salary);

                  if(objects.contains(newobject))
                  {
                      System.out.println("user already exists");
                      break;
                  }

                  objects.add(newobject);
                       break;

               case "remove":
                   System.out.println("enter the id u want to remove");
                                int inputid=Integer.parseInt(in.nextLine());


                   Iterator<Employee> it1 = objects.iterator();

                   while(it1.hasNext())
                   {
                         int tempid =it1.next().getEmpId();

                       if(tempid== inputid)
                           it1.remove();
                   }
                   break;



               case "getEmpName":
                   System.out.println("Enter the name");
                   String tempname=in.nextLine();

                   System.out.println("name tempname "+tempname);
                   int flag=0;

                   for(Employee emp: objects)
                   {
                       String temp =emp.getName();

                       if(temp.equals(tempname) ) {
                           System.out.println(emp);
                           flag=1;
                       }

                   }

                   if(flag==0)
                       System.out.println("Name is not in the set");
                            break;

               case "salaryrange":
                   System.out.println("Enter the range of salary");

                    int lower =Integer.parseInt(in.nextLine());
                    int upper =Integer.parseInt(in.nextLine());

                    int flag2=0;

                    for(Employee emp : objects)
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

                            break;

               case "show":
                   Iterator<Employee> it = objects.iterator();

                               while(it.hasNext())
                               {
                                   System.out.println(it.next());
                               }
                             break;

               case "showt":

                    for(Employee emp : objects)
                    {
                        System.out.println(emp);
                    }

                default:
                    System.out.println("wrong input");
                    break;

           }

           System.out.print("give next option");

           ch=in.nextLine();

           if(ch.equals("exit"))
               return;

       }


    }

}
