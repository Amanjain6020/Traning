package Assignment6;

public class Question06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str = new String("aman jain");
		
		System.out.println("(.*)aman(.*) jain");
		System.out.println(Str.matches("(.*)aman(.*)"));
		System.out.println("aman jain");
		System.out.println(Str.matches("aman"));
	}

}
