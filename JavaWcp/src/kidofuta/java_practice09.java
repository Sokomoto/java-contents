package kidofuta;

public class java_practice09 {
	public static void main(String[]args) {
		int sum = 0;
		double avg;  //小数点以下まで平均を求める場合はdouble(少数の変数)を使用

		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		avg = sum / 10.0;

		System.out.println("合計: " + sum);
		System.out.println("平均: " + avg);
	}

}
