// �ǂݍ��񂾐����l�̐��^���^�O�𔻒�

import java.util.Scanner;

class JudgeSign {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("��������͂���F");
		int n = stdIn.nextInt();

		if (n > 0)
			System.out.println("����͐��ł��B");
		else if (n < 0)
			System.out.println("����͕��ł��B");
		else
			System.out.println("����͂O�ł��B");
	}
}
