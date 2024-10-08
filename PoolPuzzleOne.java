class PoolPuzzleOne {
	public static void main (String[] args) {
		int x = 0;
		// one
		while (x < 1) {
			// two
			System.out.print("a ");
			if (x < 1) {
				// three
				System.out.println("noise");
			}
			// four
			x = x + 1;
			// five
			if (x < 4) {
				// six
				System.out.println("annoys");
			}
			
			if (x == 1) {
				// seven
				System.out.print("an");
			}
			// eight
			if (x > 0) {
				// nine
				System.out.println(" oyster");
			}
			System.out.println("");
			// ten
			x = x + 2;
		}
	}
}