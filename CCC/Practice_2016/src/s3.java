import java.util.*;

public class s3 {

	static final Scanner scanner = new Scanner(System.in);
	static int sensors = scanner.nextInt();
	static int[] signal = new int[sensors];
	static int result = 0;
	static String all = "";
	static ArrayList<Integer> streaks = new ArrayList<Integer>();

	public static void main(String args[]) {
		for (int i = 0; i < sensors; i++) {
			signal[i] = scanner.nextInt();
		}
		Arrays.sort(signal);

		for (int j = 0; j < sensors; j++) {
			all += signal[j] + " ";
		}
		all.trim();
		System.out.println(all);

		for (int k = 0; k < sensors; k++) {
			int record = 0;
			for (int m = 0; m < sensors - 1; m++) {
				if (all.substring(m, m + 1) == all.substring(m + 1, m + 2)) {
					record++; 
				}
			}
			streaks.add(record);
		}

		result = signal[sensors - 1] - signal[0];
		System.out.println(result);

	}

}
