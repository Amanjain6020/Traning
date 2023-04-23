package Assignment10;

public interface Question9 {
	void run1();
final int a = 10;
}
interface In9 extends Question9{
	void run1();
}
class Cl9 implements Question9{
	public void run1() {
		System.out.println("execute from interface");
	}
	public static void main(String[] args) {
		Cl9 obj = new Cl9();
		obj.run1();
		System.out.println(a);
	}
}