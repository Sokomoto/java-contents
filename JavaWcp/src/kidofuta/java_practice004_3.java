package kidofuta;

public class java_practice004_3 {
	public static void main(String[]args) {
		//乗計算がわかってない
		//int num = 2;
		//for (int i = 1; i <= 8; i++) {
		//	System.out.println(num * i);
		//}


		// 以下、回答例
		int num = 1;
		for(int i = 1; i <= 8; i++) {
			num *= 2;
			System.out.println("2の" + i + "乗" + num);
		}
	}

}