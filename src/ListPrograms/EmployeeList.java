package ListPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList 
{
	public static void main(String[] args) 
	{
		List<Employee> emp = Arrays.asList(new Employee("Jack", 29, "South"),
				                           new Employee("Tom", 24, "North"),
		                                   new Employee("Harry", 35, "West"),
		                                   new Employee("Katie", 32, "East"));
		
		List<Integer> res = emp.stream().filter(u ->u.emp_age>30).map(e->e.emp_age).collect(Collectors.toList());
		List<String> zone=emp.stream().filter(u->u.emp_zone=="North").map(e->e.emp_zone).collect(Collectors.toList());
		System.out.println("Employee Names = "+res);
		System.out.println(zone);
		
	}
}

class Employee
{
	   public String emp_name;
	   public int emp_age;
	   public String emp_zone;
	   public Employee(String emp_name, int emp_age, String emp_zone) 
	   {
	      this.emp_name = emp_name;
	      this.emp_age = emp_age;
	      this.emp_zone = emp_zone;
	   }
	   public String displayEmpName() 
	   {
	      return this.emp_name;
	   }
	   public int displayEmpAge() 
	   {
	      return this.emp_age;
	   }
	   
}
