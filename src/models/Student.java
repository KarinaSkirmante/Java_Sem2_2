package models;

public class Student extends Person {
	//1.mainīgie
	private int id;

	
	private static int idCounter = 100000;
	//2.1. get
	public int getId() {
		return id;
	}
	

	//2.2. set
	public void setId()
	{
		this.id = idCounter;
		idCounter++;
	}
	
	
	//3. konstruktori
	public Student()
	{
		//izsauksim Personas bezargumenta konst.
		super(); //Person()
		setId();
	}
	
	public Student(String name, String surname)
	{
		super(name, surname);//Person(name, surname)
		setId();
		//izsaukt Personas klases arg.konstruktoru
	}
	//4.toString
	public String toString()
	{
		return id+ " "+super.getName() + " " + super.getSurname();
	}

		

}
