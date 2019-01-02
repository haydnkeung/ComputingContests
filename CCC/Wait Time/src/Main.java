import java.util.*;
ERROR
public class Main {

	static final Scanner Scanner = new Scanner(System.in);
	static final int lines = Scanner.nextInt();
	static Integer[][] data = new Integer[lines][4];
	// static Integer[][] database = new Integer[lines][4];
	// static ArrayList<Integer> result = new ArrayList<Integer>();
	// [0]State[1]ID[2]TimeRequested[3]TimeWaited\
	static Integer[][] result = new Integer[lines][2];
	static int resultPos = 0;

	public static void main(String[] args) {
		for (int z = 0; z < lines; z++) {
			Arrays.fill(data[z], -1);
			Arrays.fill(result, -1);
		}
		for (int i = 0; i < lines; i++) {
			int temp1 = 0;
			String temp = Scanner.next();
			if (temp.equals("R")) {
				temp1 = 1;
			} else if (temp.equals("S")) {
				temp1 = 2;
			} else {
				temp1 = 0;
			}

			data[i][0] = temp1;
			data[i][1] = Scanner.nextInt();
		}
		int time = 0;
		for (int k = 0; k < lines; k++) {
			System.out.println("Checking line " + k);
			System.out.println(data[k][0] + "with" + data[k][1]);
			System.out.println("Time is " + time);
			if (data[k][0] == 0) {
				System.out.println("This is wait " + data[k][1] + " seconds");
				time += data[k][1];
				data[k][0] = -2;

			} else if (data[k][0] == 1 && Arrays.asList(result).indexOf(data[k][1]) == -1) {
				System.out.println("This is recived from " + data[k][1]);
				data[k][2] = time;
				result[resultPos][0] = data[k][1];
				resultPos++;
				time++;
			} else if (data[k][0] == 1){
				//Already exists
				System.out.println("2 This is recived from " + data[k][1]);
				data[k][2] = time;
				
			} 
			
			
			else {

				int temp = find(data[k][1]);
				System.out.println("This is send to " + temp);
				data[temp][3] = (time - data[temp][2]) - 1;// time -
															// data[temp][2]
				data[k][0] = -2;
				time++;
			}

		}
		for (int y = 0; y < lines; y++) {
			System.out.println(Arrays.asList(data[y]));
		}

		for (int m = 0; m < lines; m++) {
			if (data[m][0] != -2) {
				System.out.println(data[m][1] + " " + data[m][3]);
			}
		}

	}

	// for (int j = 0; j < data.length; j++) {
	// System.out.println(Arrays.asList(data[j]));
	// }

	public static int find(int input) {
		System.out.println("I am a loop");
		for (int i = 0; i < lines; i++) {

			if (result[i][1] == input) {
				return i;

			}

		}
		return 0;
	}

}
