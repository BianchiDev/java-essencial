package entities;

public class employee {
	public String name;
	public double grossSalary;
	public double tax;

	

	public employee(String name, double grossSalary, double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public double getNetSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * (percentage / 100);
	}

	@Override
	public String toString() {
		return name + ", $ " + getNetSalary();
	}

}
