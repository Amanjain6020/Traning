package Assignment8;

public class Question4 {
public int age;
public String name ;
public void run() {
	System.out.println("access from public access modifiers method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Question4 obj = new Question4();
obj.age=21;
obj.name="Aman";
obj.run();
System.out.println(obj.age);
System.out.println(obj.name);
	}

}
