package kidofuta;

public class java_practice004_5 {
	public static void main(String[]args) {
		int sum = 0;
		double avg ;

		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		avg = sum / 10.0;
		System.out.println("合計: " + sum );
		System.out.println("平均: " + avg);
	}

}