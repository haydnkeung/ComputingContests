
//j4
import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	static String time = scanner.nextLine();
	static String hourTemp = time.substring(0, 2);
	static String minTemp = time.substring(3, 5);
	static int hour = Integer.parseInt(hourTemp);
	static int min = Integer.parseInt(minTemp);
	static int result = 0;

	public static void main(String args[]) {

		for (int i = 0; i < 120; i++) {

			if (hour >= 7 && hour < 10) {
				// System.out.println("Logic1");
				min += 2;

				if (min > 59) {

					hour++;
					min = min % 60;

				}
				if (hour > 23) {
					hour = 0;
				}

			}

			else if (hour >= 15 && hour < 19) {
				// System.out.println("Logic2");
				min += 2;

				if (min > 59) {

					hour++;
					min = min % 60;

				}
				if (hour > 23) {
					hour = 0;
				}

			} else {
				// System.out.println("OK");
				min++;

				if (min > 59) {

					hour++;
					min = min % 60;

				}
				if (hour > 23) {
					hour = 0;
				}
			}

		}
		if (min == 0 && hour < 10) {
			System.out.println("0" + hour + ":00");
		}

		else if (min == 0) {
			System.out.println(hour + ":00");
		} else if (hour < 10) {
			System.out.println("0" + hour + ":" + min);
		}

		else {
			System.out.println(hour + ":" + min);
		}

	}

}