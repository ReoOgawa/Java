// �z��̑S�v�f�̘a�����߂ĕ\���i�g��for���j

class ArraySumForIn {

	public static void main(String[] args) {
		double[] a = { 1.0, 2.0, 3.0, 4.0, 5.0 };

		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);

		double sum = 0;	// ���v
		for (double i : a)
			sum += i;

		System.out.println("�S�v�f�̘a��" + sum + "�ł��B");
	}
}
