package Assignment16;
import java.util.*;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> hash = new HashSet<String>();
hash.add("India");
hash.add("Austrialia");
hash.add("south africa");
hash.add("India");
System.out.println(hash);
System.out.println(hash.contains("India"));
hash.remove("Austrialia");
System.out.println(hash);
Iterator<String> i = hash.iterator();
while(i.hasNext())
	System.out.println(i.next());
System.out.println(hash.isEmpty());
System.out.println(hash.size());
System.out.println(hash.clone());
hash.clear();
System.out.println(hash);

	}

}
