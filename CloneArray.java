// ”z—ñ‚Ì•¡»‚ğì‚é

class CloneArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = a.clone();			// b‚Ía‚Ì•¡»‚ğQÆ

		b[3] = 0;						// ‚P—v‘f‚¾‚¯—‘‚«

		System.out.print("a =");
		for (int i = 0; i < a.length; i++)
			System.out.print(" " + a[i]);

		System.out.print("\nb =");
		for (int i = 0; i < b.length; i++)
			System.out.print(" " + b[i]);
	}
}
