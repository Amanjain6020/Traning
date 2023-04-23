package Assignment14;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10;
			int b = 0;
			int div = a/b;
			System.out.println(div);
		}
		catch(ArithmeticException e) {
			System.out.println("please insert valid value");
		}
	}

}
