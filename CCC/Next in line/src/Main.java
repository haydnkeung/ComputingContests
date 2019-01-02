
import java.util.*;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	static int personA = scanner.nextInt();
	static int personB = scanner.nextInt();
	static int personC = 0;

	public static void main(String args[]) {

		personC = personB - personA;
		personC+= personB;
		System.out.println(personC);

	}

}
