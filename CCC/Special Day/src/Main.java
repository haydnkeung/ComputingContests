
// @author : Haydn K,University of Waterloo Question J1.
import java.util.*;

public class Main {

	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		executeCode();

	}

	public static void executeCode() {
		int month = userInput.nextInt();
		int date = userInput.nextInt();

		if (month < 2) {
			System.out.println("Before");
		} else if (month > 2) {
			System.out.println("After");
		} else if (date < 18) {
			System.out.println("Before");
		} else if (date > 18) {
			System.out.println("After");
		} else {
			System.out.println("Special");
		}
	}
}