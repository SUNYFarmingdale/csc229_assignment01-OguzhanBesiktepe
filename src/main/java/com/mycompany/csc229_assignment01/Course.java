/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).


 */

package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */

// Data Members listed below from lines 39-41
public class Course {
    // Data members from lines 39 - 41
    private String name;
    private String ID;
    private String code;

    // Default constructors from lines 44 - 47
    public Course() {
        this.name = "";
        this.ID = "";
        this.code = "";
    }

    // Overloaded constructor from lines 51 - 54
    public Course(String name, String ID, String code) {
        this.name = name;
        this.ID = ID;
        this.code = code;
    }

    // Getters and setters (Created Via Right Click)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

