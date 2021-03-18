import java.util.Scanner;

public class back3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int a = in.nextInt();

		if ((a % 4 == 0 && a % 100 != 0) | a % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

}
