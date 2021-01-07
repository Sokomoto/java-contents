package kidofuta;

public class java_practice03 {
	public static void main(String[]args) {
		//int num = 1;
		//while (num <= 10) {
			//System.out.print(num + (num < 10 ? "," : ""));
			//num++;
		//}


		// 上記while文でもできるが、下記for文の方が簡潔
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + (i < 10 ? "," : ""));
		}
	}

}
