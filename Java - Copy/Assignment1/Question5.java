package Assignment1;

public class Question5 {
	//in java there no concept like global variable, but this kind of concept are defining by static keyword
	static int a=50, b=40;  
	static void main() {
		
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		//local variable
		int a=40, b=40;  
		System.out.println(a+b);
		
		
		Question5.main();//global variable
	}
	
}
