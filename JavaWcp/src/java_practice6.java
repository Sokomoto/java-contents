
public class java_practice6 {
	public static void main(String[]args) {
		int[] array = new int[20];
		int even = 0;
		int odd = 0;

		System.out.print("偶数: ");
		for (int num = 0; num < array.length; num++) {
			even += 5;
			if (even % 2 == 0) {
				System.out.print(even + (even < 100 ? "," : ""));
				//if (even < 100) {
					//System.out.print(",");
				//}
			}
		}

		System.out.println("");

		System.out.print("奇数: ");
		for (int num = 0; num < array.length; num++) {
			odd += 5;
			if (odd % 2 != 0) {
				System.out.print(odd);
				if (odd < 95) {
					System.out.print(",");
				}
			}
		}
	}

}
