package com.system;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;


public class AppTest {

   
    @Test
    public void testEligibleStatus() {
        int totalCredits = 18;
        boolean isEligible = (totalCredits >= 15);
        assertTrue("Student with 15+ credits should be eligible", isEligible);
    }

   
    @Test
    public void testNotEligibleStatus() {
        int totalCredits = 12;
        boolean isEligible = (totalCredits >= 15);
        assertFalse("Student with less than 15 credits should not be eligible", isEligible);
    }

    
    @Test
    public void testBoundaryCondition() {
        int totalCredits = 15;
        boolean isEligible = (totalCredits >= 15);
        assertTrue("Student with exactly 15 credits should be eligible", isEligible);
    }
}

