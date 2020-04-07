package patterns.delegation.office;

import java.util.*;
import java.util.function.BinaryOperator;

public class Manager implements Employee {
	
	private Collection<Employee> employees;
	private ArrayList<Employee> employeesList;
	private Printer printer;
	private int taskCountManager = 0;
	private int resourceCount = 1;
	
	// triggers an IllegalArgumentException if employees are empty.
	public Manager (Collection<Employee> employees) {
		if (employees == null || employees.size() == 0) {
			throw new IllegalArgumentException();
		} 
		this.employees = employees;
		this.employeesList = new ArrayList<Employee>(employees);
	}

	public double doCalculations(BinaryOperator<Double> operation, double value1, double value2) {
		
		System.out.println("size is");
		System.out.println(employeesList.size());
		if (employees == null || employees.size() == 0) {
			taskCountManager++;
			return operation.apply(value1, value2);
		} else {
			double result = employeesList.get(0).doCalculations(operation, value1, value2);
			employeesList.add(employeesList.get(0));
			employeesList.remove(0);
			
			return result;
		}
	}

	public void printDocument(String document) {
		
		if (employees == null || employees.size() == 0) {
			throw new IllegalArgumentException("There are no employees!");
		} else {
			employeesList.get(0).printDocument(document);
			
			//printer.printDocument(document, employeesList.get(0));
			employeesList.add(employeesList.get(0));
			employeesList.remove(0);
		}
		
		//taskCount++;
	}

	public int getTaskCount() {
		 //ArrayList<Employee> list = new ArrayList<Employee>();
		int taskCountHere = 0;
		
		for(Employee employee:employees) {
			taskCountHere += employee.getTaskCount();
		}
		
		return taskCountHere + taskCountManager;
	}
	
	public int getResourceCount() {
		//ArrayList<Employee> list = new ArrayList<Employee>();
		
		int resourceCount = 0;
		
		for(Employee employee:employees) {
			resourceCount += employee.getResourceCount();
		}
		
		return resourceCount + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer1 = new Printer();
		Printer printer2 = new Printer();
		
		Clerk bitch1 = new Clerk(printer1);
		Clerk bitch2 = new Clerk(printer2);
		Clerk bitch3 = new Clerk(printer2);
		Clerk bitch4 = new Clerk(printer1);
		
		Collection<Employee> employeeList1 = new ArrayList<Employee>();
		Collection<Employee> employeeList2 = new ArrayList<Employee>();
		employeeList1.add(bitch1);
		employeeList1.add(bitch2);
		employeeList2.add(bitch3);
		employeeList2.add(bitch4);
		Manager boss1 = new Manager(employeeList1);
		Manager boss2 = new Manager(employeeList2);
		
		Collection<Employee> employeeList3 = new ArrayList<Employee>();
		employeeList3.add(boss1);
		employeeList3.add(boss2);
		Manager boss = new Manager(employeeList3);
		
		bitch1.printDocument("How many employees do I have? huh?");
		System.out.println(boss.getResourceCount());
		//bitch1.doCalculations(+, 1, 2);
		bitch1.printDocument("Doja Cat: Boss Bitch, Starts!");
		bitch2.printDocument("I am a bitch and a boss i'm a shine like gloss ");
		double eff = ((double) boss.getTaskCount())/((double) boss.getResourceCount());
		
		bitch2.printDocument("Boss bitch's efficiency is ... ");
		System.out.println(eff);
		//((double) manager1.getTaskCount())/((double) manager1.getResourceCount());
	}
	
	

}
