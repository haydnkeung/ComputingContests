import java.util.*;

public class Main {

	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in);
		int numOfPie = userInput.nextInt();
		int numOfHumans = userInput.nextInt();
		userInput.close();

		System.out.println(execute(numOfPie, numOfHumans));
	}

	public static int execute(int numOfPie, int numOfHumans) {
		int result = 0;
		int ok = 0;
		int pieces = numOfPie;
		Integer[] possible = new Integer[numOfHumans];
		if (numOfPie == 1|| numOfHumans == 1) {
			return 1;
		} else {
			System.out.println("TRUE");
			result = result * execute(numOfPie - 1, numOfHumans - 1);
			ok++;
			return result;

		}

	}

}
