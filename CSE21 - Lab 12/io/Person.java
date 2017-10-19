package io;

public class Person {
	private String name;
	private int age;
	private String location;
	
	public Person() {
			this.name = "";
			this.age = 0;
			this.location = "";
	}
	public Person(String name, int age, String location) {
			this.name = name;
			this.age = age;
			this.location = location;
	}
	
	public void setName(String name) {
			this.name = name;
	}
	
	public String getName() {
		
			return name;
	}
	
	public void setAge(int age) {
			this.age = age;
	}
	
	public int getAge() {
			
			return age;
	}
	
	public void setLocation (String location) {
			this.location = location;
	}
	
	public String getLocation() {
			
			return location;
	}
	
	@Override
	public String toString() {
		
		return name + " @" + location + " is " + age;
		
	}
}
	
