import java.util.*;

public class Main {

	static Scanner Scanner = new Scanner(System.in);
	static int time = Scanner.nextInt();
	static int choice = Scanner.nextInt();
	static int[] chores = new int[choice];

	public static void main(String[] args) {

		for (int i = 0; i < choice; i++) {
			chores[i] = Scanner.nextInt();
		}
		Arrays.sort(chores);
		int ok = 0;
		int sum = 0;
		for (int j = 0; j < chores.length; j++) {
			if (sum + chores[j] <= time) {
				sum += chores[j];
				ok++;
			}
		}

		System.out.println(ok);

	}

}
