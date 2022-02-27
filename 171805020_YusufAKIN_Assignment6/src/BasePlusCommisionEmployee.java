
public class BasePlusCommisionEmployee extends CommisionEmployee {
	private double baseSalary;

	public BasePlusCommisionEmployee(String name, String lastName, String socialSecurityNumber, double commisionRate,
			double grossSales, double baseSalary) {
		super(name, lastName, socialSecurityNumber, commisionRate, grossSales);
		if (baseSalary >= 0) {
			this.baseSalary = baseSalary;
		} else {
			System.out.println("******Please enter bigger than 0 for base salary!******");
		}

	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary >= 0) {
			this.baseSalary = baseSalary;
		} else {
			System.out.println("******Please enter bigger than 0 for base salary!******");
		}

	}

	@Override
	public double getPaymentAmount() {
		return super.getPaymentAmount() + baseSalary;
	}

	@Override
	public String toString() {
		return "Base Salaried Commision Employee: " + super.getName() + " " + super.getLastName()
				+ "\nSocial Security Number: " + super.getSocialSecurityNumber() + "\nGross Sales: " + getGrossSales()
				+ "	Commision Rate: " + getCommisionRate() + "\nBase Salary: " + baseSalary + "\nPayment Amount: "
				+ getPaymentAmount()+"\n";
	}

}
