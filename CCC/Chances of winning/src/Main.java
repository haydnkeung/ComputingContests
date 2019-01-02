
//Im Stuck,Question exceed my skills :(
import java.util.*;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	static int id = scanner.nextInt();
	static int played = scanner.nextInt();
	static ArrayList<String> combination = new ArrayList<String>();
	// static int scores[][] = new int[5][5];
	static int score1 = 0;
	static int score2 = 0;
	static int score3 = 0;
	static int score4 = 0;
	static int counter = 0;
	static ArrayList<String> data = new ArrayList<String>();

	public static void main(String args[]) {
		setUp();
		for (int i = 0; i < combination.size(); i++) {

		}

	}

	public static void setUp() {

		combination.add("1 2");
		combination.add("1 3");
		combination.add("1 4");
		combination.add("2 3");
		combination.add("2 4");
		combination.add("4 3");
		scanner.nextLine();
		for (int i = 0; i < played; i++) {
			data.add(scanner.nextLine());

		}
		for (int i = 0; i < played; i++) {
			String teamA = data.get(i).substring(0, 1);
			String teamB = data.get(i).substring(2, 3);
			int teamAIntId = Integer.parseInt(teamA);
			int teamBIntId = Integer.parseInt(teamB);
			int teamAIntPoints = Integer.parseInt(data.get(i).substring(4, 5));
			int teamBIntPoints = Integer.parseInt(data.get(i).substring(6, 7));
			if ((teamA.equals("1") && teamB.equals("2")) || (teamA.equals("2") && teamB.equals("1"))) {
				combination.set(0, "null");
				if (teamAIntPoints == teamBIntPoints) {// Tie
					if (teamAIntId == 1) {
						score1++;
					} else if (teamAIntId == 2) {
						score2++;
					} else if (teamAIntId == 3) {
						score3++;
					} else {
						score4++;
					}
					if (teamBIntId == 1) {
						score1++;
					} else if (teamBIntId == 2) {
						score2++;
					} else if (teamBIntId == 3) {
						score3++;
					} else {
						score4++;
					}

				} else if (teamAIntPoints > teamBIntPoints) {// A Wins
					if (teamAIntId == 1) {
						score1 += 3;
					} else if (teamAIntId == 2) {
						score2 += 3;
					} else if (teamAIntId == 3) {
						score3 += 3;
					} else {
						score4 += 3;
					}

				} else {// B wins
					if (teamBIntId == 1) {
						score1 += 3;
					} else if (teamBIntId == 2) {
						score2 += 3;
					} else if (teamBIntId == 3) {
						score3 += 3;
					} else {
						score4 += 3;
					}

				}
			} else if ((teamA.equals("1") && teamB.equals("3")) || (teamA.equals("3") && teamB.equals("1"))) {
				combination.set(1, "null");
				if (teamAIntPoints == teamBIntPoints) {// Tie
					if (teamAIntId == 1) {
						score1++;
					} else if (teamAIntId == 2) {
						score2++;
					} else if (teamAIntId == 3) {
						score3++;
					} else {
						score4++;
					}
					if (teamBIntId == 1) {
						score1++;
					} else if (teamBIntId == 2) {
						score2++;
					} else if (teamBIntId == 3) {
						score3++;
					} else {
						score4++;
					}

				} else if (teamAIntPoints > teamBIntPoints) {// A Wins
					if (teamAIntId == 1) {
						score1 += 3;
					} else if (teamAIntId == 2) {
						score2 += 3;
					} else if (teamAIntId == 3) {
						score3 += 3;
					} else {
						score4 += 3;
					}

				} else {// B wins
					if (teamBIntId == 1) {
						score1 += 3;
					} else if (teamBIntId == 2) {
						score2 += 3;
					} else if (teamBIntId == 3) {
						score3 += 3;
					} else {
						score4 += 3;
					}

				}
			} else if ((teamA.equals("1") && teamB.equals("4")) || (teamA.equals("4") && teamB.equals("1"))) {
				combination.set(2, "null");
				if (teamAIntPoints == teamBIntPoints) {// Tie
					if (teamAIntId == 1) {
						score1++;
					} else if (teamAIntId == 2) {
						score2++;
					} else if (teamAIntId == 3) {
						score3++;
					} else {
						score4++;
					}
					if (teamBIntId == 1) {
						score1++;
					} else if (teamBIntId == 2) {
						score2++;
					} else if (teamBIntId == 3) {
						score3++;
					} else {
						score4++;
					}

				} else if (teamAIntPoints > teamBIntPoints) {// A Wins
					if (teamAIntId == 1) {
						score1 += 3;
					} else if (teamAIntId == 2) {
						score2 += 3;
					} else if (teamAIntId == 3) {
						score3 += 3;
					} else {
						score4 += 3;
					}

				} else {// B wins
					if (teamBIntId == 1) {
						score1 += 3;
					} else if (teamBIntId == 2) {
						score2 += 3;
					} else if (teamBIntId == 3) {
						score3 += 3;
					} else {
						score4 += 3;
					}

				}
			} else if ((teamA.equals("2") && teamB.equals("3")) || (teamA.equals("3") && teamB.equals("2"))) {
				combination.set(3, "null");
				if (teamAIntPoints == teamBIntPoints) {// Tie
					if (teamAIntId == 1) {
						score1++;
					} else if (teamAIntId == 2) {
						score2++;
					} else if (teamAIntId == 3) {
						score3++;
					} else {
						score4++;
					}
					if (teamBIntId == 1) {
						score1++;
					} else if (teamBIntId == 2) {
						score2++;
					} else if (teamBIntId == 3) {
						score3++;
					} else {
						score4++;
					}

				} else if (teamAIntPoints > teamBIntPoints) {// A Wins
					if (teamAIntId == 1) {
						score1 += 3;
					} else if (teamAIntId == 2) {
						score2 += 3;
					} else if (teamAIntId == 3) {
						score3 += 3;
					} else {
						score4 += 3;
					}

				} else {// B wins
					if (teamBIntId == 1) {
						score1 += 3;
					} else if (teamBIntId == 2) {
						score2 += 3;
					} else if (teamBIntId == 3) {
						score3 += 3;
					} else {
						score4 += 3;
					}

				}
			} else if ((teamA.equals("2") && teamB.equals("4")) || (teamA.equals("4") && teamB.equals("2"))) {
				combination.set(4, "null");
				if (teamAIntPoints == teamBIntPoints) {// Tie
					if (teamAIntId == 1) {
						score1++;
					} else if (teamAIntId == 2) {
						score2++;
					} else if (teamAIntId == 3) {
						score3++;
					} else {
						score4++;
					}
					if (teamBIntId == 1) {
						score1++;
					} else if (teamBIntId == 2) {
						score2++;
					} else if (teamBIntId == 3) {
						score3++;
					} else {
						score4++;
					}

				} else if (teamAIntPoints > teamBIntPoints) {// A Wins
					if (teamAIntId == 1) {
						score1 += 3;
					} else if (teamAIntId == 2) {
						score2 += 3;
					} else if (teamAIntId == 3) {
						score3 += 3;
					} else {
						score4 += 3;
					}

				} else {// B wins
					if (teamBIntId == 1) {
						score1 += 3;
					} else if (teamBIntId == 2) {
						score2 += 3;
					} else if (teamBIntId == 3) {
						score3 += 3;
					} else {
						score4 += 3;
					}

				}
			} else if ((teamA.equals("4") && teamB.equals("3")) || (teamA.equals("3") && teamB.equals("4"))) {
				combination.set(5, "null");
				if (teamAIntPoints == teamBIntPoints) {// Tie
					if (teamAIntId == 1) {
						score1++;
					} else if (teamAIntId == 2) {
						score2++;
					} else if (teamAIntId == 3) {
						score3++;
					} else {
						score4++;
					}
					if (teamBIntId == 1) {
						score1++;
					} else if (teamBIntId == 2) {
						score2++;
					} else if (teamBIntId == 3) {
						score3++;
					} else {
						score4++;
					}

				} else if (teamAIntPoints > teamBIntPoints) {// A Wins
					if (teamAIntId == 1) {
						score1 += 3;
					} else if (teamAIntId == 2) {
						score2 += 3;
					} else if (teamAIntId == 3) {
						score3 += 3;
					} else {
						score4 += 3;
					}

				} else {// B wins
					if (teamBIntId == 1) {
						score1 += 3;
					} else if (teamBIntId == 2) {
						score2 += 3;
					} else if (teamBIntId == 3) {
						score3 += 3;
					} else {
						score4 += 3;
					}

				}
			}
		}
		ArrayList<String> temp = new ArrayList<String>();
		for (int i = 0; i < combination.size(); i++) {
			if (!(combination.get(i).equals("null"))) {
				temp.add(combination.get(i));
			}

		}
		combination.clear();
		for (int i = 0; i < temp.size(); i++) {
			combination.add(temp.get(i));
		}
	}

	public static int myTeam() {
		if (id == 1) {
			return score1;
		} else if (id == 2) {
			return score2;
		} else if (id == 3) {
			return score3;
		} else {
			return score4;
		}
	}

	public static int teamId(String team, int pos) {
		if (pos == 1) {
			return Integer.parseInt(team.substring(0, 1));
		} else {
			return Integer.parseInt(team.substring(2, 3));
		}
	}

	public static void debug() {
		System.out.println("These are scores");
		System.out.println("Team 1 score is " + score1);
		System.out.println("Team 2 score is " + score2);
		System.out.println("Team 3 score is " + score3);
		System.out.println("Team 4 score is " + score4);
		System.out.println("Remainng games are:");
		for (int i = 0; i < combination.size(); i++) {
			System.out.println(combination.get(i));
		}

	}
}
