
public class java_pracitce4 {
	public static void main(String[]args) {
		int even = 0;
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				even++;
				sum += i;
			}
		}
		System.out.println("偶数の数は " + even + " 個です ");
		System.out.println("偶数の合計値は " + sum + "です");
	}

}
