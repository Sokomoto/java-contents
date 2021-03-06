
public class java_practice2 {
	public static void main(String[]args) {
		// ↓ 偶数の数をカウントする変数
		int even = 0;
		// ↓ 偶数の和の変数
		int sum = 0;
		// ↓ 1から10になるまで、繰り返しのfor文
		for (int num = 1; num <= 10; num++ ) {
			// ↓ 偶数か判別
			if (num % 2 == 0) {
				// ↓ 偶数だった場合インクリメントしカウント
				++even;
				// ↓ 偶数のみの和を計算
				sum += num;
			}
		}
		// ↑ 上記の偶数判別と個数カウント後に↓にて表示
		System.out.println("偶数の個数は " + even + "個です");
		System.out.println("偶数の和は " + sum + "です");
	}

}
