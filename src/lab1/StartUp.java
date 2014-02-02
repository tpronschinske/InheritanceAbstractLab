/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author Celeste
 */
public class StartUp {
    
    
     public static void main(String[] args) {
         
       Course oneClass = new IntroToProgrammingCourse();

       oneClass.setCourseName("Javascript");
       oneClass.setCourseNumber("#00147");
       oneClass.setCredits(3);
       oneClass.setPrerequisites("None");

       System.out.println("Course: " + oneClass.getCourseName() + " Course Number: " + oneClass.getCourseNumber() + "Credits: " + oneClass.getCredits() + "Prerequisite: " + oneClass.getPrerequisite());
       
       
       Course twoClass = new IntroJavaCourse();
       
       twoClass.setCourseName("Java Programming");
       twoClass.setCourseNumber("#00196");
       twoClass.setCredits(4);
       twoClass.setPrerequisites("Intro To Programming");
       
       System.out.println("Course: " + twoClass.getCourseName() + " Course Number: " + twoClass.getCourseNumber()+ "Credits: " + twoClass.getCredits() + "Prerequisite: " + twoClass.getPrerequisite());
       
       Course threeClass = new AdvancedJavaCourse();
       
       threeClass.setCourseName("Advanced Java Programming");
       threeClass.setCourseNumber("#00241");
       threeClass.setCredits(4);
       threeClass.setPrerequisites("Java Programming");
       
        System.out.println("Course: " + threeClass.getCourseName() + " Course Number: " + threeClass.getCourseNumber()+ "Credits: " + threeClass.getCredits() + "Prerequisite: " + threeClass.getPrerequisite());
       
       
      }
}
