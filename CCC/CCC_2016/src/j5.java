
//j5

import java.util.*;

public class j5 {

	static Scanner scanner = new Scanner(System.in);
	static int Q = scanner.nextInt();
	static int N = scanner.nextInt();
	static ArrayList<Integer> country1 = new ArrayList<Integer>();
	static ArrayList<Integer> country2 = new ArrayList<Integer>();
	static ArrayList<Integer> all = new ArrayList<Integer>();

	public static void main(String args[]) {

		for (int i = 0; i < N; i++) {
			int add = scanner.nextInt();
			country1.add(add);
			all.add(add);

		}
		for (int i = 0; i < N; i++) {
			int add = scanner.nextInt();
			country2.add(add);
			all.add(add);
		}

		if (Q == 1) {
			int value = 0;
			Collections.sort(country1);
			Collections.sort(country2);
			Collections.reverse(country1);
			Collections.reverse(country2);
			for (int i = 0; i < N; i++) {
				int temp1 = country1.get(i);
				int temp2 = country2.get(i);
				if (temp1 > temp2) {
					value += temp1;
				} else {
					value += temp2;
				}

			}
			System.out.println(value);

			// System.out.println("Debug:" + Arrays.asList(country1));
			// System.out.println("Debug:" + Arrays.asList(country2));

		}
		if (Q == 2) {
			int value = 0;
			Collections.sort(all);
			Collections.reverse(all);
			for (int i = 0; i < N; i++) {
				value += all.get(i);
			}
			System.out.println(value);
		}

	}

}