package Assignment13;

public class Question5 {
public long sum(int a,double b) {
	System.out.println("from return type int");
	long plus = (long) (a+b);
	System.out.println(plus);
	return plus;
}
public double sum(double a,int b) {
	double add = a+b+0.0;
	
	System.out.println("from return type double");
	System.out.println(add);
	return add;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Question5 obj = new Question5();
obj.sum(3.0, 4);
obj.sum(3, 5.0);
	}

}
