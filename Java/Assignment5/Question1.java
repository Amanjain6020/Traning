package Assignment5;

public class Question1 {
static int x ;//static variables
static int y;
 static void find() {//static methods

	 x=10;
 }
 static void test() {
	 y=20;
 }
 String a;//Instance variables
	String b;
	public void take() {//instance methods
		a ="10";
	}
	public void up() {
		b="20";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find();
		test();
		Question1 run = new Question1();
		run.take();
		run.up();
		
	}

}
