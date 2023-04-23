package Pacakage11;

public class Question6 extends Question61{
	int a ;
	int b;
void demo6(int a , int b) {
	this.a = 10;
	this.b = 20;
	System.out.println(a);
	System.out.println(b);
	
}
void demo61() {
	System.out.println("aman jain");
	super.demo61();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Question6 obj = new Question6();
obj.demo6(5, 6);
obj.demo61();
	}

}
class Question61 {
	void demo61() {
		System.out.println("aman");
		
	}
}
