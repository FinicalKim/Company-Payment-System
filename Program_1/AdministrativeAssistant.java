package Program_1;
/*
Description: Class for AdministrativeAssistant that can access and mutate their data.
*/
public class AdministrativeAssistant extends Employee implements Hourly {
	
	
	public int hours = 0;
	
	public AdministrativeAssistant(String name, double salary, int hours) {
		this.name = name;
		this.salary = (salary / 2080);	//salary to hourly wage
		this.hours = hours; 
	}

		// get employees current hours
	public int getHours() { return hours; }
		//sets employees new hours
	public void setHours(int changeHours) { int hours = changeHours; }
		//give employee a direct raise
	public void giveRaise(double increaseSalary) { this.salary = this.salary + increaseSalary; }
		// sends paycheck to employee
	public void getPaid() {cash = salary * hours;}
	
}
