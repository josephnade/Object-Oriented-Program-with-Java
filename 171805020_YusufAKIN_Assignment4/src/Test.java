import java.util.Scanner;
public class Test {

	public static void printbase(BasePlusCommisionEmployee employee) {
		System.out.println("First Name : "+employee.getFirstName());
		System.out.println("Last Name : "+employee.getLastName());
		System.out.println("Social Security Number : "+employee.getSocialSecurityNumber());
		System.out.println("Gross Rate: "+employee.getGrossSales());
		System.out.println("Commision Rate: "+employee.getCommisionRate());
		System.out.println("Base Salary: "+employee.getBaseSalary());
		System.out.println("Earning: "+employee.earning());
	}
	public static void main(String[] args) {
		BasePlusCommisionEmployee salaryemployee=new BasePlusCommisionEmployee("Yusuf","AKIN","171805020",1,0.1,1);
		salaryemployee.inputgrossSales();
		salaryemployee.inputcommisionRate();
		salaryemployee.inputbaseSalary();
		System.out.println("Employee information obtained by get methods and earnings:");
		printbase(salaryemployee);
		salaryemployee.inputbaseSalary();
		System.out.println(salaryemployee.toString());
	}

}
