package kidofuta;

public class java_practice7 {
	public static void main(String[]args) {
		int point = 80;

		if (60 <= point) {
			System.out.println("合格");
		}
		else {
			System.out.println("不合格");
		}

		if (80 <= point) {
			System.out.println("たいへんよくできました");
		}
		else if (60 <= point) {
			System.out.println("よくできました");
		}
		else {
			System.out.println("ざんねんでした");
		}

		if (80 <= point) {
			System.out.println("優");
		}
		else if (70 <= point) {
			System.out.println("良");
		}
		else if (60 <= point) {
			System.out.println("可");
		}
		else {
			System.out.println("不可");
		}

	}

}
