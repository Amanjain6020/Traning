package Assignment14;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	System.out.println("inside try block");
	int sum = 16/2;
	System.out.println(sum);
}
catch(ArithmeticException e) {
	System.out.println("Arithmetic Exception");
	
}
finally {
	System.out.println("i execute always");
}
	}

}
