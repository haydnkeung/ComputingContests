import java.util.*;

public class j1 {

	static Scanner scanner = new Scanner(System.in);
	static int number = scanner.nextInt();
	static int counter = 0;
	
	public static void main(String args[]) {

		for (int i = 1; i <= 10; i++) {
			if (number % i == 0){
				counter++;
			}
		}
		System.out.println(counter);

	}

}
