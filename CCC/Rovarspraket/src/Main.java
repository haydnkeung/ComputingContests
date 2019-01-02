import java.util.Scanner;

public class Main {

	static Scanner userInput = new Scanner(System.in);

	static String vowel = ("aeiou");

	static String consonant = ("bcdfghjklmnpqrstvwxyzz");
	static String alphabet = ("abcdefghijklmnopqrstuvwxyz");

	static String stringInput = userInput.nextLine();

	static int length = stringInput.length();

	static String returnValue = ("");

	static public void main(String[] args) {
		executeCode();

	}

	public static void executeCode() {

		for (int i = 0; i < length; i++) {
			String stringCheck = stringInput.substring(i, i + 1);

			if (vowel.indexOf(stringCheck) >= 0)//
			{
				// V
				returnValue = returnValue + stringCheck;

			} else {
				returnValue = returnValue + stringCheck;
				int Alphapos = alphabet.indexOf(stringCheck) + 2;//
				int ConsPos = consonant.indexOf(stringCheck) + 1;//

				String nextCon = consonant.substring(ConsPos, ConsPos + 1);

				if (Alphapos < 5) {
					if (Alphapos < 4) {
						returnValue = returnValue + "a";
						returnValue = returnValue + nextCon;

					} else {
						returnValue = returnValue + "e";
						returnValue = returnValue + nextCon;
					}
				} else if (Alphapos < 9) {
					if (Alphapos < 8) {
						returnValue = returnValue + "e";
						returnValue = returnValue + nextCon;
					} else {
						returnValue = returnValue + "i";
						returnValue = returnValue + nextCon;
					}

				} else if (Alphapos < 15) {
					if (Alphapos < 14) {
						returnValue = returnValue + "i";
						returnValue = returnValue + nextCon;
					} else {
						returnValue = returnValue + "o";
						returnValue = returnValue + nextCon;
					}
				} else {
					if (Alphapos < 19) {
						returnValue = returnValue + "o";
						returnValue = returnValue + nextCon;
					} else {
						returnValue = returnValue + "u";
						returnValue = returnValue + nextCon;
					}

				}

			}

		}

		System.out.println(returnValue);
	}
}
