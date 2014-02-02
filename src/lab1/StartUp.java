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
       
       System.out.println("Course: " + two.getCourseName() + " Course Number: " + two.getCourseNumber());
       
       Course three = new AdvancedJavaCourse();
       
       three.setCourseName("Advanced Java Programming");
       three.setCourseNumber("#00241");
       three.setCredits(4);
       three.setPrerequisites("Java Programming");
       
        System.out.println("Course: " + three.getCourseName() + " Course Number: " + three.getCourseNumber());
       
       
      }
}
