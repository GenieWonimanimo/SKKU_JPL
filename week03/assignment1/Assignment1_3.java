import java.util.Scanner;
import java.util.Random;

public class Assignment1_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random randomGen = new Random();
		int cnt = 0;
		for (int i = 1; i <= 5; i++) {
			int randomNum = randomGen.nextInt(10); // generate random number, 0 ~ 9
			System.out.print("Question " + i + ": Square of " + randomNum + ": ");
			int ans = input.nextInt(); // prompt user to input the correct answer
			if (ans == randomNum * randomNum) // if user inputted correct answer, count!
				cnt++;
		}
		input.close();
		System.out.println("Number of correct answers: " + cnt);
		switch (cnt) {
		case 0:
			System.out.print("Try again.");
			break;
		case 1:
			System.out.print("Very bad.");
			break;
		case 2:
			System.out.print("Not bad.");
			break;
		case 3:
			System.out.print("Good.");
			break;
		case 4:
			System.out.print("Very good!");
			break;
		case 5:
			System.out.print("Excellent!");
		}
	}
} 