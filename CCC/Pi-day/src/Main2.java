import java.util.*;

public class Main2 {

	static final Scanner Scanner = new Scanner(System.in);
	static final int contests = Scanner.nextInt();
	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {

		for (int i = 0; i < contests; i++) {
			int temp = Scanner.nextInt();
			if (list.indexOf(temp) == -1) {
				list.add(temp);
			}
		}
		System.out.println(list.size());
	}

}