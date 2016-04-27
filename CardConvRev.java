// �ǂݍ���10�i������2�i���`36�i���ւƊ�ϊ����ĕ\��

import java.util.Scanner;

class CardConvRev {

	//--- �����lx��r�i���ɕϊ����Ĕz��d�ɉ��ʌ�����i�[���Č�����ԋp ---//
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;						// �ϊ���̌���
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r);	// r�Ŋ�������]���i�[
			x /= r;
		} while (x != 0);
		return digits;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;							// �ϊ����鐮��
		int cd;							// �
		int dno;							// �ϊ���̌���
		int retry;						// ������x�H
		char[] cno = new char[32];	// �ϊ���̊e�����i�[���镶���̔z��

		System.out.println("10�i������ϊ����܂��B");
		do {
			do {
				System.out.print("�ϊ�����񕉂̐����F");
				no = stdIn.nextInt();
			} while (no < 0);

			do {
				System.out.print("���i���ɕϊ����܂����i2-36�j�F");
				cd = stdIn.nextInt();
			} while (cd < 2 || cd > 36);

			dno = cardConvR(no, cd, cno);			// no��cd�i���ɕϊ�

			System.out.print(cd + "�i���ł�");
			for (int i = dno - 1; i >= 0; i--)	// ��ʌ����珇�ɕ\��
				System.out.print(cno[i]);
			System.out.println("�ł��B");

			System.out.print("������x���܂����i1�c�͂��^0�c�������j�F");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
