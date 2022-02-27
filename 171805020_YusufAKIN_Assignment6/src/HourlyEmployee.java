
public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;

	public HourlyEmployee(String name, String lastName, String socialSecurityNumber, double wage, int hours) {
		super(name, lastName, socialSecurityNumber);
		if (wage >= 0) {
			this.wage = wage;
		} else {
			System.out.println("******Please enter bigger than 0 for wage!******");
		}
		if (hours >= 0 && hours < 168) {
			this.hours = hours;
		} else {
			System.out.println("******Please enter between 0 and 168(168 not include) for hours!******");
		}
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage >= 0) {
			this.wage = wage;
		} else {
			System.out.println("Please enter bigger than 0 for wage!");
		}
	}

	public double getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours >= 0 && hours < 168) {
			this.hours = hours;
		} else {
			System.out.println("Please enter between 0 and 168(168 not include) for hours!");
		}
	}

	@Override
	public double getPaymentAmount() {
		if (hours <= 40) {
			return wage * hours;
		} else {
			return 40 * wage + (hours - 40) * wage * 1.5;
		}
	}

	@Override
	public String toString() {
		return "Hourly Employee: " + getName() + " " + getLastName() + "\nSocial Security Number: "
				+ getSocialSecurityNumber() + "\nHourly Wage: " + wage + " " + "Hours worked: " + hours+
				"\nPayment Amount: "+getPaymentAmount()+"\n";
	}

}
