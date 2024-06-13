package LambdaExamples;

public class Student 
{
	private int id;
	private String Name;
	private String course;
	public Student(int i, String string, String string2) {
		super();
		// TODO Auto-generated constructor stub
		this.id=i;
		this.Name=string;
		this.course=string2;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", course=" + course + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getCourse()=" + getCourse() + "]";
	}
	
	
	
	
	

}
