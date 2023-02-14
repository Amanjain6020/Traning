package Assignment3;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 737,rev =0, z;
z=n;
while(n>0) {
rev = (rev*10)+n%10;
n = n/10;

}
if(rev==z) {
	System.out.println("number is palindrome");
}else {
	System.out.println("number is not palindrome");
}


	}

}
