
public class java_practice6 {
	public static void main(String[]args) {
		int[] array = new int[20];
		int i = 0;
		//int even = 0;
		//int odd = 0;

		for (int num = 0; num < array.length; num++) {
			i += 5;
			if (i % 2 == 0) {
				System.out.print("偶数: " + i);
			}
			else {
				System.out.print("奇数: " + i);
			}
		}
		//System.out.println("偶数: " + even);
		//System.out.println("奇数: " + odd);

		//for (int num = 0; num < array.length; num++) {
			//array[num] = 5;
			//System.out.print(array[num]);
			//if (num % 2 == 0) {
				//System.out.print(even);
			//}
			//System.out.print(odd);
		//}
	}

}
