package com.mycompany.csc229_assignment01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourseTest {

    Course crs;

    public CourseTest() {
        crs = new Course();
    }


    @Test
    public void testSetName() {
        crs.setName("moaath");
        assertEquals("moaath", crs.getName());
    }

    @Test
    public void testSetCode() {
        crs.setCode("CSC229");
        assertEquals("CSC229", crs.getCode());
    }

    @Test
    public void testSetID() {
        crs.setID("12012");
        assertEquals("12012", crs.getID());
    }


    @Test
    public void testConstructorWithParameters() {
        Course cr2 = new Course("Moaath", "12012", "CSC229");
        assertNotNull(cr2);
        assertEquals("Moaath", cr2.getName());
        assertEquals("12012", cr2.getID());
        assertEquals("CSC229", cr2.getCode());
    }
}
