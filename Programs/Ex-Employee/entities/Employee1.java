package entities;

public class Employee1 {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		
		return grossSalary-tax;
	}
	
	public double increaseSalary(double percentage) {
		
		return netSalary() + grossSalary * percentage;
	}
	
}
