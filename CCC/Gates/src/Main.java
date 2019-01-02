import java.util.*;

public class Main {

	static final Scanner Scanner = new Scanner(System.in);
	static final int gates = Scanner.nextInt();
	static final int planes = Scanner.nextInt();
	static Integer[] ports = new Integer[gates+1];
	//static Integer[] requests = new Integer[planes];

	public static void createPorts() {
		for (int i = 0; i <= gates; i++) {
			ports[i] = i;
		}

	}

	public static void main(String[] args) {
		createPorts();
		System.out.println(execute());
	}

	public static int execute() {
		int ok = 0;
		int landing;
		all:for (int i = 0; i < planes; i++) {
			 landing = Scanner.nextInt();
			// System.out.println("LANDING "+ landing);
			// System.out.println()
			if (ports[landing] == landing) {
				ok++;
				ports[landing] = -1;
			} else if (ports[landing] == -1) {
				for (int j = landing; j >= 0; j--) {
					if (j == 0) {
					//	System.out.println("Break is called at "+ landing);
						break all;
					} else if (ports[j] != -1) {
						ok++;
						ports[j] = -1;
						break;
					}

				}
			}
		}
		return ok;
	}
}
