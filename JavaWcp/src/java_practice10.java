
public class java_practice10 {
	public static void main(String[]args) {
		int[] num = new int[20];
		int even = 0;
		int odd = 0;

		System.out.print("偶数: ");
		for (int i = 0; i < num.length; i++) {
			even += 5;
			if (even % 2 == 0) {
				System.out.print(even + (even < 100 ? "," : ""));
			}
		}

		System.out.println();

		System.out.print("奇数: ");
		for (int i = 0; i < num.length; i++) {
			odd += 5;
			if (odd % 2 != 0) {
				System.out.print(odd + (odd < 95 ? "," : ""));
			}
		}
	}

}
