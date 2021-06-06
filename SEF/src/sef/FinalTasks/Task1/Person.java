package sef.FinalTasks.Task1;

public class Person {
	String fullname;
	int age;

	public Person(){
		this.fullname="Change";
		this.age = 0;
	}

	public Person(String firstname, int age){
		this.fullname = firstname;
		this.age = age;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String introduce() {
		return "My name is " + fullname + " and I am " + age + " years old";
	}
}

