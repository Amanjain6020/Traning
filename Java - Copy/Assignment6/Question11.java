package Assignment6;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "aman@jain@aman   ";
		String[] arrOfStr = str1.split("@", 2);
		  
        for (String a : arrOfStr)
            System.out.println(a);
	
	}

}
