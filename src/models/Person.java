package models;

public class Person {
	//1.mainīgie
	private String name;
	private String surname;
	//2.1 get
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}
	//2.2 set
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
	//3.konstruktori
	public Person()
	{
		setName("Test");
		setSurname("Person");
	}
	
	public Person(String name, String surname)
	{
		setName(name);
		setSurname(surname);
	}
	//4.toString
	public String toString()
	{
		return name + " " + surname;
	}
}
