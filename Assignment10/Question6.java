package Assignment10;
interface In6 {
	default void destination() {
		System.out.println("from interface with default");
	}
	public void main();
}
class Cl6 implements In6{
	public void main() {
		System.out.println("implements form class");
	}
}
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
In6 obj = new Cl6();
obj.destination();
	}

}
