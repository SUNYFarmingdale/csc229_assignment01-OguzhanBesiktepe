
package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */


public class NewClass {
    public static void main(String[] args) {
        // Instantiate Course Class
        Course course = new Course();

        // Set values using setter methods
        course.setName("Computer Science");
        course.setID("CS101");
        course.setCode("CSC229");

        // Print values listed in the getter methods of Course.Java
        System.out.println("Name: " + course.getName());
        System.out.println("ID: " + course.getID());
        System.out.println("Code: " + course.getCode());
    }
}