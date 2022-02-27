
public class SalariedEmployee extends Employee {
	private double weeklySalary;

	public SalariedEmployee(String name, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(name, lastName, socialSecurityNumber);
		if (weeklySalary >= 0) {
			this.weeklySalary = weeklySalary;
		} else {
			System.out.println("******Please enter bigger than 0 for weekly salary!******");
		}
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary >= 0) {
			this.weeklySalary = weeklySalary;
		} else {
			System.out.println("******Please enter bigger than 0 for weekly salary!******");
		}
	}

	@Override
	public double earning() {
		return weeklySalary;
	}

	@Override
	public String toString() {
		return "Salaried Employee: " + getName() + " " + getLastName() + "\nSocial Security Number: "
				+ getSocialSecurityNumber() + "\nWeekly Salary: " + weeklySalary;
	}
}
