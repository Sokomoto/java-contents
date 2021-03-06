
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
		int d;
		d = 10; // d = 10 :dに10を代入
		d += 5; // d = 15 :dにd+5の結果を代入
		System.out.println(d);
		d -= 3; // d = 12 :dにd-3の結果を代入
		System.out.println(d);
		d *= 4; // d = 48 :dにd*4の結果を代入
		System.out.println(d);
		d /= 2; // d = 24 :dにd/2の結果を代入
		System.out.println(d);
		d %= 7; // d = 3 :dにd%7の結果を代入
		System.out.println(d);

		// 関係(比較)演算子
		int e = 5;
		boolean f;

		f = e < 5; // f = false
		System.out.println(f);
		f = e <= 5;  // c = true
		System.out.println(f);
		f = e > 4;   // c = true
		System.out.println(f);
		f = e >= 6;  // c = false
		System.out.println(f);
		f = e == 5;  // c = true
		System.out.println(f);
		f = e != 5;  // c = false
		System.out.println(f);

		// 論理演算子
		boolean g = true;
		boolean h = false;
		boolean i;

		i = g && true;   // i = true
		System.out.println(i);
		i = h && false;  // i = false
		System.out.println(i);
		i = g || true;   // i = true
		System.out.println(i);
		i = g || false;  // i = false
		System.out.println(i);
		i = !g;          // i = false
		System.out.println(i);
		i = !h;          // i = true
		System.out.println(i);

		// 文字列の連結
		String j = "100";
		String k = "200";
		String l;
		l = j + k; // l = 100200
		System.out.println(l);
		l = "あ" + "い"; // l = あい
		System.out.println(l);

		// 文字列の等価比較
		String m = "applePie";
		String n = "applePie";
		boolean o;
		o = m == n;  // q = true
		System.out.println(o);

		String p = "applePie";
		String q = "apple";
		String r = q + "Pie";
		o = p == r;  // o = false
		System.out.println(o);

		String s = "applePie";
		String t = new String("applePie");
		//o = s == t;  // o = false
		o = s.equals(t); // o = true 文字列を比較したい場合はequalsを使用
		System.out.println(o);

	}

}
