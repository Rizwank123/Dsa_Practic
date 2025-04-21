package arrays;

import java.util.ArrayList;
import java.util.List;

public class Emplyee {
	private int id;
	String name;
	int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emplyee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public Emplyee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		List<Emplyee> emList=new ArrayList<>();
		
		emList.add(new Emplyee(1, "Rizwan", 26));
		emList.add(new Emplyee(2, "Arshad", 26));
		emList.add(new Emplyee(3, "Ayaz", 26));
		emList.stream().forEach(n->System.out.println(n));
	}

}
