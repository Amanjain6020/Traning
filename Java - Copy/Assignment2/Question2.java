package Assignment2;

public class Question2 {
int a = 3;
int b = 5;
void postincrement(){
	int c =a++ + b;//post increment
	System.out.println(c);
}
void preincrement(){
	int d =++a + b ;//pre increment
	System.out.println(d);
}
void postdecrement(){
	int e =a-- + b;//post decrement
	System.out.println(e);
}
void predecrement(){
	int f =--a + b;//pre decrement
	System.out.println(f);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question2 obj = new Question2();
obj.postincrement();
obj.preincrement();
obj.postdecrement();
obj.predecrement();
	}

}
