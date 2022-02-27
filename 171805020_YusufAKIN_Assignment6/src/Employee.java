
public abstract class Employee implements Payable {
	private String name;
	private String lastName;
	private String socialSecurityNumber;

	public Employee(String name, String lastName, String socialSecurityNumber) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String toString() {
		return name + lastName + "\nSocial Security Number: " + socialSecurityNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}
