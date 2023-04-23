package Assignment3;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 153;
int z = n;
int count = 0;
int sum =0;
while(z>0) {//using for check how many are there
	count = count+1;
	z=z/10;
	
}
z =n;
while(z>0) {//using for check which number are there
	int digit = z%10 ,pro=1;
	for(int i= 1; i<=count; i++)
		pro = pro*digit;
	sum = sum+pro;
	z=z/10;
}

if(sum == n) {
	System.out.println("amstrong");
}else {
	System.out.println("not amstrong");
}
	}

}
