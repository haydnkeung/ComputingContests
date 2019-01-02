import java.util.*;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	static int maxW = scanner.nextInt();
	static int cars = scanner.nextInt();
	static int[] list = new int[cars];
	static int counter = 0;
	static boolean firstTime = true;
	static boolean notFirst = false;

	public static void main(String args[]) {

		for (int i = 0; i < cars; i++) {
			list[i] = scanner.nextInt();
		}

		all: for (int j = 0; j <= cars - 4; j++) {
			int temp = 0;
			int temp1 = 0;
			for (int k = 0; k < 4; k++) {
				//System.out.println("J is " + j);
				//System.out.println("K is " + k);
			//	System.out.println("J + K is " + (j + k));
			//	System.out.println("Value in J+K is " + list[j + k]);
				temp1 = temp + list[j + k];
				if (temp1 <= maxW) {
					temp += list[j + k];
					if (firstTime) {
						counter++;
					}
					//System.out.println("Logic 1 occurered and temp is " + temp);
					//System.out.println("Car is ok");
					//System.out.println("Counter is " + counter);
				} else {

				//	System.out.println("The break was called");
					//System.out.println(temp += list[j + k]);
					break all;
				}
			}

			
			if (!firstTime) {
				counter++;
			}
			firstTime = false;
			// atLeastOnce = true;
			// counter++;
		}
		System.out.println(counter);

	}

}