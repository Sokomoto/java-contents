package kidofuta;

public class java_practice8 {
	public static void main(String[]args) {
		int inter = 100;
		int end = 0;

		// 問題文には指定がないが、どの条件に合致したかを追記
		if ( (inter >= 60) && (end >= 60)) {
			System.out.println("条件1にて、合格");
		}
		else if ((inter + end) >= 130) {
			System.out.println("条件2にて、合格");
		}
		else if ((inter + end) >= 100 && inter >= 90 || end >= 90) {
			System.out.println("条件3にて、合格");
		}
		else {
			System.out.println("不合格");
		}
	}

}
