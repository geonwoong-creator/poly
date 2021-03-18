import java.util.Scanner;

public class back2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("시험 점수를 입력해주세요");
		int a = in.nextInt();
		if (89 < a)
			System.out.println("A");
		else if (79 < a)
			System.out.println("B");
		else if (69 < a)
			System.out.println("C");
		else
			System.out.println("F");

	}

}
