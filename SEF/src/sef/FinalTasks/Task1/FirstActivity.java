package sef.FinalTasks.Task1;

import java.util.*;

public class FirstActivity {
	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList();

		Employee a = new Employee("Cat", 1, "Human owner", "House", 100);
		employeeList.add(a);

		a = new Employee("Dog", 2, "Human friend", "Garden", 500);
		employeeList.add(a);

		a = new Employee("Fish", 3, "Human dood", "Fish Tank", 2);
		employeeList.add(a);

        for (int e = employeeList.size() - 1; e > 0; e--)
        {
            for (int r = 0; r < e; r++)
            {
                if (employeeList.get(r).getWages() < employeeList.get(r + 1).getWages())
                { 
                    Employee t = employeeList.get(r);
                    employeeList.set(r, employeeList.get(r + 1));
                    employeeList.set(r + 1, t);
                }
            }
        }
		
		for (Employee e : employeeList) {
			System.out.println(e.introduce() + " and I earn " + e.getWages() + " Gramms of food per day");
		}
				

	}

}
