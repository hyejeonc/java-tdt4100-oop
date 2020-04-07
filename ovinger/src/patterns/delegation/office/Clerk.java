package patterns.delegation.office;

import java.util.function.BinaryOperator;
import java.util.*;

public class Clerk implements Employee {
	
	Employee employee;
	private Printer printer;
	private int taskCount = 0;
	private int resourceCount = 1;
	
	// constructor
	public Clerk(Printer printer) {
		this.printer = printer;
	}
	
	public double doCalculations(BinaryOperator<Double> operation, double value1, double value2) {
		taskCount++;
		return operation.apply(value1, value2);
	}

	public void printDocument(String document) {
		taskCount++;
		printer.printDocument(document, this);
	}


	public int getTaskCount() {
		return taskCount;
	};
	
	public int getResourceCount() {
		return resourceCount;
	};
	
	public List<String> getPrintHistory(){
		return printer.getPrintHistory(this);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
