package Assignment3;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		int z = 30;
		System.out.println("var x = "+x);
		System.out.println("var y = "+y);
		System.out.println("var y = "+z);
		
		if (x>y&&x>z) {
			System.out.println("largest number is = "+x);
		}else if(y>x&&y>z) {
			System.out.println("largest number is = "+y);	
		}else {
			System.out.println("largest number is = "+z);
		}
	}

}
