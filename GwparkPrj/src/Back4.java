import java.util.Scanner;

public class Back4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("x���� �Է����ּ���");
		int a = in.nextInt();
		System.out.println("y���� �Է����ּ���");
		int b = in.nextInt();
		if (a > 0) {
			if (b > 0) {
				System.out.println("1��и�");
			} else {
				System.out.println("4��и�");
			}

		}

		else {
			if (b > 0) {
				System.out.println("2��и�");
			} else {
				System.out.println("3��и�");
			}
		}

	}

}
