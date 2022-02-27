import java.util.Scanner;
public class Test {
	public static void printcom(CommisionEmployee employee) {
		System.out.println("First Name : "+employee.getFirstName());
		System.out.println("Last Name : "+employee.getLastName());
		System.out.println("Social Security Number : "+employee.getSocialSecurityNumber());
		System.out.println("Gross Rate: "+employee.getGrossSales());
		System.out.println("Commision Rate: "+employee.getCommisionRate());
		System.out.println("Earning: "+employee.earning());
	}
	public static void updatecom(CommisionEmployee employee) {
		System.out.println("***Please update the gross sales and commision rate***");
		employee.inputgrossSale();
		employee.inputcommisionRate();
	}
	public static void printbase(BasePlusCommisionEmployee employee) {
		System.out.println("First Name : "+employee.getFirstName());
		System.out.println("Last Name : "+employee.getLastName());
		System.out.println("Social Security Number : "+employee.getSocialSecurityNumber());
		System.out.println("Gross Rate: "+employee.getGrossSales());
		System.out.println("Commision Rate: "+employee.getCommisionRate());
		System.out.println("Base Salary: "+employee.getBaseSalary());
		System.out.println("Earning: "+employee.earning());
	}
	public static void updatebase(BasePlusCommisionEmployee employee) {
		System.out.println("***Please update the base salary***");
		employee.inputbaseSalary();
	}
	public static void main(String[] args) {
		CommisionEmployee employee= new CommisionEmployee("Yusuf","AKIN","171805020",1,0.1);
		BasePlusCommisionEmployee salaryemployee=new BasePlusCommisionEmployee("Yusuf","AKIN","171805020",1,0.1,1);
		employee.inputgrossSale();
		employee.inputcommisionRate();
		System.out.println("---CommisionEmployee Information---");
		printcom(employee);
		updatecom(employee);
		System.out.println("---Updated CommisionEmployee Information---");
		printcom(employee);
		salaryemployee.inputgrossSales();
		salaryemployee.inputcommisionRate();
		salaryemployee.inputbaseSalary();
		printcom(employee);
		System.out.println("---BasePlusCommisionEmployee Information---");
		printbase(salaryemployee);
		updatebase(salaryemployee);
		System.out.println("---Updated BasePluCommisionEmployee Information---");
		printbase(salaryemployee);
	}

}
