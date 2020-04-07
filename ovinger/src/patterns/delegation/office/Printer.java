package patterns.delegation.office;

import java.util.*;

public class Printer {
	
	//private List<String> printList = new ArrayList<String>();
	//private List<String> employeeList = new ArrayList<String>();
	
	private Map<Employee, List<String>> history = new HashMap<>();

	// writes the document to the console and preserves the document in employee history.
	public void printDocument(String document, Employee employee) {
		
		
		if (history.get(employee) == null || history.get(employee).size() == 0) {
			history.put(employee, new ArrayList<String>() );
			history.get(employee).add(document);
		} else {
			System.out.println(history.get(employee));
			history.get(employee).add(document);
		}
	} 
	
	// Returns a List of all documents that have been printed by the employee by this printer in the order they were printed. If the employee has not printed any documents at this printer, an empty list should be returned.
	public List<String> getPrintHistory(Employee employee) {
		if (history.get(employee) == null || history.get(employee).size() == 0) {
			List<String> result = new ArrayList<String>();
			return result;
		} else {
			return history.get(employee);
		}
		
		
	}
	
	
	
}
