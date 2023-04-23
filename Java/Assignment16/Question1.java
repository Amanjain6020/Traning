package Assignment16;
import java.util.ArrayList;
import java.util.Iterator;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str = new ArrayList<String>(10);
		str.add("aman");
		str.add("akshat");
		str.add("yash");
		str.add("JAla");
		str.add("academy");
		str.add("antim");
		str.add("karan dhokebazz");
		str.add("tanishq");
		str.add("ashu");
		str.add("pooja");
		Iterator it = str.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		str.add(2, "jain");
		System.out.println(str);
		str.remove("aman");
		System.out.println(str);
		str.remove(0);
		System.out.println(str);
		str.set(0,"aman");
		System.out.println(str);
		System.out.println(str.contains("amna"));
		System.out.println(str.indexOf("aman"));
		System.out.println(str.size());
		str.removeAll(str);
		System.out.println(str);
		
	}

}
