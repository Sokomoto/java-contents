
public class java_practice011 {
	public static void main(String[]args) {
		//int x = 5;
		//x %= 2;
		//余りの出し方がわかってない
		//System.out.println(x);

		// 以下、回答例
		int x = 5;
		System.out.println("商= " + (x / 2) + "余り＝ " + (x % 2));
		// 商と余りをそれぞれ求める必要があった


		/* 最初に書いていたような形式でやりたいなら下記。
		 * しかし上記回答例の方が簡潔
		 */

		//int x1 = 5;
		//int x2 = 5;

		//x1 /= 2;
		//x2 %= 2;

		//System.out.println("商= " + x1 + "余り＝ " + x2);
	}

}