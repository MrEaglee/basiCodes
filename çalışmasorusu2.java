package java2;

public class çalýþmasorusu2 {

	public static void main(String[] args) {

		int c = 1;
		int t = 0;

		for (int m = 1; m <= 3; m++) {

			for (int n = 2; n <= 4; n++) {

				for (int k = 2; k <= 3; k++) {

					c = c * (m + n + k);

				}

				t = t + c;
				c = 1;
			}

			t += c;

		}

		System.out.println(t);

	}

}
