/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* Question 5
   In the startup class document what you think is good or bad about this
   architecture from the perspective of using abstraction and inheritance.
   (Remember, a startup class must have a main method)

I thought this was a hard task as all of the information in each class was all relevant and could be used in one SuperClass.
All of these classes used the same information that did not require each individual class for each method.
If you were to take multiple information on the classes. An example would be Multiple Teachers/ Days of Week. These are methods
that could be changed and altered.


Question 6. In your solution when can Liskov Substitution principle be used and when
   is it not possible. Write down your answer by providing a comment in the
   startup class.

The principle is sound and a great way to use his substitution process. But it wasnt helpful to know that these programs pertaind to courses
it made using his naming convention more difficult as you did not want to repeat the same words that were already used to make a SuperClass.
*/

package lab2;

/**
 *
 * @author Celeste
 */
public class StartUpLabTwo {
    
    
       
    public static void main(String[] args) {
        
        Course studentClass = new AdvancedJavaCourse();
        
        studentClass.setCourseName("Advanced Java");
        studentClass.setCourseNumber("#5514");
        studentClass.setCredits(3);
        studentClass.setPrerequisites("Intro To Java");
        
        System.out.println("Class: " + studentClass.getCourseName()+" Credits: " + studentClass.getCredits());
        
        Course studentClass2 = new IntroJavaCourse();
        
        studentClass2.setCourseName("Intro to Java");
        studentClass2.setCourseNumber("#1118");
        studentClass2.setCredits(4);
        studentClass2.setPrerequisites("Intro to Programming");
        
        System.out.println("Class: " + studentClass2.getCourseName()+" Course Number: " + studentClass2.getCourseNumber()+ " Credits: " + studentClass2.getCredits());
        
        Course studentClass3 = new IntroToProgrammingCourse();
        
        studentClass3.setCourseName("Intro To Programming");
        studentClass3.setCourseNumber("#8987");
        studentClass3.setCredits(3);
        studentClass3.setPrerequisites("None");
                
        System.out.println("Class: " + studentClass3.getCourseName()+ " Course Number: " + studentClass3.getCourseNumber() + " Credits: " + studentClass3.getCredits());
        
    }
}

