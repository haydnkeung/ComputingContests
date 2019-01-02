import java.util.Scanner;

public class Main {

	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		executeCode();
	}

	public static void executeCode() {
		System.out.print("Enter the speed limit: ");
		System.out.print("Enter the recorded speed of the car: ");

		int speedLimit = userInput.nextInt();
		int yourSpeed = userInput.nextInt();

		if (yourSpeed <= speedLimit) {
			System.out.println("Congratulations, you are within the speed limit!");

		} else if (yourSpeed - speedLimit <= 20) {
			System.out.println("You are speeding and your fine is $100.");
		} else if (yourSpeed - speedLimit <= 30) {
			System.out.print("You are speeding and your fine is $270.");
		} else {
			System.out.println("You are speeding and your fine is $500.");
		}
	}
}
