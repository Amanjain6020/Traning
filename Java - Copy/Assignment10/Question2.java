package Assignment10;
interface In2{
	void run();
	void main();
}
abstract class Ab1 implements In2 {
public void main() {
		
	}
	

}


public class Question2  {
	public void run() {
		System.out.println("executes from interface");
	}

	public static void main(String[] args) {
		Question2 obj = new Question2();
		obj.run();
		
	}
}
