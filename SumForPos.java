// 1, 2, �c, n�̘a�����߂�ido���ɂ���Đ��̐����l�݂̂�n�ɓǂݍ��ށj

import java.util.Scanner;

class SumForPos {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("1����n�܂ł̘a�����߂܂��B");

		do {
			System.out.print("n�̒l�F");
			n = stdIn.nextInt();
		} while (n <= 0);

		int sum = 0;		// �a

		for (int i = 1; i <= n; i++)
			sum += i;					// sum��i��������

		System.out.println("1����" + n + "�܂ł̘a��" + sum + "�ł��B");
	}
}
