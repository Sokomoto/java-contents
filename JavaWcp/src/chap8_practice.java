
public class chap8_practice {
	public static void main(String[]args) {
		int num = 1;
		while (num < 5) {
			System.out.println(num * num);
			num++;
		}

		int[] array = {1, 4, 9, 16};
		for (int num2 = 0; num2 < array.length; num2++ ) {
			System.out.println(array[num2]);
		}

		for (int loop : array ) {
			if ( loop % 2 == 0) {
				continue;
			}
			System.out.println(loop);
		}
	}
}
