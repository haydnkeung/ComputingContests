import java.util.Scanner;

public class Main {

	static Scanner userInput = new Scanner(System.in);
	static int inputA = userInput.nextInt();
	static int inputB = userInput.nextInt();
	static int inputC = userInput.nextInt();
	static int inputD = userInput.nextInt();

	public static void main(String[] args) {

		executeCode();

	}

	public static void executeCode() {
		if (inputA == inputB && inputB == inputC && inputC == inputD) {
			System.out.println("Fish At Constant");
		} else if (inputA > inputB && inputB > inputC && inputC > inputD) {
			System.out.println("Fish Diving");
		} else if (inputA < inputB && inputB < inputC && inputC < inputD) {
			System.out.println("Fish Rising");
		} else {
			System.out.println("No Fish");
		}
	}

}
