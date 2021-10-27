package Program_1;
/*
Description: Class for SoftwareEngineer that can access and mutate their data.
*/
public class SoftwareEngineer extends Employee {

	
	public SoftwareEngineer(String name, double salary) {
		this.name = name;
		this.salary = salary;
		cash = 0;
	}
	
		// make increase salary a decimal and then multiply to get the percentage increase of the employees raise
	public void giveRaise(double increaseSalary) {
		double salaryPercentage = (this.salary * (increaseSalary / 100));
		this.salary = this.salary + salaryPercentage;
	}
		// sends paycheck to employee
	public void getPaid() {
		cash = salary / 26;
	}
}
