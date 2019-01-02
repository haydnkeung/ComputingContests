import java.util.Scanner;

public class Main {

	static final Scanner userInput = new Scanner(System.in);
	static int antennas = 0;
	static int eyes = 0;

	public static void main(String[] args) {
		ask();

	}

	public static void ask() {

		System.out.println("How many antennas?");
		antennas = userInput.nextInt();
		System.out.println("How many eyes?");
		eyes = userInput.nextInt();
		executeCode();
	}

	public static void executeCode() {
		if (antennas >= 3 && eyes <= 4) {
			System.out.println("TroyMartian");
		}
		if (antennas <= 6 && eyes >= 2) {
			System.out.println("VladSaturnian");
		}
		if (antennas <= 2 && eyes <= 3) {
			System.out.println("GraemeMercurian");
		}
		
	}

}