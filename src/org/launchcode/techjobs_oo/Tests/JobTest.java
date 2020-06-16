package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import java.sql.SQLOutput;

import static org.junit.Assert.*;

public class JobTest {

@Test
    public void testSettingJobID(){
    Job testJobOne = new Job();
    Job testJobTwo = new Job();
    assertFalse(testJobOne == testJobTwo);
    assertTrue(testJobOne.getId() < testJobTwo.getId());
    assertTrue(testJobOne.getId() == 1);
}

Job testJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));

@Test
    public void testJobConstructorSetsAllFields(){
    // Job testJobThree = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
     Employer ACME = testJob.getEmployer();
     Location Desert = testJob.getLocation();
     PositionType qualityControl = testJob.getPositionType();
     CoreCompetency persistence = testJob.getCoreCompetency();

     assertTrue(ACME instanceof Employer);
     assertTrue(Desert instanceof Location);
     assertTrue(qualityControl instanceof PositionType);
     assertTrue(persistence instanceof CoreCompetency);

}

@Test
    public void testJobsForEquality(){
    Job testJobFour = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    Job testJobFive = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    assertEquals(testJobFour, testJobFive);
}
@Test
    public void  doesToStringWork(){
    assertTrue( testJob.toString() != " ");

}
@Test
    public void doTheLinesFormat(){
    assertTrue(testJob.toString().contains("\n"));

}
@Test
    public void doesNullReplacementWork(){
    Job testJobSeven = new Job("Product Tester", new Employer(""), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    assertTrue(testJobSeven.toString().contains("Data Not Available"));
    System.out.println(testJobSeven.toString());
}
@Test
    public void oopsTesting(){
    Job testJobEight = new Job ("" , new Employer(), new Location(), new PositionType(), new CoreCompetency());
    assertTrue( testJobEight.toString().contains("OOPS"));

}

}
