package Assignment10;
interface In71{
	void run();
}
interface In72 extends In71{
	 public default void run() {
		 System.out.println("access form interface");
	 }
}
public class Question7 implements In72{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Question7 obj = new Question7();
obj.run();
	}

}
