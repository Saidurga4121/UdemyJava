package ListPrograms;

import java.util.Arrays;
import java.util.List;

public class EmployeeList1 {

	public static void main(String[] args)
	{
		List<Employee> emp = Arrays.asList(new Employee("Jack", 29, "South"),
                new Employee("Tom", 24, "North"),
                new Employee("Harry", 35, "West"),
                new Employee("Katie", 32, "East"));

	}

}
