// �z��̗v�f�̍ő�l��\������i�l��ǂݍ��ށj

import java.util.Scanner;

class MaxOfArray {

	//--- �z��a�̍ő�l�����߂ĕԋp ---//
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];
		return max;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�g���̍ő�l�����߂܂��B");
		System.out.print("�l���́F");
		int num = stdIn.nextInt();				// �z��̗v�f����ǂݍ���

		int[] height = new int[num];			// �v�f��num�̔z��𐶐�

		for (int i = 0; i < num; i++) {
			System.out.print("height[" + i + "]�F");
			height[i] = stdIn.nextInt();
		}
	
		System.out.println("�ő�l��" + maxOf(height) + "�ł��B");
	}
}