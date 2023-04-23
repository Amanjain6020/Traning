package Assignment8;

public class Question1 {
private int age;
private String name;
private void data(int age, String name) {
	this.age = age;
	this.name = name;
	System.out.println(age);
	System.out.println(name);
}
public void setage(int age) {
	this.age = age;
}
public void setname(String name) {
	this.name = name;
}
public int getage() {
	return this.age;
}
public String getname() {
	return this.name;
}

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Question1 obj = new Question1();
		obj.data(21,"aman");
	obj.setage(21);
	obj.setname("aman");
	System.out.println(obj.getage());
	System.out.println(obj.getname());
demo obj1 = new demo();
obj1.privateMethodCaller();
obj1.setid(2211);
obj1.setname("Royal Enfield");
System.out.println(obj1.getid());
System.out.println(obj1.getname());
	}

}
class demo{
	private int id;
	private String name;
	private void Vehicle(int id,String name) {
		this.id= id;
		this.name= name;
		System.out.println(id);
		System.out.println(name);
	}
	public void privateMethodCaller() {
		Vehicle(2211,"Royal Enfield");
	}
	public void setid(int id) {
		this.id = id;
	}
	public void setname(String name) {
		this.name = name;
		
	}
	public int getid() {
		return this.id;
	}
	public String getname() {
		return this.name;
	}
}
