package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import models.Course;
import models.Grade;
import models.ProfDegree;
import models.Professor;
import models.Student;



public class VeAService {

	//izveidot Person srasktu un tajā ielikt Student un Professor
	private static ArrayList<Professor> allProfessors = new ArrayList<>();
	private static ArrayList<Course> allCourses = new ArrayList<>();
	private static ArrayList<Student> allStudents = new ArrayList<>();
	private static ArrayList<Grade> allGrades = new ArrayList<>();
	
	
	public static void main(String[] args) {
		Random     rand = new Random();
		
		Professor prof1 = new Professor("Karina", "Šķirmante", ProfDegree.master);
		Professor prof2 = new Professor("Estere", "Vītola", ProfDegree.master);
		Professor prof3 = new Professor("Vairis", "Caune", ProfDegree.doctor);
		allProfessors.add(prof1);
		allProfessors.add(prof2);
		allProfessors.add(prof3);
		
		for (Professor prof : allProfessors) {
			System.out.println(prof);
		}
		
		System.out.println("-------------------------------------------------");
		Course c1 = new Course("Programmēšana tīmeklī JAVA", (byte)4, prof1);
		Course c2 = new Course("Objektorientētā programmēšana", (byte)4, prof2);
		Course c3 = new Course("Datu Struktūras", (byte)4, prof1);
		Course c4 = new Course("Algoritmu teorija", (byte)4, prof3);
		allCourses.add(c1);
		allCourses.add(c2);
		allCourses.add(c3);
		allCourses.add(c4);
		for (Course cour : allCourses) {
			System.out.println(cour);
		}
		
		
		Student stud1 = new Student("Jānis", "Bērziņš");
		Student stud2 = new Student("Līga", "Jaukā");
		Student stud3 = new Student("Baiba", "Nejaukā");
		allStudents.add(stud1);
		allStudents.add(stud2);
		allStudents.add(stud3);
		for (Student stud : allStudents) {
			System.out.println(stud);
		}
		
		Grade gr1 = new Grade(10, stud1, c1);//Jānis, JAVA, 10
		Grade gr2 = new Grade(5, stud1, c4);//Jānis, DatuStr, 5
		Grade gr3 = new Grade(3, stud2, c1);//Līga, JAVA, 3
		Grade gr4 = new Grade(5, stud2, c2);//Līga, OOP, 5
		Grade gr5 = new Grade(6, stud2, c3);//Līga, DatuStr, 6
		Grade gr6 = new Grade(1, stud3, c3);//Baiba, DatuStr, 1
		Grade gr7 = new Grade(10, stud3, c4);//Baiba, Alg, 10
		allGrades.add(gr1);
		allGrades.add(gr2);
		allGrades.add(gr3);
		allGrades.add(gr4);
		allGrades.add(gr5);
		allGrades.add(gr6);
		allGrades.add(gr7);
		for (Grade gr : allGrades) {
			System.out.println(gr);
		}

	}

}
