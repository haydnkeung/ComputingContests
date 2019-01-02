import java.util.Scanner;

public class Main {
	static final Scanner userInput = new Scanner(System.in);

	static int angleA = userInput.nextInt();
	static int angleB = userInput.nextInt();
	static int angleC = userInput.nextInt();

	static public void main(String[] args) {

		executeCode();
	}

	public static void executeCode() {
		if (angleA == 60 && angleB == 60 && angleC == 60) {
			System.out.println("Equilateral");
		} else if (angleA == angleB && angleA + angleB + angleC == 180
				|| angleB == angleC && angleA + angleB + angleC == 180
				|| angleA == angleB && angleA + angleB + angleC == 180
				|| angleA == angleC && angleA + angleB + angleC == 180) {
			System.out.println("Isosceles");

		} else if (angleA + angleB + angleC == 180) {
			System.out.println("Scalene");

		} else {
			System.out.println("Error");
		}

	}

}
