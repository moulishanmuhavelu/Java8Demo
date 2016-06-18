package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter {

	private static List<Employee> employees = new ArrayList<Employee>(); 

	public static void main(String[] args) {
		buildEmployees();
//		sortEmployeesJava7();
		sortEmployeesJava8();
		printEmployees();
		
	}
	
	private static void sortEmployeesJava7() {
		
/*		Collections.sort(employees, new Comparator() {

			@Override
			public int compare(Object e1, Object e2) {
				Employee emp1 = (Employee) e1;
				Employee emp2 = (Employee) e2;
				return ( emp1.getEmpId() > emp2.getEmpId()) ? 1 : -1;
			}
		
		});		
*/	}
	private static void sortEmployeesJava8() {
		
		Collections.sort(employees, (Employee e1, Employee e2) -> e1.getEmpId() > e2.getEmpId() ? 1 : -1 );		
	}
	private static void buildEmployees() {
		Employee emp = new Employee();
		emp.setEmpId(784);
		emp.setEmpName("Hari");
		employees.add(emp);
		
		emp = new Employee();
		emp.setEmpId(238);
		emp.setEmpName("Zakir");
		employees.add(emp);
		
		emp = new Employee();
		emp.setEmpId(519);
		emp.setEmpName("Benil");
		employees.add(emp);

		emp = new Employee();
		emp.setEmpId(956);
		emp.setEmpName("Mouli");
		employees.add(emp);
	}

	private static void printEmployees() {
		for (Employee emp : employees) {
			System.out.println("" + emp.getEmpId());
			System.out.println("" + emp.getEmpName());
			System.out.println("------------------------");
		}
	}
}
