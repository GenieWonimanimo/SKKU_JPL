import java.util.Scanner;

public class Assignment1_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pay;
		int pay_extra;
		int hours;
		System.out.print("Payment for one hour ($): ");
		pay = input.nextInt();
		System.out.print("Payment for one extra hour ($): ");
		pay_extra = input.nextInt();
		System.out.print("Number of hours: ");
		hours = input.nextInt();
		
		int payForRegular = pay * (hours / 40 * 40);
		int payForExtra = pay_extra * (hours % 40);
		System.out.println("Payment for regular hours ($): " + payForRegular);
		System.out.println("Payment for extra hours ($): " + payForExtra);
		System.out.println("Total payment ($): " + (payForRegular + payForExtra));
		input.close();
	}
}
