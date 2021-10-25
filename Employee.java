package Program_1;
/*CSC 205: 12247 / Asynchronous (no meets)
Program: #1 Company
Author: Kim Finical & ID# 36283133
Description: default data for all the companies employees
*/
public abstract class Employee {

	protected double salary;
	protected double cash;
	protected String name;
	
	public String getName() { return this.name; }
	
	public double getCash() { return this.cash; }
	
	public void getPaid() { }
	
	public abstract void giveRaise(double increaseSalary);
	
}
