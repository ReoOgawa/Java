// �O�̐����l�̍ő�l�����߂ĕ\���i���ׂĂ̑召�֌W�ɑ΂��Ċm�F�j

class Max3m {

	//--- a, b, c�̍ő�l�����߂ĕԋp ---//
	static int max3(int a, int b, int c) {
		int max = a;						// �ő�l
		if (b > max) max = b;
		if (c > max) max = c;

		return max;
	}

	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max3(3, 2, 1));		// a��b��c
		System.out.println("max3(3,2,2) = " + max3(3, 2, 2));		// a��b��c
		System.out.println("max3(3,1,2) = " + max3(3, 1, 2));		// a��c��b
		System.out.println("max3(3,2,3) = " + max3(3, 2, 3));		// a��c��b
		System.out.println("max3(2,1,3) = " + max3(2, 1, 3));		// c��a��b
		System.out.println("max3(3,3,2) = " + max3(3, 3, 2));		// a��b��c
		System.out.println("max3(3,3,3) = " + max3(3, 3, 3));		// a��b��c
		System.out.println("max3(2,2,3) = " + max3(2, 2, 3));		// c��a��b
		System.out.println("max3(2,3,1) = " + max3(2, 3, 1));		// b��a��c
		System.out.println("max3(2,3,2) = " + max3(2, 3, 2));		// b��a��c
		System.out.println("max3(1,3,2) = " + max3(1, 3, 2));		// b��c��a
		System.out.println("max3(2,3,3) = " + max3(2, 3, 3));		// b��c��a
		System.out.println("max3(1,2,3) = " + max3(1, 2, 3));		// c��b��a
	}
}