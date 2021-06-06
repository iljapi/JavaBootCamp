package sef.FinalTasks.Task1;

public class Employee extends Person {

	private String jobTitle;
	private String company;
	private int wages;

	public Employee(String fullname, int age, String jobTitle, String companyName, int wages) {
		super(fullname, age);

		this.jobTitle = jobTitle;
		this.company = companyName;
		this.wages = wages;
		
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getWages() {
		return wages;
	}

	public void setWages(int wages) {
		this.wages = wages;
	}

	public String introduce() {
		return super.introduce() + ", I work as " + jobTitle + " in " + company;
	}

}
