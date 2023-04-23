package Assignment16;
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String, Integer> map = new HashMap<>();
map.put("aman",0);
map.put("gavish",1);
map.put("archit",2);
map.put( "arymaan",3);
map.put("shivam",4);
map.put("dwiz",5);
map.put( "aniket",6);
map.put( "atishay",7);
map.put( "adarsh",8);
map.put( "akshat",9);
System.out.println(map.get("aman"));
System.out.println(map);
HashMap<String,Integer> map1 = new HashMap<String,Integer>(map);
System.out.println(map1);

System.out.println(map.containsKey("gavish"));
System.out.println(map.containsValue(1));
System.out.println(map.isEmpty());
System.out.println(map.size());
for(Map.Entry<String,Integer> e : map1.entrySet()) {
	System.out.print("key :-"+e.getKey()+"  ");
	System.out.println("value :-"+e.getValue());
}
System.out.println(map.remove("aman", 0));
System.out.println(map);

	}

}
