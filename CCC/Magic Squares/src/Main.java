
//j2
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Integer> line1 = new ArrayList<Integer>();
	static ArrayList<Integer> line2 = new ArrayList<Integer>();
	static ArrayList<Integer> line3 = new ArrayList<Integer>();
	static ArrayList<Integer> line4 = new ArrayList<Integer>();
	static int value = 0;
	static int value2 = 0;
	static int value3 = 0;
	static int value4 = 0;
	static int value5 = 0;
	static int value6 = 0;
	static int value7 = 0;
	static int value8 = 0;

	public static void main(String args[]) {

		for (int i = 0; i < 4; i++) {
			line1.add(scanner.nextInt());
		}
		for (int i = 0; i < 4; i++) {
			line2.add(scanner.nextInt());
		}
		for (int i = 0; i < 4; i++) {
			line3.add(scanner.nextInt());
		}
		for (int i = 0; i < 4; i++) {
			line4.add(scanner.nextInt());
		}

		for (int i = 0; i < 4; i++) {
			value += line1.get(i);
		}
		for (int i = 0; i < 4; i++) {
			value2 += line2.get(i);
		}
		for (int i = 0; i < 4; i++) {
			value3 += line3.get(i);
		}
		for (int i = 0; i < 4; i++) {
			value4 += line4.get(i);
		}
		value5 += line1.get(0) + line2.get(0) + line3.get(0) + line4.get(0);
		value6 += line1.get(1) + line2.get(1) + line3.get(1) + line4.get(1);
		value7 += line1.get(2) + line2.get(2) + line3.get(2) + line4.get(2);
		value8 += line1.get(3) + line2.get(3) + line3.get(3) + line4.get(3);
		if (value == value2 && value == value3 && value == value4 && value == value5 && value == value6
				&& value == value7 && value == value8) {
			System.out.println("magic");
		} else {
			System.out.println("not magic");
		}

	}

}