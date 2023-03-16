package package12;

public class Question3 {
Question3()
{
	System.out.println("from default constructor");
}
public Question3(int i){
	System.out.println("from public constructor");
}
protected Question3(String a) {
	System.out.println("from protected constructor");
}
private Question3(int i,int j) {
	System.out.println("from private constructor");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Question3();
new Question3(1);
new Question3("a");
new Question3(2,3);
	}

}
