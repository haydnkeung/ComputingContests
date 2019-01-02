import java.util.Scanner;

public class Main {

	static final Scanner userInput = new Scanner(System.in);
	static final int numOfJ = userInput.nextInt();
	static final int numOfA = userInput.nextInt();
	static Integer[] avalible = new Integer[numOfJ];
	static Integer[][] requests = new Integer[numOfA][2];

	public static void main(String args[]) {

		String strAvalible;
		for (int i = 0; i < numOfJ; i++) {

			strAvalible = userInput.next();

			if (strAvalible.equals(("S"))) {
				avalible[i] = 0;
			} else if (strAvalible.equals(("M"))) {
				avalible[i] = 1;
			} else {
				avalible[i] = 2;
			}
		}
		for (int j = 0; j < numOfA; j++) {
			requests[j] = new Integer[] { refactor(userInput.next()), userInput.nextInt() };

		}
		System.out.println(execute());

		/*
		 * for (int z = 0;z< requests.length;z++){
		 * System.out.println(Arrays.asList(requests[z])); }
		 */

	}

	public static int execute() {
		int possible = 0;
		int temp;

		for (int m = 0; m < requests.length; m++) {
			temp = requests[m][1] -1;

			if (requests[m][0] <= avalible[temp]) {

				avalible[temp] = -1;
				possible++;

			}

		}

		return possible;
	}

	public static int refactor(String input) {

		if (input.equals("S")) {
			return 0;
		} else if (input.equals("M")) {
			return 1;
		} else {
			return 2;
		}

	}
}
