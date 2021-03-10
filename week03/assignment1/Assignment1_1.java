import java.util.Scanner;

public class Assignment1_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r;
		double h;
		final double PI = 3.14;
		System.out.print("Radius (cm): ");
		r = input.nextInt();
		System.out.print("Height (cm): ");
		h = input.nextDouble();
		System.out.println("Volume of the cylinder: " + (PI * r * r * h));
		input.close();
	}
}