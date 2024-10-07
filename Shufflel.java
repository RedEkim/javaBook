class Shufflel {
	public static void main (String[] args) {
		int x = 3;

		// fifth
		while (x > 0) {
			// three
			if (x > 2) {
				System.out.print("a");
			}
			// fourth
			x = x - 1;
			System.out.print("-");
			// two
			if (x == 2) {
				System.out.print("b c");
			}
			// one
			if (x == 1) {
				System.out.println("d");
				x = x -1;
			}
		}
	}
}