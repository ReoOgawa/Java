// �Q���̐��̐����l�i10�`99�j��ǂݍ���

import java.util.Scanner;

class Digits {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;

		System.out.println("�Q���̐����l����͂��Ă��������B");

		do {
			System.out.print("�l�́F");
			no = stdIn.nextInt();
		} while (no < 10 || no > 99);

		System.out.println("�ϐ�no�̒l��" + no + "�ɂȂ�܂����B");
	}
}
