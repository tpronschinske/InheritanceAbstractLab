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
         
       Course one = new IntroToProgrammingCourse();

       one.setCourseName("Javascript");
       one.setCourseNumber("#00147");
       one.setCredits(3);

       System.out.println("Course: " + one.getCourseName() + " Course Number: " + one.getCourseNumber());
       
       
       Course two = new IntroJavaCourse();
       
       two.setCourseName("Java Programming");
       two.setCourseNumber("#00196");
       two.setCredits(4);
       two.setPrerequisites("Intro To Programming");
       
         System.out.println(" " + two.getCourseName() + two.getCourseNumber() + two.getPrerequisite() + two.getCredits());
       
       
       
      }
}
