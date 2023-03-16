package Assignment13;

public class Question1 {
public static void run(int i) {
	System.out.println("from first method");
}
public static void run(int j,int z) {
	System.out.println("from second method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Question1 obj = new Question1();
obj.run(1);
obj.run(1,2);
	}

}
