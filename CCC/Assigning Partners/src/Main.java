import java.util.*;

public class Main {
	public static void main(String args[]) {

		Scanner userInput = new Scanner(System.in);
		userInput.nextLine();
		String[] students = userInput.nextLine().split(" ");
		String[] students2 = userInput.nextLine().split(" ");
		userInput.close();
		int amountStudents = students.length;

		if (execute(amountStudents, students, students2)) {
			// System.out.println(Arrays.asList(students));
			//System.out.println(amountStudents);
			System.out.println("good");
		} else {

			System.out.println("bad");
		}

	}

	public static boolean execute(int num, String[] students, String[] students2) {

		List<Integer> ifUnique = new ArrayList<Integer>();
		List<Integer> listValue = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {
			int studentA = students[i].hashCode();
			int studentB = students2[i].hashCode();
			int value = studentA + studentB;

			listValue.add(value);
			//System.out.println(listValue.get(i));
			
		}

		for (int j = 0; j < num; j++) {
		int z=	ifUnique.indexOf(listValue.get(j));
			if (z == -1) {
				ifUnique.add(listValue.get(j)); // 
			} else {
				//System.out.println(ifUnique.get(j));
				
				ifUnique.remove(z);
			
			}
		}

		//
		/*for (int l = 0; l< ifUnique.size();l++){
		System.out.println(ifUnique.get(l));
		}*/
		
		if (ifUnique.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

}

/*
 * import java.util.*;
 * 
 * public class J5_2014 {
 * 
 * static final Scanner userInput = new Scanner(System.in); static boolean
 * isgood = true; static final int numberOfStudents = userInput.nextInt();
 * static HashMap<String, String> chart = new HashMap<String, String>(); static
 * String placeholder = "NULL";
 * 
 * public static void main(String args[]) {
 * 
 * System.out.println(executeCode()); for (String studentA : chart.keySet()){
 * 
 * System.out.println(studentA + " is partners with " + chart.get(studentA)); }
 * 
 * 
 * }
 * 
 * public static String executeCode() {
 * 
 * for (int i=0; i < numberOfStudents; i++){ chart.put(userInput.next(),
 * userInput.nextLine());
 * 
 * }
 * 
 * 
 * 
 * if (isgood) { return "good"; } else { return "bad"; }
 * 
 * }
 * 
 * }
 */
