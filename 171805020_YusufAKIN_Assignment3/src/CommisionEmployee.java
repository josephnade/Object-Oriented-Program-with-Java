import java.util.Scanner;

public class CommisionEmployee {
public CommisionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSales,double commisionRate) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.socialSecurityNumber=socialSecurityNumber;
		this.grossSales=grossSales;
		this.commisionRate=commisionRate;
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
	public double earning() {
		return grossSales*commisionRate;
	}
	public void inputgrossSale() {
		while(true) {
			System.out.print("Enter the Gross Sales= ");
			Scanner scan = new Scanner(System.in);
			this.grossSales=scan.nextDouble();
			if(this.grossSales<=0) {
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
			Scanner s = new Scanner(System.in);
			this.commisionRate=s.nextDouble();
			if(this.commisionRate<=0 || this.commisionRate>=1) {
				System.out.println("You entered out of (0-1) numbers please enter valid number.");
			}
			else {
				break;
			}
		}
	}
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commisionRate;

}