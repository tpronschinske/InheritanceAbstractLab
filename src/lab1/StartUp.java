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
         
       Course oneClass = new IntroToProgrammingCourse("Javascript","#00147","None",3);

       System.out.println("Course: " + oneClass.getCourseName() + " |Course Number: " + oneClass.getCourseNumber() + " |Credits: " + oneClass.getCredits() + " |Prerequisite: " + oneClass.getPrerequisite());
       
       
       Course twoClass = new IntroJavaCourse("Java Programming","#00196","Intro To Programming",4);
   
       System.out.println("Course: " + twoClass.getCourseName() + " |Course Number: " + twoClass.getCourseNumber()+ " |Credits: " + twoClass.getCredits() + " |Prerequisite: " + twoClass.getPrerequisite());
       
       Course threeClass = new AdvancedJavaCourse("Advanced Java Programming","#00241","Java Programming",4);
       
       
       System.out.println("Course: " + threeClass.getCourseName() + " |Course Number: " + threeClass.getCourseNumber()+ " |Credits: " + threeClass.getCredits() + " |Prerequisite: " + threeClass.getPrerequisite());
       
       
      }
}
