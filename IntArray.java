// �\���v�f�^��int�^�̔z��i�\���v�f���͂T�Fnew�ɂ���Ė{�̂𐶐��j

class IntArray {

	public static void main(String[] args) {
		int[] a = new int[5];	// �z��̐錾

		a[1] = 37;				// a[1]��37����
		a[2] = 51;				// a[2]��51����
		a[4] = a[1] * 2;		// a[4]��a[1] * 2���Ȃ킿74����

		for (int i = 0; i < a.length; i++)	// �e�v�f�̒l��\��
			System.out.println("a[" + i + "] = " + a[i]);
	}
}