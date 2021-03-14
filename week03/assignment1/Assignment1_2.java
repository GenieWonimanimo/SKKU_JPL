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
		
		int payForRegular;
		int payForExtra;
		if (hours < 40) { // if hours < 40, we don't need to cal payForExtra
			payForRegular = pay * hours;
			payForExtra = 0;
		}
		else { // hours >= 40, we have to cal payForExtra
			payForRegular = pay * 40; // worker can't work more than 40 hours
			payForExtra = pay_extra * (hours - 40); // extra hours exceed 40 hours are calculated with pay_extra
		}
		
		System.out.println("Payment for regular hours ($): " + payForRegular);
		System.out.println("Payment for extra hours ($): " + payForExtra);
		System.out.println("Total payment ($): " + (payForRegular + payForExtra));
		input.close();
	}
}
