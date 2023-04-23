package Assignment13;

public class Question2 {
	public static void run(int i) {
		System.out.println("from first method");
	}
	public static void run(String a) {
		System.out.println("from second method");
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Question2 obj = new Question2();
	obj.run(1);
	obj.run("a");
		}
	

}
