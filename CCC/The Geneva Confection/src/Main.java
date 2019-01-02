import java.util.*;

public class Main {

	static final Scanner Scanner = new Scanner(System.in);
	static final int tests = Scanner.nextInt();
	static Stack<Integer> stack = new Stack<Integer>();
	static List result = new ArrayList<String>();

	public static void main(String[] args) {

		for (int i = 0; i < tests; i++) {
			execute();
		}
		for (int j = 0; j < result.size(); j++) {
			System.out.println((String) result.get(j));
		}

	}

	public static void execute() {
		int cars = Scanner.nextInt();
		int oCars = cars;
		int demand = 1;
		int thisCar = 0;
		boolean isOverloading = false;
		List order = new ArrayList<String>();
		stack.clear();
		order.clear();
		for (int j = 0; j < cars; j++) {
			order.add(Scanner.nextInt());
		}
		// System.out.println("New Test");
		while (oCars != 0) {
			if (order.isEmpty() == false && isOverloading == false) {
				thisCar = (Integer) order.get(order.size() - 1);
				order.remove(order.size() - 1);
			} else if (isOverloading == true) {
				// This "ONLY", is called when it already
				// has a value,I want to re-loop keeping its
				// vakue.
			} else {
				thisCar = 0;
			}

			//System.out.println("Demand is " + demand);
			//System.out.println("This car is " + thisCar);

			isOverloading = false;
			if (stack.isEmpty() == false && (Integer) stack.peek() == demand) {
				//System.out.println("Car " + (Integer) stack.peek() + " is poped");
				stack.pop();
				demand++;
				oCars--;
				isOverloading = true;
				int temp = thisCar;

			} else if (thisCar == demand) {
				//System.out.println("Car " + thisCar + " is ok");
				demand++;
				oCars--;
			} else if (thisCar > demand) {
				//System.out.println("Car " + thisCar + " is pushed");
				stack.push(thisCar);

			} else {
				//System.out.println("I am true");
				oCars--;
				// I need to loop pointlessly so that it gets to the point thats
				// needed to continue next test.(I knw this is bad method)

			}

		}

		if (demand >= cars)

		{
			result.add("Y");
		} else

		{
			result.add("N");
		}

	}

}
