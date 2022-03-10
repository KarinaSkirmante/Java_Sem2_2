package service;

import java.util.Random;

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

	}

}
