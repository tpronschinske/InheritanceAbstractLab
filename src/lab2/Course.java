/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 *
 * @author Celeste
 */
public interface Course {
    
    
    public abstract String getcourseName();
    
    public abstract String getcourseNumber();

    public abstract void setcourseName(String courseName);

    public abstract void setcourseNumber(String courseNumber);

    public abstract double getcredits();

    public abstract void setcredits(double credits);
    
    
}
