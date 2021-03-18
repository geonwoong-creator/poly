import java.util.Scanner;

public class back1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
        System.out.println("a값을 입력해주세요");
		int a = in.nextInt();
		System.out.println("b값을 입력해주세요");
		int b = in.nextInt();

		in.close();

		if (a > b)
			System.out.println(">");
		else if (a < b)
			System.out.println("<");
		else
			System.out.println("==");

	}

}
