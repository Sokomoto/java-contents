
public class Chapter08_2 {
	public static void main(String[]args) {
		for (int count = 0; count < 5; count++) {
			if (count == 4) {
				//break;
				continue;
			}
			System.out.println("Break01 = " + count);
		}
	}

}