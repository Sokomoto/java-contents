
public class java_practice6 {
	public static void main(String[]args) {
		int even = 0;
		int odd = 0;
		int[] array = new int [20];
		for (int num = 0; num < array.length; num++) {
			num += 5;
			if (num % 2 == 0) {
				System.out.print(even);
			}
			System.out.print(odd);
		}

	}

}
