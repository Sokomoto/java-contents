
public class Ready03 {
	public static void main(String[] args) {

		// インクリメント・デクリメント演算子
		int a;
		a = 10;
		a++; // a=11
		System.out.println(a);
		a = 10;
		a--; // a=9
		System.out.println(a);

		// 前置と後置
		int b;
		int c;

		b = 5;
		c = ++b; // aをインクリメント後にaがcに代入される
		System.out.println(c); // それぞれの値は、a が「6」で c も「6」

		b = 5;
		c = b++; // aをcに代入後に、aがインクリメントされる
		System.out.println(c); // それぞれの値は、a が「6」で c が「5」

		// 代入演算子
	}

}
