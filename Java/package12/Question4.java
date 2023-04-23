package package12;

public class Question4 {
	int a;
Question4(int a){
	System.out.println("from return type int");
	return;
}
Question4(String a){
	System.out.println("from return type string");
	return;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Question4(1);
new Question4("a");
	}

}
