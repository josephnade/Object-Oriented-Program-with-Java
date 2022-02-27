
public class CommisionEmployee extends Employee {
	private double commisionRate;
	private double grossSales;

	public CommisionEmployee(String name, String lastName, String socialSecurityNumber, double commisionRate,
			double grossSales) {
		super(name, lastName, socialSecurityNumber);
		if (commisionRate > 0 && commisionRate < 1) {
			this.commisionRate = commisionRate;
		} else {
			System.out.println("******Please enter 0-1 number for commision rate!******");
		}
		if (grossSales >= 0) {
			this.grossSales = grossSales;
		} else {
			System.out.println("******Please enter bigger than 0 for gross sales!******");
		}
	}

	public double getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(double commisionRate) {
		if (commisionRate > 0 && commisionRate < 1) {
			this.commisionRate = commisionRate;
		} else {
			System.out.println("*****Please enter 0-1 number for commision rate!*****");
		}
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if (grossSales >= 0) {
			this.grossSales = grossSales;
		} else {
			System.out.println("******Please enter bigger than 0 for gross sales!******");
		}
	}

	@Override
	public double earning() {
		return commisionRate * grossSales;
	}

	@Override
	public String toString() {
		return "Commision Employee: " + getName() + " " + getLastName() + "\nSocial Security Number: "
				+ getSocialSecurityNumber() + "\nGross Sales: " + grossSales + "\nCommision Rate: " + commisionRate;
	}

}
