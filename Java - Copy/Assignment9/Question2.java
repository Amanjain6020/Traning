package Assignment9;
abstract class check1{
	abstract       void run();
	void main() {
		System.out.println("from abstract class");
	}
}
class demo1 extends check1{
	void run() {
		System.out.println("run class");
	}
}


public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check1 obj = new demo1();
		obj.run();
		check1 obj1 = new demo1();
		obj1.main();
	}

}
