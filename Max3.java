// �O�̐����l��ǂݍ���ōő�l�����߂ĕ\��

import java.util.Scanner;

class Max3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�O�̐����̍ő�l�����߂܂��B");
		System.out.print("a�̒l�F");	int a = stdIn.nextInt();
		System.out.print("b�̒l�F");	int b = stdIn.nextInt();
		System.out.print("c�̒l�F");	int c = stdIn.nextInt();

		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;

		System.out.println("�ő�l��" + max + "�ł��B");
	}
}
