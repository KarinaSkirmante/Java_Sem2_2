package models;

public class Course implements Comparable<Course>{
	//1.mainīgie
	private int id;
	private String title;
	private byte creditPoints;
	private Professor professor;
	
	private static int idCounter = 10000;

	//2.1 get funkcijas
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public byte getCreditPoints() {
		return creditPoints;
	}

	public Professor getProfessor() {
		return professor;
	}

	//2.2. set funkcijas
	public void setId() {
		this.id = idCounter++;
	}

	public void setTitle(String title) {
		if(title!=null && title.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[\\s\\da-zēūīļķģšāžčņA-ZĒŪĪĀŠĢĶĻŅČŽ]+"))
		{
			this.title = title;
		}
		else
		{
			this.title= "unknown";
		}
	}

	public void setCreditPoints(byte creditPoints) {
		if(creditPoints>0 && creditPoints<=20)
		{
			this.creditPoints = creditPoints;
		}
		else
		{
			this.creditPoints = 2;
		}
	}

	public void setProfessor(Professor professor) {
		if(professor!=null)
		{
			this.professor = professor;
		}
		else
		{
			this.professor = new Professor();
		}
	}
	
	
	
	//3.konstruktori
	public Course()
	{
		setId();
		setTitle("Testa kurss");
		setCreditPoints((byte)2);
		setProfessor(new Professor());
	}
	public Course(String title, byte creditPoints, Professor professor)
	{
		setId();
		setTitle(title);
		setCreditPoints(creditPoints);
		setProfessor(professor);
	}
	//4.toString
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + 
				", creditPoints=" + creditPoints + ", professor=" + professor.getName() + " " +professor.getSurname()+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		Course otherCourse = (Course)obj;
		if(title.equals(otherCourse.getTitle()) && creditPoints == otherCourse.getCreditPoints())
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

	@Override
	public int compareTo(Course o) {
		if(creditPoints > o.creditPoints)
		{
			return 1;
		}
		else if (creditPoints < o.creditPoints)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	
	
	
	
	

}
