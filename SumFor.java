// 1, 2, �c, n�̘a�����߂�ifor���j

import java.util.Scanner;

class SumFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1����n�܂ł̘a�����߂܂��B");
		System.out.print("n�̒l�F");
		int n = stdIn.nextInt();

		int sum = 0;		// �a

		for (int i = 1; i <= n; i++)
			sum += i;					// sum��i��������

		System.out.println("1����" + n + "�܂ł̘a��" + sum + "�ł��B");
	}
}
