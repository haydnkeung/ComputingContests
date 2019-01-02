import java.util.*;

public class Main2 {

	static final Scanner Scanner = new Scanner(System.in);
	static final int lines = Scanner.nextInt();
	static int time = 0;
	static Integer[][] list = new Integer[lines][2];
	static Integer[][] send = new Integer[lines][2];
	static int listPos = 0;

	public static void main(String[] args) {

		for (int i = 0; i < lines; i++) {
			String state = Scanner.next();
			int value = Scanner.nextInt();
			if (state.equals("W")) {
				time += value;
			} else if (state.equals("R")) {
				
			} else {
				System.out.println("Error "+ value);
				int temp = Arrays.asList(list).indexOf(value);
				list[temp][2] += time - list[temp][1];

			}
		}
		for (int j = 0; j < lines; j++) {
			System.out.println(list[j]);
			System.out.println(list[j][0] + " " + list[j][2]);
		}

	}

}