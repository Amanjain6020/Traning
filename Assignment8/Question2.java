package Assignment8;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
demo1 obj = new demo1();
obj.data();
obj.age=21;
obj.name="aman";
System.out.println(obj.age);
System.out.println(obj.name);
	}

}
class demo1 {

	int age;
	String name;
	void data() {
		System.out.println("access default access modifier");
		
	}
}
