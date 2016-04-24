// ��̔z�񂪓��������ǂ����𔻒�

import java.util.Scanner;	

class ArrayEqual {

	//--- ��̔z��a, b�̑S�v�f�͓��������H ---//
	static boolean equals(int[] a, int[] b) {
		if (a.length != b.length)
			return false;

		for (int i = 0; i < a.length; i++)
			if (a[i] != b[i])
				return false;

		return true;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("�z��a�̗v�f���F");
		int na = stdIn.nextInt();		// �z��a�̗v�f��

		int[] a = new int[na];			// �v�f��na�̔z��

		for (int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}

		System.out.print("�z��b�̗v�f���F");
		int nb = stdIn.nextInt();		// �z��b�̗v�f��

		int[] b = new int[nb];			// �v�f��nb�̔z��

		for (int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}

		System.out.println("�z��a��b��" + 
								 (equals(a, b) ? "�������ł��B"
										 			: "����������܂���B"));
	}
}
