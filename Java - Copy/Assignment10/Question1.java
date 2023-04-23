package Assignment10;
interface In1{
	void display();
}
public class Question1 implements In1 {
public void display() {
	System.out.println("executes from interface");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Question1 obj = new Question1();
obj.display();
	}

}
