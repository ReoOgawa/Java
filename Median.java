// �O�̐����l��ǂݍ���Œ����l�����߂ĕ\��

import java.util.Scanner;

class Median {

	static int med3(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�O�̐����̒����l�����߂܂��B");
		System.out.print("a�̒l�F");	int a = stdIn.nextInt();
		System.out.print("b�̒l�F");	int b = stdIn.nextInt();
		System.out.print("c�̒l�F");	int c = stdIn.nextInt();

		System.out.println("�����l��" + med3(a, b, c) + "�ł��B");
	}
}
