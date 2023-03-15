package Pacakage11;
class Question51{
	public Question51()
{

System.out.println("aman");
}
	public Question51(int i, int y) {
		System.out.println("aman ++");
	}
	
}
class Question52 extends Question51{
	public Question52() {
		super(4,5);
		System.out.println("programming");
	}
}
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Question52();
	}

}
