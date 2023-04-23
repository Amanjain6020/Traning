package Pacakage11;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
demo21 obj = new demo21();
obj.run();
	}

}
class demo2{
	String color = "black";
}
class demo21 extends demo2{
	String color = "white";
	public void run() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
