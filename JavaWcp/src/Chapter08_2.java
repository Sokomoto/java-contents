
public class Chapter08_2 {
	public static void main(String[]args) {
		// 1
		int num = 1;
		while (num < 5) {
			System.out.println(num * num);
			num++;
		}

		// 2
		int[] number1 = { 1, 4, 14, 25 };
		for ( int number2 = 0; number2 < number1.length; number2++ ) {
			System.out.println(number1[number2]);
		}

		// 3
		for (int number3 : number1) {
			if (number3 % 2 == 0 ) {
				continue;
			}
			System.out.println(number3);
		}
	}
}
