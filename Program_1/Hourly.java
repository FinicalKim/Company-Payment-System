package Program_1;
/*
Description: interface for AdministrativeAssistant class to use abstract methods
*/
public interface Hourly {

	public int getHours();
	
	public void setHours(int changeHours);
	
	public void giveRaise(double increaseHourly);
}
