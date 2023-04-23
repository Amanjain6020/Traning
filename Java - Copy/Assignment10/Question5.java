package Assignment10;
interface In51{
	void name(String name);
}
interface In52{
	void name(String name);
}
class Cl51 implements In51{
	public void name(String name) {
		System.out.println(name);
	}
}
class Cl52 implements In52{
	public void name(String name) {
		System.out.println(name);
	}
}
public class Question5 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cl51 obj1 = new Cl51();
obj1.name("aman");
Cl52 obj2 = new Cl52();
obj2.name("aman");
	}

}
