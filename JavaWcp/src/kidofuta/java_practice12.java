package kidofuta;

public class java_practice12 {
	public static void main(String[]args) {
		int even = 0;
		int evensum = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				even++;
				evensum += i;
			}
		}
		System.out.println("偶数の数は、" + even + "です");
		System.out.println("偶数の合計は、" + evensum + "です");
	}

}
