package test;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Peter","123",39);
		Pm pm = new Pm();
		pm.addP(p1);
		pm.showInfo(p1.getId());
	}

}

class Pm{
	private ArrayList al = null;
	
	public Pm(){
		al = new ArrayList();
	}
	
	public void addP(Person p){
		al.add(p);
	}
	
	public void showInfo(String id){
		for(int i=0;i<al.size();i++){
			Person temp = (Person)al.get(i);
			if(id.equals(temp.getId())){
				System.out.println("name is:"+temp.getName());
				System.out.println("id is:"+temp.getId());
				System.out.println("age is:"+temp.getAge());
			}
		}
	}
	
	public void updateAge(String id, int age){
		for(int i=0;i<al.size();i++){
			Person temp = new Person();
			if(id.equals(temp.getId())){
				temp.setAge(age);
			}
		}
	}

}

class Person{
	private String name;
	private String id;
	private int age;
	
	public Person(){
	}
	
	public Person(String name, String id, int age){
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	public void showInfo(){
		System.out.println(this.name+"µÄÄêÁäÊÇ£º"+this.age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}