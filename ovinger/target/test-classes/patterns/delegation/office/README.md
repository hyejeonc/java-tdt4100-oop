# Kildekodemappe for øving 8 - Delegation - Office
==================================================
Exercise 08: Observer-Observed and Delegation
target practice

Learn what the observer-observed technique is, its uses and benefits
Learn how to use delegation to perform tasks in a class

Practice Requirements

Be able to define and implement an observer interface
Could let an observed class tell its observers about changes
Able to allow a class to delegate the execution of tasks to internal objects


You have to do this
This exercise includes both the delegation technique and
observer-observed-technique. Minimum requirement to get the exercise
approved is to perform mint one of the four tasks below. On the other hand, it is strongly recommended to do at least one task
from each of the two topics, since this is needed to cover the entire syllabus.
Complete at least one of the delegation tasks:


The Office (ovinger / src / patterns.delegation.office) (recommended)
Logs (ovinger / src / patterns.delegation)

OR at least one of the tasks of the observer-observed technique:

StockListener (ovinger / src / patterns.observable)
Highscore (ovinger / src / patterns.observable)

The tasks should be stored in the folders specified in parentheses according to the tasks.
In addition to the task (s) above, you will need to submit a text file explaining in short the delegation technique and the observer-observed technique.

Help / suspect bugs
If you have any questions or need help, consult your student in his / her salt time. You can also visit other studios on the hall or post on Piazza.

Approval
Upload the source code and .ex files on Blackboard by the specified submission deadline. The submitted code must be demonstrated to a learning assistant within one week of the submission deadline. See also the Blackboard pages for information on organizing the exercise program and the related exercise regulations.

Exercise panel
For each task, there is a corresponding .ex file, which describes which activities, e.g. code editing, running tests, etc., which is part of the task. When working on a task, you can open the .ex file for the task in the Exercise panel. This is done either by right-clicking on the file and selecting Exercise> Open Exercise View or opening the panel with Window> Show View> Other> Exercise View and then dragging and dropping the .ex file into the panel. The file is in the tests folder, and further in the package with the same name as the class it belongs to. Each .ex file opens in a separate tab, so you can work on multiple tasks at once. These .ex files, one for each task, must be submitted along with the source code in exercises where specified.
-----------------------------------------
Delegation - The Office task
This task uses the delegation technique to model the distribution of work in a "regular" workplace. This task may be perceived as less meaningful. This is perhaps roughly equivalent to how pointless some types of office work may seem.
In this scenario, we should have a boss, or Manager, who has one or more workers, or Clerks, ie in a so-called one-to-many relationship. An Employee interface defines a behavior that is common to employees and is implemented by both Manager and Clerk.
Employee objects in this simulated workplace have two tasks:

printing of documents
performing mathematical calculations


Part 1: Employee, Clerk and Printer
The Employee interface has the following methods:


double doCalculations (BinaryOperator <Double> operation, double value1, double value2) - calculates the result of performing operation with the value1 and value2 arguments.

void printDocument (String document) - Printer document. How this is done depends on the specific implementation.

int getTaskCount () - Returns how many tasks (calculations and printings) have been performed by or on behalf of this Employee object.

int getResourceCount () - the number of employees available, including the Employee object method is called. An Employee must therefore include himself in the number of resources available to the employee. This number should include all Employee objects down the hierarchy.

Create this interface and then create a Clerk class that implements it. Clerk must have the following constructor:

Clerk (Printer Printer)

The Clerk class must contain its own logic to resolve doCalculations, but must delegate printDocuments to the Printer object given in the constructor.
Define a Printer class using the following methods:


void printDocument (String document, Employee employee) - writes the document to the console and preserves the document in employee history.

List <String> getPrintHistory (Employee employee) - Returns a List of all documents that have been printed by the employee by this printer in the order they were printed. If the employee has not printed any documents at this printer, an empty list should be returned.

Then have the Clerk delegate printDocument to Printer. Since the Clerk has no other employees to delegate to, getResourceCount () will always be 1.
Test code for Clerk is here: delegation / office / ClerkTest.java The original code for the test (jextest) can be found here: delegation / office / Clerk.jextest
Test code for Printer is here: delegation / office / PrinterTest.java The original code for the test (jextest) can be found here: delegation / office / Printer.jextest

Part 2: Manager
We then define the boss of the hard-working Clerk objects. The Manager class has the following constructor:


Manager (Collection <Employee> employees) - triggers an IllegalArgumentException if employees are empty.

Then let the Manager implement the Employee interface. Implement Manager's tasks by delegating everyone to one of the workers in the list of Employee objects given in the constructor. The rule for which Employee gets what task delegated to you can decide for yourself, but try to make it so that work is evenly distributed to everyone. Thus, while the Clerk has only one available resource, Manager objects will have more.
Test code for Manager is here: delegation / office / ManagerTest.java The original code for the test (jextest) can be found here: delegation / office / Manager.jextest

Part 3: Main Method
Create a main method that illustrates what happens to efficiency when we add multiple levels of middle managers.
First, create a Manager object that is assigned to some Clerk objects below it. Then present the efficiency of the hierarchy by printing the getTaskCount () / getResourceCount () for the Manager object. Then show how efficiency drops as we add levels of middle managers by creating two or more levels with Manager, where bottom managers are assigned Clerk objects, and print the new efficiency for top executives.
Exercise panel
Use of the Exercise panel is mandatory for this exercise. You must have the panel open with the Office.ex file (tests> patterns.delegation.office> Office.ex) in before you begin the task. For more information / help, see the bottom of the previous page, ie the main page for Exercise 8.
