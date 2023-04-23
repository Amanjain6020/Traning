package Assignment8;
import Assignment88.Question33;
public class Question3 extends Question33 {
void helper() {
	System.out.println(id);
	System.out.println(name);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question3 obj1 = new Question3();
		obj1.helper();
demo2 obj = new demo2();
obj.age=21;
obj.name="aman";
obj.run();
System.out.println(obj.age);
System.out.println(obj.name);

	}

}
class demo2 {
	protected int age;
	protected String name;
	protected void run() {
		System.out.println("access from protected method");
	}
}
