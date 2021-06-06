package sef.FinalTasks.Task1;

public class Student extends Person {

	public String schoolname;

	public Student(String fullname, int age, String schoolName) {
		super(fullname, age);
		this.schoolname = schoolName;
	}

	public String introduce() {
		return "I study in university " + schoolname;

	}
}
