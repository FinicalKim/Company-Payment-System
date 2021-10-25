package Program_1;
/*CSC 205: 12247 / Asynchronous (no meets)
Program: #1 Company
Author: Kim Finical & ID# 36283133
Description: This is our Main Company program that run the data, accepts input and creates output. 
It manipulates all the Employees data such as hours, salary, and adds employees to the list.
*/
import java.util.ArrayList;
import java.util.Scanner;
public class Company {
	
		// Scanner to accept input from user
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
			
			// Adminassi object to manipulate the admin data 
		AdministrativeAssistant adminAssi = new AdministrativeAssistant(null, 0, 0);
		
			// Softeng object to manipulate the eng data
		SoftwareEngineer softEng = new SoftwareEngineer(null, 0);
		
			// ArrayList to add employees that are hired
		ArrayList employees = new ArrayList(4);
		
		String nameEquals;
			// switch statement that displays a list of option to add or change your employees hours, salary.
		char option;
		do{
			System.out.println("What do you want to do?");
				System.out.println("A. Add an Employee");
				System.out.println("B. List all Employees");
				System.out.println("C. Give an Employee a Raise");
				System.out.println("D. Give Paychecks");
				System.out.println("E. Change someones hours");
				System.out.println("F. Quit");
			
			option =  input.next().charAt(0);
			
			switch(option){
			
				// case a = get name then, get salary then, if hourly how many hours then, add to Arraylist.
			case 'a':
				System.out.println("What is their name?");
				
					String names = input.next();
					
				System.out.println("What is their salary (yearly or hourly)?");
				
					double salary = input.nextDouble();
					
				
				System.out.println("Are they an hourly worker? (Y/N)");
					char ifHourly = input.next().charAt(0);
					if(ifHourly == 'y') {
						
						System.out.println("How many hours per week do they work?");
							int initialHours = input.nextInt();
							adminAssi = new AdministrativeAssistant(names, salary, initialHours);
							employees.add(adminAssi);
							System.out.println(adminAssi.name + " was hired!");
							
					}else {softEng = new SoftwareEngineer(names, salary);
						employees.add(softEng);
							System.out.println(softEng.name + " was hired!");}
					break;
					
				// case b = see if list is empty then, print all employees who work for the company.
			case 'b':
				if(employees.isEmpty() == true) {
					System.out.println("Nobody works here!");
				}
				else {
					for (int i = 0; i < employees.size(); i++) {
						
					if (employees.get(i).getClass() != adminAssi.getClass()) 
						System.out.println(softEng.getName() + " Salary: " + softEng.salary + " Cash: " + softEng.getCash() + " " + softEng.getClass().getName());		
					else {
						System.out.println(adminAssi.getName() + " Hourly Wage: " + adminAssi.salary + "Cash: " + adminAssi.getCash() + " " + adminAssi.getClass().getName());
					}
					}
				}
				break;
				
				// case c = select employee then, how much of a raise to give.
			case 'c':
				if(employees.isEmpty() == true) {
					System.out.println("Nobody works here!");
				}
				else {
					System.out.println("Who do you want to give a raise to?");
						nameEquals = input.next();
					System.out.println("What raise do you want to give them?");
						double increaseSalary = input.nextInt();
						for (int i = 0; i < employees.size(); i++) {
							employees.get(i); 
						if (softEng.name.equals(nameEquals)) { 
							softEng.giveRaise(increaseSalary);
							System.out.println(softEng.name + " is happy!");}
						else if (adminAssi.name.equals(nameEquals)) {
							adminAssi.giveRaise(increaseSalary);
							System.out.println(adminAssi.name + " is happy!");}
						}
						
				}
				break;
				
				// send paychecks to all employees.
			case 'd':
				if(employees.isEmpty() == true) {
				System.out.println("Nobody works here!");
				}
					else {
						softEng.getPaid();
						adminAssi.getPaid();
					System.out.println("Hooray for money!");
					}
				break;
				
				// select employee then, get current hours then, input new hours.
			case 'e':
				if(employees.isEmpty() == true) {
					System.out.println("Nobody works here!");
				}
				else {
					System.out.println("Change hours for who?");
						nameEquals = input.next();
				
						for (int i =0; i < employees.size(); i++) {
							employees.get(i); 
							if (adminAssi.name.equals(nameEquals)) {
								System.out.println(adminAssi.name + " currently works " +  adminAssi.hours + " hours per week. What would you like to change it to?");
							int changeHours = input.nextInt();
						adminAssi.setHours(changeHours);
							}
						}
						System.out.println(adminAssi.name + " will now work " + adminAssi.hours + " hours per week");
				}
				break;
				
				// end program.
			case 'f':
				System.out.println("Bye!");
				break;
				// default please select another option
			default:
				System.out.println("Invalid option");
				break;
			}
			
		}while(option != 'f');
		
	}
	
}
