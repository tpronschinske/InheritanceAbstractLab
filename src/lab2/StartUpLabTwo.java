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
public class StartUpLabTwo {
    
    
       
    public static void main(String[] args) {
        
        Course newClass = new AdvancedJavaCourse();
        
        newClass.setCourseName("Advanced Java");
        newClass.setCourseNumber("#5514");
        newClass.setCredits(3);
        
        System.out.println("Class: " + newClass.getCourseName() + newClass.getCredits());
        
    }
}

