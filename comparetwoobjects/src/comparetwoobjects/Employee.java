package comparetwoobjects;

public class Employee {
	private String name;
	private String lname;
	private int salary;
	private String course;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Employee(String name, String lname, int salary, String course) {
		super();
		this.name = name;
		this.lname = lname;
		this.salary = salary;
		this.course = course;
	}
	
}
