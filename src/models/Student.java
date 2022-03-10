package models;

public class Student {
	//1.mainīgie
	private int id;
	private String name;
	private String surname;
	
	private static int idCounter = 100000;
	//2.1. get
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}
	//2.2. set
	public void setId()
	{
		this.id = idCounter;
		idCounter++;
	}
	
	public void setName(String name) {
		if(name!=null && name.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+\\s?([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+)?"))
		{
			this.name = name;
		}
		else
		{
			this.name = "notknown";
		}
	}
	public void setSurname(String surname) {
		if(surname!=null && surname.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+[-]?([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+)?"))
		{
			this.surname = surname;
		}
		else
		{
			this.surname = "notknown";
		}
	}
	//3. konstruktori
	public Student()
	{
		setId();
		setName("Test");
		setSurname("Student");
	}
	
	public Student(String name, String surname)
	{
		setId();
		setName(name);
		setSurname(surname);
	}
	//4.toString
	public String toString()
	{
		return id+ " "+name + " " + surname;
	}
	

}
