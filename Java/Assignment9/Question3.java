package Assignment9;
abstract class check2{
	abstract       void run();
	void main() {
		System.out.println("from abstract class");
	}
}
class demo2 extends check2{
	void run() {
		System.out.println("run class");
	}
}
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check2 obj = new demo2();
		obj.run();
		check2 obj1 = new demo2();
		obj1.main();
	}

}
