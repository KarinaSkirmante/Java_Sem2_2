package models;


public class Professor {
//1.mainīgie
	private String name;
	private String surname;
	private ProfDegree degree;
	
//2.get funkcijas
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public ProfDegree getDegree() {
		return degree;
	}
	
	//3.set funkcijas
	//name = null;
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
//5. toString funkcija
//6. - pārējās funkcijas
	
	
}


