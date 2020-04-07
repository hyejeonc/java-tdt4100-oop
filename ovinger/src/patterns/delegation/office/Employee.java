package patterns.delegation.office;

import java.util.function.BinaryOperator;
import java.util.*;

public interface Employee {
	
	// calculates the result of performing operation with the value1 and value2 arguments.
	double doCalculations(BinaryOperator<Double> operation, double value1, double value2);
	// Abstract, Printer document. How this is done depends on the specific implementation
	void printDocument(String document);
	// Returns how many tasks (calculations and printings) have been performed by or on behalf of this Employee object.d
	int getTaskCount();
	int getResourceCount();
	
	List<String> printList = new ArrayList<String>();
	
	
	
	
}
