
public class java_practice14 {
	public static void main(String[]args) {
		int[] array = new int[20];
		int even = 0;
		int odd = 0;

		System.out.print("偶数: ");
		for (int i = 0; i < array.length; i++) {
			even += 5;
			if (even % 2 == 0) {
				System.out.print(even + (even < 100 ? "," : ""));
			}
		}

		System.out.print("奇数: ");
	}

}
