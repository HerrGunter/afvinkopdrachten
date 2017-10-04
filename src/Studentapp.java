package javaapplication4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeroe
 * 
 
*/

import javaapplication4.Student;


public class Studentapp{ 
    
        public static void main(String[] args) {
	Student st1 = new Student("Jeroen", 562103);
	Student st2 = new Student("Djamel",34334);
	Student st3 = new Student("Ruben",33434);
	Student st4 = new Student("Jeroen", 563060);
	System.out.println("Naam:"+st1.getnaam()+"\nStudentnummer:"+st1.getStudentnummer());
	System.out.println("Naam:"+st2.getnaam()+"\nStudentnummer:"+st2.getStudentnummer());
	System.out.println("Naam:"+st3.getnaam()+"\nStudentnummer:"+st3.getStudentnummer());
	System.out.println("Naam:"+st4.getnaam()+"\nStudentnummer:"+st4.getStudentnummer());    
}
}