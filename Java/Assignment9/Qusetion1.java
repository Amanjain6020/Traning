package Assignment9;
abstract class check{
	abstract       void run();
	void main() {
		System.out.println("from abstract class");
	}
}
class demo extends check{
	void run() {
		System.out.println("run class");
	}
}
public class Qusetion1 {
public static void main(String[] args) {
	check obj = new demo();
	obj.run();
	check obj1 = new demo();
	obj1.main();
}


}
