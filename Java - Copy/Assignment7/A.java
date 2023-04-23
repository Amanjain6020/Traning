package Assignment7;

public class A {
	public void sun() {
		System.out.println("from sun of class A");
	}
	public void run(){
		System.out.println("from run of class A");
	}
	public static void main(String[] args) {
		A obj0 = new A();
		B obj1 = new B();
		C obj2 = new C();
		obj0.sun();
		obj0.run();
		obj1.sun();
		obj1.fun();
		obj2.sun();
	}

	}

class B{
	public void sun() {
		System.out.println("from sun of class B");
	}
	public void fun() {
		System.out.println("from fun of class B");
	}
}
class C{
	public void sun() {
		System.out.println("from sun of class C");
	}

}
	
		// TODO Auto-generated method stub

	