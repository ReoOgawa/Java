// 1, 2, �c, n�̘a�����߂�iwhile���j

import java.util.Scanner;

class SumWhile {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1����n�܂ł̘a�����߂܂��B");
 		System.out.print("n�̒l�F");
		int n = stdIn.nextInt();

		int sum = 0;				// �a
		int i = 1;

		while (i <= n) {			// i��n�ȉ��ł���ΌJ��Ԃ�
			sum += i;					// sum��i��������
			i++;							// i�̒l���C���N�������g
		}
		System.out.println("1����" + n + "�܂ł̘a��" + sum + "�ł��B");
	}
}
