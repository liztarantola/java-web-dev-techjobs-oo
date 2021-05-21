package org.launchcode.techjobs_oo.tests;

import org.junit.Before;
import org.launchcode.techjobs_oo.*;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class JobTest {

    Job testJob1;
    Job testJob2;

    @Before
    public void createJobObjects() {
        testJob1 = new Job();
        testJob2 = new Job();
    }

    @Test
    public void testSettingJobId() {
        testJob1 = new Job();
        testJob2 = new Job();
        assertFalse(testJob1.equals(testJob2));
        assertTrue((testJob2.getId() - 1) == testJob1.getId());
    }

    @Test
    public void testJobConstructorTestsAllFields() {
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob3.getId() == 0);
        assertTrue(testJob3 instanceof Job);
        assertTrue(testJob3.getName() == "Product tester");

        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getEmployer().getValue() == "ACME");

        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getLocation().getValue() == "Desert");

        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertTrue(testJob3.getPositionType().getValue() == "Quality control");

        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(testJob3.getCoreCompetency().getValue() == "Persistence");

    }

    @Test
    public void testJobsForEquality() {
        Job testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob4.equals(testJob5));
    }

    @Test
    public void toStringTest() {
        Job testJob6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        int lastChar = (testJob6.toString().length() - 1);
        assertEquals(testJob6.toString().charAt(0), '\n');
        assertTrue(testJob6.toString().charAt(lastChar) == '\n');
    }

    @Test
    public void containsLabelForEachField() {
        Job testJob7 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        assertEquals(testJob7.toString().contains("ID: " + testJob7.getId()), true);
//        assertTrue(testJob7.toString().contains("Name: " + testJob7.getName()) ==  true);
        System.out.println(testJob7.toString());

        assertEquals(testJob7.toString(), "\nID: " + testJob7.getId() + "\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPositionType: Quality control\nCore Competency: Persistence\n");
    }

    @Test
    public void emptyField() {
        Job testJob8 = new Job();
        System.out.println(testJob8);
//        assertEquals(testJob8.toString(), "\nID: " + testJob8.getId() + "\nName: null\nEmployer: null\nLocation: null\nPositionType: null\nCore Competency: null\n");
//        assertEquals(testJob8.toString(), "\nID: " + testJob8.getId() + "\nName: Data not available\nEmployer: Data not available\nLocation: Data not available\nPositionType: Data not available\nCore Competency: Data not available\n");
        assertEquals(testJob8.toString(), "OOPS! This job doesn't seem to exist.");
    }

}
