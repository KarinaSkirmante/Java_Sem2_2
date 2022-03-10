package service;

import java.util.Random;

import models.Course;
import models.ProfDegree;
import models.Professor;



public class VeAService {

	public static void main(String[] args) {
		Random     rand = new Random();
		
		Professor prof1 = new Professor("Karina", "Šķirmante", ProfDegree.master);
		Professor prof2 = new Professor("Estere", "Vītola", ProfDegree.master);
		Professor prof3 = new Professor("Vairis", "Caune", ProfDegree.doctor);
		System.out.println(prof1.toString());
		System.out.println(prof2);
		System.out.println(prof3);
		
		System.out.println("-------------------------------------------------");
		Course c1 = new Course("Programmēšana tīmeklī JAVA", (byte)4, prof1);
		Course c2 = new Course("Objektorientētā programmēšana", (byte)4, prof2);
		Course c3 = new Course("Datu Struktūras", (byte)4, prof1);
		Course c4 = new Course("Algoritmu teorija", (byte)4, prof3);
		System.out.println(c1.toString());
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);


	}

}
