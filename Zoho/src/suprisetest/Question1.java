package suprisetest;

public class Question1 {

	public static void main(String[] args) {
		int n = 7;
		int k = 1;
		for (int i = 1; i <= n; i += 2) {
			boolean sub = true;
			int p = k++;
			for (int j = n; j >= 1; j--) {
				if (j <= i) {
					if (sub) {
						System.out.print(p-- + " ");
						if (p == 0) {
							p += 2;
							sub = false;
						}
					} else {
						System.out.print(p++ + " ");
					}

				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		int p = n / 2;
		for (int i = n - 2; i >= 1; i -= 2) {

			boolean sub = true;
			;
			for (int j = n; j >= 1; j--) {
				if (j <= i) {
					if (sub) {
						System.out.print(" " + p--);
						if (p == 0) {
							p += 2;
							sub = false;
						}
					} else {
						System.out.print(" " + p++);
					}

				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}
