import java.util.Scanner;

public class BasePlusCommisionEmployee extends CommisionEmployee {
	private double baseSalary;
	
	@Override
	public String toString() {
		return "Updated employee information obtained by toString and earnings:\n"+"First name: "+getFirstName()+"\nLast Name: "+getLastName()
				+"\nSocial Security Number: "+getSocialSecurityNumber()+"\nGross Sales: "+getGrossSales()+"\nCommision Rate: "+getCommisionRate()+
				"\nBase Salary: "+baseSalary+"\nEarnings: "+earning();
	}
	public BasePlusCommisionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSales,double commisionRate,double baseSalary) {
		super(firstName,lastName,socialSecurityNumber,grossSales,commisionRate);
		this.baseSalary=baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary=baseSalary;
	}

	public void inputbaseSalary() {
		while(true) {
			System.out.print("Enter the Base Salary= ");
			Scanner scan = new Scanner(System.in);
			baseSalary=scan.nextDouble();
			this.baseSalary = baseSalary;
			if(baseSalary<=0) {
				System.out.println("You less than or equal to 0, please enter valid number.");
			}
			else {
				break;
			}
		}
	}
	public double earning() {
		return (getGrossSales()*getCommisionRate())+baseSalary;
	}
}
