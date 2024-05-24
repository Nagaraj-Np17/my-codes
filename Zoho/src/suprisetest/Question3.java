package suprisetest;

public class Question3 {

	public static void main(String[] args) {
		int n = 5;
		int arr[][] = new int[n][n];
		int left = 0;
		int right = n;
		int top = 0;
		int bot = n;
		int i = -1;
		int j = -1;
		int number = 1;
		while (left < right && top < bot) {
			i++;
			j++;
			while (j < right) {
				arr[i][j] = number++;
				j++;
			}
			j--;
			i++;
			right--;
			while (i < bot) {
				arr[i][j] = number++;
				i++;
			}
			bot--;
			i--;
			while (j >= left) {
				arr[i][j] = number++;
				j--;
			}
			j++;
			left++;
			while (i > top) {
				arr[i][j] = number++;
				i--;
			}
			top++;
		}

		for (int k = 0; k < n; k++) {
			for (int l = 0; l < n; l++) {
				System.out.print(arr[k][l] + "  ");
			}
			System.out.println();
		}

	}
}
