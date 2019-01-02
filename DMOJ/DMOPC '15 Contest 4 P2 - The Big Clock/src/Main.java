import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int hour = Scanner.nextInt();
		int min = Scanner.nextInt();
		int toAdd = Scanner.nextInt();

		min += toAdd;
		if (min > 59) {
			int calculate = Math.floorDiv(min, 60);
			hour += calculate;
			min = min % 60;

		}
		if (hour > 23) {
			hour = hour % 24;
		}

		System.out.println(hour + " " + min);

	}
}
