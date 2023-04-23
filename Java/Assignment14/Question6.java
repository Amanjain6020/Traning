package Assignment14;
class Myexception extends Exception{
	public Myexception(String s) {
		super(s);
	}
}
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	throw new Myexception("user define exception");
}
catch(Myexception ex) {
	System.out.println("check");
	System.out.println(ex.getMessage());
}

	}

}
