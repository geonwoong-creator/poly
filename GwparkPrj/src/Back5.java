import java.util.Scanner;

public class Back5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.println("�ð��� �Է����ּ���:");
		int h = in.nextInt();
		System.out.println("���� �Է����ּ���:");
		int m = in.nextInt();

		if (m < 45) {
			h--;
			m = 60 - (45 - m);
			if (h < 0) {
				h = 23;
			}
			System.out.println(h+"��"+m+"��");
		} else {
			System.out.println(h + "��" + (m - 45)+"��");
		}

	}

}
