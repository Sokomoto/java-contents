
public class Chap08_2 {
	public static void main(String[]args) {
		int num = 1;
		while (num < 5) {
			System.out.println(num * num);
			num++;
		}

		int[] number = { 1, 4, 9, 16};
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}

		for (int loop : number) {
			if (loop % 2 == 0) {
				continue;
			}
			System.out.println(loop);

		}
	}

}
