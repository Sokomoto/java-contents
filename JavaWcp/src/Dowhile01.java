
public class Dowhile01 {
	public static void main(String[] args) {
		int number = 51;
		// do-while文 :ループ開始
		do {
			// ブロック:
			// numberにnumber * 2 を代入してnumberを出力
			number *=2;
			System.out.println("Dowhile01 =" + number);
			// do-while文:
			// numberが50未満の場合、ブロックの処理をループ実行する
		} while (number < 50);
	}

}
