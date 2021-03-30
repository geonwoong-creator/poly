import java.util.Scanner;

public class Back4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("x값을 입력해주세요");
		int a = in.nextInt();
		System.out.println("y값을 입력해주세요");
		int b = in.nextInt();
		if (a > 0) {
			if (b > 0) {
				System.out.println("1사분면");
			} else {
				System.out.println("4사분면");
			}

		}

		else {
			if (b > 0) {
				System.out.println("2사분면");
			} else {
				System.out.println("3사분면");
			}
		}

	}

}
