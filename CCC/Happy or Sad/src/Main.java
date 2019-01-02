
// @author : Haydn K,University of Waterloo Question J2.
import java.util.*;

public class Main {

	static Scanner userInput = new Scanner(System.in);

	static String strH = ":-)";
	static String strS = ":-(";

	static int happy = 0;
	static int sad = 0;

	static String stringInput = userInput.nextLine();

	static int L = stringInput.length() - 2;

	static public void main(String[] args) {

		executeCode();
	}

	public static void executeCode() {
		for (int i = 0; i < L; i++) {
			String stringCheck = stringInput.substring(i, i + 3);
			if (stringCheck.equals(strH)) {
				happy++;
			} else if (stringCheck.equals(strS)) {
				sad++;
			}

		}

		if (happy == 0 && sad == 0) {
			System.out.println("none");
		} else if (happy == sad) {
			System.out.println("unsure");
		} else if (happy < sad) {
			System.out.println("sad");
		} else {
			System.out.println("happy");
		}
	}
}
