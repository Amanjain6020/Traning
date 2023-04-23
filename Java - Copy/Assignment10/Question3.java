package Assignment10;
interface In3{
	void name();
}
class C1 implements In3{
public void name() {
	System.out.println("aman");
}
}
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
In3 obj = new C1();
obj.name();
	}

}
