package lab1;



/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends IntroJavaCourse {

    public AdvancedJavaCourse(String prerequisite, String courseName, String courseNumber, double credits) {
        super(prerequisite, courseName, courseNumber, credits);
    }
    
    @Override
    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
             System.out.println("Error: course number cannot be null of empty string");
        }
        this.setCourseNumber(courseNumber);
        
    }


    @Override
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
             System.out.println("Error: credits must be in the range 0.5 to 4.0");
         }
        this.setCredits(credits);
    }


    
    @Override
    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
          System.out.println("Error: course name cannot be null of empty string");
        }
       this.setCourseName(courseName);
    }

   
    
    @Override
     public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
             System.out.println("Error: prerequisites cannot be null of empty string");
        }
        this.setPrerequisites(prerequisites);
    }
    

  
    
}
