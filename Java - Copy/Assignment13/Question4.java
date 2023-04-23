package Assignment13;

public class Question4 {
	public static void run(int i) {
		System.out.println("from first method");
	}
	public static void run(String a) {
		System.out.println("from second method");
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Question4 obj = new Question4();
	obj.run(1);
	obj.run("a");
		}

}
