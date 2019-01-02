import java.util.Scanner;

public class Main {

	static final Scanner userInput = new Scanner(System.in);
	static int year = userInput.nextInt();
	static boolean resultFound = false;
	static String strYear = Integer.toString(year);
	static int amountOfDigits = strYear.length();
	static String collection = "";
	static boolean goodYear = true;

	public static void main(String[] args) {
		executeCode();
	}

	public static void executeCode() {
		resultFound = false;
		while (resultFound == false) {
			year++;
			strYear = Integer.toString(year);
			amountOfDigits = strYear.length();
			collection = "";
			collection = collection + strYear.substring(0, 1);
			goodYear = true;
			for (int i = 1; i < amountOfDigits; i++) {
				if (collection.indexOf(strYear.substring(i, i + 1)) < 0) {
					collection = collection + strYear.substring(i, i + 1);
				} else {
					goodYear = false;
				}

			}

			if (goodYear == true) {
				resultFound = true;
			}

		}
		System.out.println(collection);
	}

}
