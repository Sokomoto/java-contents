
public class java_practice6 {
	public static void main(String[]args) {
		int[] array = new int[20];
		int sum1 = 0;
		int sum2 = 0;
		int even = 0;
		int odd = 0;

		System.out.print("偶数: ");
		for (int num = 0; num < array.length; num++) {
			sum1 += 5;
			if (sum1 % 2 == 0) {
				even = sum1;
				System.out.print(even + ",");
			}
		}

		System.out.println("");

		System.out.print("奇数: ");
		for (int num = 0; num < array.length; num++) {
			sum2 += 5;
			if (sum2 % 2 != 0) {
				odd = sum2;
				System.out.print(odd + ",");
			}
		}
	}

}
