
public class Chapter04 {
	public static void main(String[] args) {

		final int LUCK_NUMBER = 7; // int型の定数LUCK_NUMBERを宣言

		String name; // String型の変数nameを宣言
		name = "木戸風太です"; // nameを初期化(自分の名前の初期値として代入)
		System.out.println(name);
		name = "Java学習中"; // nameに再代入
		System.out.println(name);
		System.out.println(LUCK_NUMBER);

		// LUCK_NUMBER = 777; // LUCK_NUMBERを再代入するとエラー
	}

}
