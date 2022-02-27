import java.util.Scanner;

public class BasePlusCommisionEmployee {
	public BasePlusCommisionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSales,double commisionRate,double baseSalary) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.socialSecurityNumber=socialSecurityNumber;
		this.grossSales=grossSales;
		this.commisionRate=commisionRate;
		this.baseSalary=baseSalary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales=grossSales;
	}
	public double getCommisionRate() {
		return commisionRate;
	}
	public void setCommisionRate(double commisionRate) {
		this.commisionRate=commisionRate;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary=baseSalary;
	}
	public void inputgrossSales() {
		while(true) {
			System.out.print("Enter the Gross Sales= ");
			Scanner scan = new Scanner(System.in);
			grossSales=scan.nextDouble();
			this.grossSales = grossSales;
			if(grossSales<=0) {
				System.out.println("You less than or equal to 0, please enter valid number.");
			}
			else {
				break;
			}
		}
	}
	public void inputcommisionRate() {
		while(true) {
			System.out.print("Enter the Commision Rate= ");
			Scanner scan = new Scanner(System.in);
			commisionRate=scan.nextDouble();
			this.commisionRate = commisionRate;
			if(commisionRate<=0 || commisionRate>=1) {
				System.out.println("You entered out of (0-1) numbers please enter valid number.");
			}
			else {
				break;
			}
		}
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
		return (grossSales*commisionRate)+baseSalary;
	}
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commisionRate;
	private double baseSalary;
}
