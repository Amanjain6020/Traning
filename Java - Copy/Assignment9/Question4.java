package Assignment9;
abstract class check3{
	abstract       void run();
	void main() {
		System.out.println("from abstract class");
	}
}
class demo3 extends check3{
	void run() {
		System.out.println("run class");
	}
}
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check1 obj = new demo1();
		obj.run();
		check1 obj1 = new demo1();
		obj1.main();
	}

}
