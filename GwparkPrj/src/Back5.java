import java.util.Scanner;

public class Back5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.println("시간을 입력해주세요:");
		int h = in.nextInt();
		System.out.println("분을 입력해주세요:");
		int m = in.nextInt();

		if (m < 45) {
			h--;
			m = 60 - (45 - m);
			if (h < 0) {
				h = 23;
			}
			System.out.println(h+"시"+m+"분");
		} else {
			System.out.println(h + "시" + (m - 45)+"분");
		}

	}

}
