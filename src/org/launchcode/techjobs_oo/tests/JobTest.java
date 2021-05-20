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

}
