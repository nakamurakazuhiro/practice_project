package practice;

public class PracticeSwitch {

	public static void main(String[] args) {
		int[] job= {1,2,4,1,5,5,2,1,3,1};
		for (int i = 0; i <= 9; i++) {

			switch (job[i]) {
			case 1:
				System.out.println("勇者");
				break;
			case 2:
				System.out.println("バトルマスタ");
				break;
			case 3:
				System.out.println("パラディン");
				break;
			case 4:
				System.out.println("海賊");
				break;
			case 5:
				System.out.println("魔法剣士");
				break;
			}
		}
	}
}
