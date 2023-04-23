package Assignment13;

public class Question3 {
	int i;
	int j;
	int sum;
	public void run(int i, String j) {
		System.out.println("from first method");
		
	}
	public void run(String i,int j) {
		System.out.println("from second method");
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question3 obj = new Question3();
		obj.run(1,"a");
		obj.run("a",1);
	}

}
