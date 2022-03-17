package models;

public class Professor extends Person {
//1.mainīgie
	private int id;
	private ProfDegree degree;
	
	private static int idCounter = 0; //nevajag ne set, ne get
	
//2.get funkcijas
	
	public int getId() {
		return id;
	}
	

	public ProfDegree getDegree() {
		return degree;
	}
	
	//3.set funkcijas
	public void setId()
	{
		this.id = idCounter;
		idCounter++;
	}
	
	
	public void setDegree(ProfDegree degree)
	{
		if(degree!=null)
		{
			this.degree  = degree;
		}
		else
		{
			this.degree = ProfDegree.master;
		}
	}
	
	
		

//4. konstruktori
	public Professor()
	{
		super();//tiek izsaukts Person() bez.arg.konstruk.
		setId();
		setDegree(ProfDegree.master);
	}
	
	public Professor(String name, String surname, ProfDegree degree)
	{
		//izsaukt Personas klases arg.konstruktoru
		super(name, surname);
		setId();
		setDegree(degree);
	}
	
	/*@Override
	public String toString() {
		return "Professor [name=" + name + ", surname=" + surname + ", degree=" + degree + "]";
	}
	
//Professor [name=Karina, surname=Sķirmante, degree=master]
	*/
	
//5. toString funkcija'
	//0 Karina Sķirmante master
	public String toString()
	{
		return id+ " "+super.toString() + " " + degree;
	}
//6. - pārējās funkcijas
	
	
}


