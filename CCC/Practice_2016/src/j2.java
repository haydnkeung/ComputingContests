import java.util.*;
//import java.util.Math;

public class j2 {

	static Scanner scanner = new Scanner(System.in);
	static int h = scanner.nextInt();
	static int maxTime = scanner.nextInt();
	static int T = 0;

	public static int raisePower(int toRaise, int raiseBy) {
		return (int) Math.pow(toRaise, raiseBy);
	}

	public static void main(String args[]) {

		for (int t = 1; t <= maxTime; t++) {
			int formula = (-6 * (raisePower(t, 4))) + (h * (raisePower(t, 3))) + (2 * (raisePower(t, 2))) + t;
			//System.out.println("Formula is " + formula + " and value of t is " + t + " and value of h is " + h);
			//System.out.println(raisePower(3,3));
			if (formula <= 0) {
				T = t;
				break;
			}
		}
		if (T > 0) {
			System.out.println("The balloon first touches ground at hour:");
			System.out.println(T);
		} else {
			System.out.println("The balloon does not touch ground in the given time.");
		}

	}

}
