package org.launchcode.techjobs_oo.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;


import static org.junit.Assert.assertEquals;

public class JobTest {

    private static Job jobJava;
    private static Job jobJavaScript;
    private static Job jobProductTester;
    private static Job jobPythonProgrammer1;
    private static Job jobPythonProgrammer2;


    @Before
    public void createJobsObjects(){
        jobJava = new Job();
        jobJavaScript = new Job();
        jobProductTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobPythonProgrammer1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobPythonProgrammer2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void  testSettingJobId(){
        createJobsObjects();
        assertNotEquals(jobJava.getId(), jobJavaScript.getId());
        assertTrue(jobJava.getId() != 1 && jobJavaScript.getId() != 1 );
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        createJobsObjects();
        assertNotNull(jobProductTester);
        assertTrue(jobProductTester instanceof Job);
        assertSame("ACME", jobProductTester.getEmployer().getValue());
        assertSame("Desert", jobProductTester.getLocation().getValue());
        assertSame("Quality control", jobProductTester.getPositionType().getValue());
        assertSame("Persistence", jobProductTester.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        assertEquals(false, jobPythonProgrammer1.equals(jobPythonProgrammer2));
    }

    @Test
    public void testJobsToString(){
        Job job = new Job();
        Job jobWithData = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("OOPS! This job does not seem to exist.", job.toString());
        assertEquals("ID:  12\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence",jobWithData.toString());

    }

}
