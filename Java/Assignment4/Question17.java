package Assignment4;

public class Question17 {
	
	private static void find(int[] arr) {
		 int toCheckValue1 =12;
		 int toCheckValue2 =23;
		boolean num = false;
		for(int element : arr) {
			if(element == toCheckValue1) {
				num = true;
				break;
			}
		}
		for(int element : arr) {
			if(element == toCheckValue2) {
				num = true;
				break;
			}
		}

		System.out.println("Is " + toCheckValue1
                + " present in the array: " + num);
		System.out.println("Is " + toCheckValue2
                + " present in the array: " + num);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,23,34,1,2,3,4,56,67};
		
				;
		find(arr);
}

}
