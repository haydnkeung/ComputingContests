//The question is so mislead the "x" is actually a lower case NOT uppercase
import java.util.*;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	static int size = scanner.nextInt();
	static ArrayList<String> result = new ArrayList<String>();
	static String myAnswer = "";

	public static void main(String args[]) {

		for (int j = 0; j < size; j++) {
			String temp = "";
			for (int i = 0; i < size; i++) {
				temp += "*";
			}
			for (int i = 0; i < size; i++) {
				temp += "x";
			}
			for (int i = 0; i < size; i++) {
				temp += "*";
			}
			temp.trim();
			myAnswer += temp + "\n";
			result.add(temp);

		}
		for (int j = 0; j < size; j++) {
			String temp = "";
			for (int i = 0; i < size; i++) {
				temp += " ";
			}
			for (int i = 0; i < size; i++) {
				temp += "xx";
			}
			temp.trim();
			myAnswer += temp + "\n";
			result.add(temp);
		}

		for (int j = 0; j < size; j++) {
			String temp = "";
			for (int i = 0; i < size; i++) {
				temp += "*";
			}
			for (int i = 0; i < size; i++) {
				temp += " ";
			}
			for (int i = 0; i < size; i++) {
				temp += "*";
			}
			temp.trim();
			result.add(temp);

			if (j == size - 1) {
				myAnswer += temp;
			} else {
				myAnswer += temp + "\n";
			}

		}

		// for (int theta = 0; theta < result.size(); theta++) {
		// System.out.println(result.get(theta));
		// }
		myAnswer.trim();
		System.out.println(myAnswer);

	}

}



















/*
import java.util.Scanner;

public class Main {

	static final Scanner userInput = new Scanner(System.in);
	static final int multiplyBy = userInput.nextInt();
	static final String[][] icon = new String[][] { { "*", "x", "*" }, { " ", "x", "x" }, { "*", " ", "*" } };

	public static void main(String[] args) {
		executeCode();
	}

	public static void executeCode() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < multiplyBy; j++) {
				for (int k = 0; k < 3; k++) {
					String result = icon[i][k];
					for (int l = 0; l < multiplyBy; l++) {
						System.out.print(result);
					}
				}
				System.out.println();
			}
		}

	}

}

*/