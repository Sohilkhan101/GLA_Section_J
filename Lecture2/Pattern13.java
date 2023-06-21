package Lecture2;

public  class Pattern13 {
	public static void main(String[] args) {
		int n = 5;
		int trow = (2 * n) - 1;

		int row = 0;
		int nst = 1;

		while (row < trow) {

			// stars
			for (int i = 0; i < nst; i++) {
				System.out.print("*");
			}

			if (row < trow / 2) {
				nst++;
			} else {
				nst--;
			}
			System.out.println();
			row++;
		}

	}

}
