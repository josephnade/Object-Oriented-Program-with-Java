
public class Invoice implements Payable {
	private int	partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	@Override
	public double getPaymentAmount() {
		return quantity*pricePerItem;
	}
	@Override
	public String toString() {
		return "Invoice:\n"+"Part Number: "+partNumber+" ("+partDescription+")"+"\nQuantity: "+quantity+"\nPrice Per Item: "+pricePerItem+
		"\nPayment Amount: "+getPaymentAmount()+"\n";	
	}
	public Invoice(int partNumber, String partDescription, int quantity, double pricePerItem) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		if(quantity>=0 && pricePerItem> 0 ) {
			this.quantity = quantity;
			this.pricePerItem = pricePerItem;
		}
		else {
			System.out.println("You entered invalid number for quantity or price.");
		}

	}
	public int getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(int partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

}
