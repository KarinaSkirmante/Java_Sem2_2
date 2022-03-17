package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;

import models.Course;
import models.Grade;
import models.Person;
import models.ProfDegree;
import models.Professor;
import models.Student;



public class VeAService {

	//izveidot Person srasktu un tajā ielikt Student un Professor
	//private static ArrayList<Professor> allProfessors = new ArrayList<>();
	private static ArrayList<Course> allCourses = new ArrayList<>();
	//private static ArrayList<Student> allStudents = new ArrayList<>();
	private static ArrayList<Grade> allGrades = new ArrayList<>();
	private static ArrayList<Person> allPersons = new ArrayList<>();
	private static PriorityQueue<Course> allCourseByPriority = new PriorityQueue<>();
	
	public static void main(String[] args) {
		Random     rand = new Random();
		
		Professor prof1 = new Professor("Karina", "Šķirmante", ProfDegree.master);
		Professor prof2 = new Professor("Estere", "Vītola", ProfDegree.master);
		Professor prof3 = new Professor("Vairis", "Caune", ProfDegree.doctor);
		allPersons.add(prof1);
		allPersons.add(prof2);
		allPersons.add(prof3);
		
		/*for (Professor prof : allProfessors) {
			System.out.println(prof);
		}*/
		
		System.out.println("-------------------------------------------------");
		Course c1 = new Course("Programmēšana tīmeklī JAVA", (byte)2, prof1);
		Course c2 = new Course("Objektorientētā programmēšana", (byte)6, prof2);
		Course c3 = new Course("Datu Struktūras", (byte)1, prof1);
		Course c4 = new Course("Algoritmu teorija", (byte)8, prof3);
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
		allPersons.add(stud1);
		allPersons.add(stud2);
		allPersons.add(stud3);
		
		
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
		
		System.out.println("------------------------");
		Person p = new Person("Kalvis", "Kalns");
		allPersons.add(p);
		Student stud4 = new Student("Pēteris", "Lielais");
		allPersons.add(stud4);
		//prof1, prof2, prof3, stud1, stud2, stud3, p, stud4
		for (Person pers : allPersons) {
			System.out.println(pers.toString());
			
		}
		
		
		for (Person pers : allPersons) {
					
			if(pers instanceof Professor)
			{
				Professor prof = (Professor)pers;
				System.out.println(prof.getDegree());
			}
		}
		
		
		allCourseByPriority.add(c1);
		allCourseByPriority.add(c2);
		allCourseByPriority.add(c3);
		allCourseByPriority.add(c4);
		for (Course cour : allCourseByPriority) {
			System.out.println(cour);
		}
		
		

	}
	
	//CRUD  -create, read, update, delete
	//C - create
	private static boolean addNewCourse(String title, byte creditPoints, Professor professor)
	{
		Course course = new Course(title, creditPoints, professor);
		if(allCourses.contains(course))
		{
			return false;
		}
		else
		{
			allCourses.add(course);
			return true;
		}
	}
	//R - read
	private static Course readCourseById(int courseId)
	{
		if(courseId>=10000 && courseId<100000)
		{
			for (Course course : allCourses) {
				if(course.getId() == courseId)
				{
					return course;
				}
			}
		}
		
		return new Course();
	}
	
	//U - update
	private static boolean updateCourseById(int courseId, byte updateCp, Professor updateProfessor)
	{
		if(courseId>=10000 && courseId<100000)
		{
			for (Course course : allCourses) {
				if(course.getId() == courseId)
				{
					course.setCreditPoints(updateCp);
					course.setProfessor(updateProfessor);
					return true;
				}
			}
		}
		
		return false;
	}
	
	//D - delete
	private static boolean deleteCourseById(int courseId)
	{
		if(courseId>=10000 && courseId<100000)
		{
			for (Course course : allCourses) {
				if(course.getId() == courseId)
				{
					allCourses.remove(course);
					return true;
				}
			}
		}
		
		return false;
	}
	
	//1.funkcija galven, ja vēlamies noeikt vidējo atzīmi konkrētam studentam
	private static float calculateAVGGradeByStudent(int studentId)
	{
	//2. pāŗbuadm ienākošo parametru
		if(studentId>=100000 && studentId<1000000)
		{
	//3. izveidosim mainīgos priekš atzīmju summas
	//4. izmaveidosim mainīgos priekš atzīmju skaita
			float sum = 0;
			int gradeCounter = 0;
	//5.for vai for ech ciklā iet cuari visām atzīmēm allGrades sarakstā un pāŗbauda,
	//via ir šī konkrēta padotāa studnta atzīme
			for(Grade gr: allGrades)
			{
				if(gr.getStudent().getId() == studentId)
				{
					sum+=gr.getGradeValue();
					gradeCounter++;
				}
			}
			return sum/gradeCounter;
	//5.1. ja ir, td to pieksiatam atzīju summa un palielinām atzīmju skaitu par 1
	//6. apreķinām vidēo atzmi un to atgriežam
		}
		return 0;
	}
	
	//1.funkcija galven, ja vēlamies noeikt vidējo atzīmi konkrētam studentam
		private static float calculateAVGGradeByCourse(int courseId)
		{
		//2. pāŗbuadm ienākošo parametru
			if(courseId>=10000 && courseId<100000)
			{
		//3. izveidosim mainīgos priekš atzīmju summas
		//4. izmaveidosim mainīgos priekš atzīmju skaita
				float sum = 0;
				int gradeCounter = 0;
		//5.for vai for ech ciklā iet cuari visām atzīmēm allGrades sarakstā un pāŗbauda,
		//via ir šī konkrēta padotāa studnta atzīme
				for(Grade gr: allGrades)
				{
					if(gr.getCourse().getId()==courseId)
					{
						sum+=gr.getGradeValue();
						gradeCounter++;
					}
				}
				return sum/gradeCounter;
		//5.1. ja ir, td to pieksiatam atzīju summa un palielinām atzīmju skaitu par 1
		//6. apreķinām vidēo atzmi un to atgriežam
			}
			return 0;
		}

	
	
	
	

}
