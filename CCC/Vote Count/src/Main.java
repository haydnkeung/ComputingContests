import java.util.Scanner;

public class Main {

	static Scanner userInput = new Scanner(System.in);

	static String strA = ("A");
	static String strB = ("B");

	static int intA = 0;
	static int intB = 0;

	static int length = userInput.nextInt();
	static String captureString = userInput.next();

	static public void main(String[] args) {
		executeCode();
	}

	public static void executeCode() {
		for (int i = 0; i < length; i++) {
			String subString = captureString.substring(i, i + 1);
			if (subString.equals(strA)) {
				intA++;
			} else if (subString.equals(strB)) {
				intB++;
			}

		}
		if (intA == intB) {
			System.out.println("Tie");
		} else if (intA > intB) {
			System.out.println("A");
		} else if (intA < intB) {
			System.out.println("B");
		}
	}
}