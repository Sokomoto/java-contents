
public class java_practice07 {
	public static void main(String[]args) {
		//int x = 3;
		//int y = 7;

		//わからないので再代入
		//x = 7;
		//y = 3;

		// 以下、回答例
		int x,y,t;
		x = 3;
		y = 7;

		t = x;
		x = y;
		y = t;
		// 再代入した方が早い気がするのは知識不足だからだろうか

		System.out.println("x= " + x + ",y= " + y);
	}

}
