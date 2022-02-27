
public class Test {
	public static void print(Employee[] employees) {

		for (Employee employee : employees) {
			System.out.println(employee.toString());
			System.out.println("Earnings: " + employee.earning() + "\n");
		}
	}

	public static void main(String[] args) {
		SalariedEmployee salariedEmployee = new SalariedEmployee("Yusuf", "AKIN", "171805020", 500);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Philip", "Price", "325567812", 14.25, 50);
		CommisionEmployee commisionEmployee = new CommisionEmployee("Angela", "Moss", "432156900", 0.5, 500);
		BasePlusCommisionEmployee basePlusCommisionEmployee = new BasePlusCommisionEmployee("Xun", "Zhang", "435566912",
				0.4, 600, 800);
		Employee[] employees = new Employee[] { salariedEmployee, hourlyEmployee, commisionEmployee,
				basePlusCommisionEmployee };
		System.out.println("-----Employee Information Obtained By toString And earnings-----");
		print(employees);
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] instanceof BasePlusCommisionEmployee) {
				double baseSalary = basePlusCommisionEmployee.getBaseSalary();
				basePlusCommisionEmployee.setBaseSalary(baseSalary * 1.1);
			}
		}
		System.out.println("-----Employee Array Processed Polymorphically-----");
		print(employees);
		for (int i = 0; i < employees.length; i++) {
			System.out.println("Employee " + (i + 1) + " is a " + employees[i].getClass().getName());
		}
	}

}
