import java.util.*;

public class Main {

	static final Scanner Scanner = new Scanner(System.in);
	static List<Integer> list1 = new ArrayList<Integer>();
	static List<Integer> list2 = new ArrayList<Integer>();
	static List<Integer> listAll = new ArrayList<Integer>();
	static List<Integer> result = new ArrayList<Integer>();

	public static void main(String[] args) {
		final int sizeOfList1 = Scanner.nextInt();
		for (int i = 0; i < sizeOfList1; i++) {
			int temp = Scanner.nextInt();
			list1.add(temp);
			listAll.add(temp);
			result.add(temp);
		}
		final int sizeOfList2 = Scanner.nextInt();
		for (int j = 0; j < sizeOfList2; j++) {
			int temp1 = Scanner.nextInt();
			list2.add(temp1);
			listAll.add(temp1);
		}
		final int sizeOfListAll = listAll.size();

		refactorList(sizeOfListAll, sizeOfList1, sizeOfList2);
		// System.out.println("Size of lis 1 is "+sizeOfList1);
		// System.out.println("Size of lis 2 is "+sizeOfList2);
	}

	public static void refactorList(int sizeOfListAll, int sizeOfList1, int sizeOfList2) {
		Collections.sort(list2);
		Collections.reverse(list2);
		Collections.sort(listAll);// Sorts smallest to gretest
		Collections.reverse(listAll);// Then reverses the list(Samething above)
		if (sizeOfList2 == 0) {
			int temp = 0;
			int temp1 = 0;
			for (int i = 0; i < sizeOfList1; i += 2) {
				temp += (Integer) list1.get(i);
			}
			for (int j = 1; j < sizeOfList1; j += 2) {
				temp1 += (Integer) list1.get(j);
			}
			if (temp > temp1) {
				System.out.println(temp);
			} else {
				System.out.println(temp1);
			}
		} else {
			determineGreatest(sizeOfList1, sizeOfList2, sizeOfListAll);
		}
	}

	public static void determineGreatest(int sizeOfList1, int sizeOfList2, int sizeOfListAll) {
		int check = 0;
		List<Integer> highestNum = new ArrayList<Integer>();
		// Stack<Integer> badNum = new Stack<Integer>();
		/*if ((sizeOfList1 + sizeOfList2) % 2 == 0) {// Even sum

			check = (sizeOfList1 + sizeOfList2) / 2;
			// System.out.println("check is " + check);
		} else {// Odd sum

			check = (sizeOfList1 + sizeOfList2) / 2 + 1;
		}*/
		check = (sizeOfList1+sizeOfList2)/2;
		for (int i = 0; i < check; i++) {
			highestNum.add(listAll.get(i));
		}
		// for(int j = 0; j < sizeOfListAll;j++){

		// }
		// Test
		int temp = 0;
		for (int k = 0; k < highestNum.size(); k++) {
			temp += highestNum.get(k);
			// System.out.println("temp is " + temp);
			// System.out.println("check is " + check);
		}
		System.out.println(temp);
	}
}
