import java.util.Scanner;

class Invoice {
	private String name;
	private int qt;
	private double price;
	
	public Invoice(String name, int qt, double price) {
		this.name = name;
		this.qt = qt;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQt() {
		return qt;
	}
	public void setQt(int qt) {
		this.qt = qt;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	// this method return invoice amount(quantity * price)
	public double getInvoiceAmount() {
		return qt * price;
	}
}


public class InvoiceTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int qt;
		double price;
		System.out.print("Product name: ");
		name = input.nextLine();
		System.out.print("Quantity: ");
		qt = input.nextInt();
		System.out.print("Price ($): ");
		price = input.nextDouble();
		Invoice inv = new Invoice(name, qt, price);
		System.out.println("Total invoice amount: $" + inv.getInvoiceAmount());
		input.close();
	}

}
