import java.util.Scanner;

public class GetTheInput {

	public static void main(String[] args) {
		// create Scanner to obtain input from command line
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		String str = input.nextLine();
		input.close();
		System.out.println(i);
		System.out.println(str);
	}

}
