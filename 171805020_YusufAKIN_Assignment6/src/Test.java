
public class Test {

	public static void main(String[] args) {
		Payable payableObjects[] = new Payable[6];
		payableObjects[0] = new Invoice(3214567, "seat", 25, 85.90);
		payableObjects[1] = new Invoice(171805020, "tire", 50, 43.00);
		payableObjects[2] = new SalariedEmployee("Elliot", "Alderson", "141-312-41", 980.75);
		payableObjects[3] = new HourlyEmployee("Angela", "Moss", "972-353-66", 15.32, 55);
		payableObjects[4] = new CommisionEmployee("Xun", "Zhong", "231-586-12", 0.3, 3000);
		payableObjects[5] = new BasePlusCommisionEmployee("Philip", "Price", "666-552-12", 0.2, 4000, 2500);
		BasePlusCommisionEmployee baseplus = new BasePlusCommisionEmployee("Philip", "Price", "666-552-12", 0.2, 4000,
				2500);

		System.out.println("----Invoices and Employees processed polymorphically");
		for (int i = 0; i < payableObjects.length; i++) {
			if (payableObjects[i] instanceof BasePlusCommisionEmployee) {
				System.out.println(payableObjects[i].toString());
				baseplus.setBaseSalary(baseplus.getBaseSalary() * 1.10);
				payableObjects[i] = baseplus;
				System.out.println("With New Base Salary " + payableObjects[i].toString());
			} else {
				System.out.println(payableObjects[i].toString());
			}

		}
		for (int i = 0; i < payableObjects.length; i++) {
			System.out.println("Payable Object " + i + " is a " + payableObjects[i].getClass().getName());
		}
	}
}
