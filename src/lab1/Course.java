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
public abstract class Course {
    
    private String prerequisite;
    private String courseName;
    private String courseNumber;
    private double credits;

    public Course(String courseName, String courseNumber, String prerequisite,  double credits) {
        this.prerequisite = prerequisite;
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
    }
    

    public String getPrerequisite() {
        return prerequisite;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }    

    public double getCredits() {
        return credits;
    }
    
    public void setCourseNumber(String courseNumber) {
        this.courseNumber=courseNumber;
    }

    public void setCredits(double credits) {
      this.credits=credits;
    }


    public void setCourseName(String courseName) {
        this.courseName=courseName;
    }
    
     public void setPrerequisites(String prerequisites) {
        this.prerequisite=prerequisite;
    }
   
    
}
