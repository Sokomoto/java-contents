package kidofuta;

public class java_pravtice19 {
	public static void main(String[]args) {
		int[] array = new int[40];
		int even = 0;
		int odd = 0;

		System.out.print("偶数: ");
		for (int i = 0; i < array.length; i++) {
			even += 7;
			if (even % 2 == 0) {
				System.out.print(even + (i < array.length - 1 ? "," : ""));
			}
		}

		System.out.println();

		System.out.print("奇数: ");
		for (int i = 0; i < array.length; i++) {
			odd += 7;
			if (odd % 2 != 0) {
				System.out.print(odd + (i < array.length - 2 ? "," : ""));
			}

		}
	}

}
