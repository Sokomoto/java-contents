package kidofuta;

public class java_practice04_2 {
	public static void main(String[]args) {
		int[] array = new int[20];
		int even = 0;
		int odd = 0;

		for (int i = 0; i < array.length; i++) {
			even += 5;
			odd += 5;
			if (even % 2 == 0) {
				System.out.print(even + (even < 100 ? "," : ""));
			}
			else {
				System.out.print(odd + (odd < 95 ? "," : ""));
			}
		}
	}

}
