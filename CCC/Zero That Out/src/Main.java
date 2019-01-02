import java.util.*;

public class Main {

	static final Scanner userInput = new Scanner(System.in);
	static int questions = userInput.nextInt();
	static List<Integer> values = new ArrayList<Integer>();

	public static void main(String args[]) {

		for (int i = 0; i < questions; i++) {
			values.add(userInput.nextInt());

		}

		System.out.println(sum());
		

	}

	public static int sum() {
		List<Integer> lastadded = new ArrayList<Integer>();
		int sum = 0;
		int total = 0;

		for (int i = 0; i < questions; i++) {
			sum = values.get(i);
			total += sum;
			if (values.get(i) != 0) {
				lastadded.add(values.get(i));
			} else {
				total -= lastadded.get(lastadded.size() - 1);
				lastadded.remove(lastadded.size() - 1);
			}

		}
	/*	for (int z = 0; z < lastadded.size(); z++) {
			System.out.println("lastadded is "+lastadded.get(z));
		}*/
		return total;

	}

}
