package models;

public class Grade {
	//1.mainīgie
	private int id;
	private int gradeValue;
	private Student student;
	private Course course;
	
	private static int idCounter = 1000000;

	//2.1 get
	public int getId() {
		return id;
	}

	public int getGradeValue() {
		return gradeValue;
	}

	public Student getStudent() {
		return student;
	}

	public Course getCourse() {
		return course;
	}
	//2.2 set
	public void setId() {
		this.id = idCounter++;
	}

	public void setGradeValue(int gradeValue) {
		if(gradeValue>0 && gradeValue<=10)
		{
			this.gradeValue = gradeValue;
		}
		else
		{
			this.gradeValue = 0;
		}
	}

	public void setStudent(Student student) {
		if(student!=null)
		{
			this.student = student;
		}
		else
		{
			this.student = new Student();
		}
	}

	public void setCourse(Course course) {
		if(course!=null)
		{
			this.course = course;
		}
		else
		{
			this.course = new Course();
		}
	}
	
	
	
	//3.konstruktori
	public Grade()
	{
		setId();
		setGradeValue(1);
		setCourse(new Course());
		setStudent(new Student());
	}
	
	public Grade(int gradeValue, Student student, Course course)
	{
		setId();
		setGradeValue(gradeValue);
		setStudent(student);
		setCourse(course);
	}

	@Override
	public String toString() {
		return "Grade [id=" + id + ", gradeValue="
	+ gradeValue + ", student=" + student.getName()+" "+student.getSurname() + ", course=" + course.getTitle() + "]";
	}
	
	//4.toString
	
	//VeAService
	//izvedot stduentus
	//izveidot atzīmes
	

}
