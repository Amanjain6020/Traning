package Assignment14;

public class Question4 {
static void fun() {
	try {
		throw new NullPointerException("demo");
	}
	catch(NullPointerException e) {
		System.out.println("please insert something");
		throw e;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	fun();
}
catch(NullPointerException e) {
	System.out.println("from another catch exception");
}
	}

}
