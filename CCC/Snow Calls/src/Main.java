
import java.util.*;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	static int tests = scanner.nextInt();
	static String[] array = new String[tests];

	public static void main(String args[]) {

		for (int i = 0; i < tests; i++) {
			array[i] = scanner.next();
		}
		for (int j = 0; j < tests; j++) {
			for (int k = 0; k < array[j].length(); k++) {
				if (array[j].substring(k, k + 1).equals("A") || array[j].substring(k, k + 1).equals("B")
						|| array[j].substring(k, k + 1).equals("C")) {
					array[j] = array[j].substring(0, k) + "2" + array[j].substring(k + 1, array[j].length());
				} else if (array[j].substring(k, k + 1).equals("D") || array[j].substring(k, k + 1).equals("E")
						|| array[j].substring(k, k + 1).equals("F")) {
					array[j] = array[j].substring(0, k) + "3" + array[j].substring(k + 1, array[j].length());
				} else if (array[j].substring(k, k + 1).equals("G") || array[j].substring(k, k + 1).equals("H")
						|| array[j].substring(k, k + 1).equals("I")) {
					array[j] = array[j].substring(0, k) + "4" + array[j].substring(k + 1, array[j].length());
				} else if (array[j].substring(k, k + 1).equals("J") || array[j].substring(k, k + 1).equals("K")
						|| array[j].substring(k, k + 1).equals("L")) {
					array[j] = array[j].substring(0, k) + "5" + array[j].substring(k + 1, array[j].length());
				} else if (array[j].substring(k, k + 1).equals("M") || array[j].substring(k, k + 1).equals("N")
						|| array[j].substring(k, k + 1).equals("O")) {
					array[j] = array[j].substring(0, k) + "6" + array[j].substring(k + 1, array[j].length());
				} else if (array[j].substring(k, k + 1).equals("P") || array[j].substring(k, k + 1).equals("Q")
						|| array[j].substring(k, k + 1).equals("R") || array[j].substring(k, k + 1).equals("S")) {
					array[j] = array[j].substring(0, k) + "7" + array[j].substring(k + 1, array[j].length());
				} else if (array[j].substring(k, k + 1).equals("T") || array[j].substring(k, k + 1).equals("U")
						|| array[j].substring(k, k + 1).equals("V")) {
					array[j] = array[j].substring(0, k) + "8" + array[j].substring(k + 1, array[j].length());
				} else if (array[j].substring(k, k + 1).equals("W") || array[j].substring(k, k + 1).equals("X")
						|| array[j].substring(k, k + 1).equals("Y") || array[j].substring(k, k + 1).equals("Z")) {
					array[j] = array[j].substring(0, k) + "9" + array[j].substring(k + 1, array[j].length());
				}
			}
		}

		for (int p = 0; p < array.length; p++) {
			for (int q = 0; q < array[p].length() - 1; q++) {
				if (array[p].substring(q, q + 1).equals("-")) {
					array[p] = array[p].substring(0, array[p].indexOf("-"))
							+ array[p].substring(array[p].indexOf("-") + 1, array[p].length());
				}
			}
		}

		for (int l = 0; l < array.length; l++) {
			array[l] = array[l].substring(0, 10);
		}

		for (int m = 0; m < array.length; m++) {
			String arrayTemp = array[m].substring(0, array[m].length());
			array[m] = arrayTemp.substring(0, 3) + "-" + arrayTemp.substring(3, 6) + "-"
					+ arrayTemp.substring(6, array[m].length());
		}
		for (int n = 0; n < array.length; n++) {
			System.out.println(array[n]);
		}

	}

}
