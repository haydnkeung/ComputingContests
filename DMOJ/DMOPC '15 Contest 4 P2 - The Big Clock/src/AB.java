import java.util.*;

public class AB {

	static Scanner Scanner = new Scanner(System.in);
	static int numOfQ = Scanner.nextInt();

	public static void main(String[] args) {

		for (int i = 0; i < numOfQ; i++) {
			System.out.println(evaluate());
		}

	}

	public static int evaluate() {

		int A = Scanner.nextInt();
		int B = Scanner.nextInt();
		return A + B;

	}

}
