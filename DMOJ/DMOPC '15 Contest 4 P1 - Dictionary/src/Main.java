import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int length = Scanner.nextInt();
		List items = new ArrayList<String>();

		for (int i = 0; i < length; i++) {
			items.add(Scanner.next());
		}
		Collections.sort(items);

		String[] array = new String[length];
		for (int j = 0; j < array.length; j++) {
			array[j] = items.get(j).toString();
		}
		for (int k = 0; k < array.length-1; k++) {
			if (array[k].startsWith(array[k+1].substring(0, 1))&&!array[k].equals("-1")){
				array[k] = array[k]+", "+array[k+1];
				array[k+1] = "-1";
			}
		}
		for (int l = 0; l < array.length;l++){
			if (!array[l].equals("-1")){
				System.out.println(array[l]);
			}
		}

	}

}
