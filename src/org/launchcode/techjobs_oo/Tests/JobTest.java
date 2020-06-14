package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

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


@Test
    public void testJobConstructorSetsAllFields(){
     Job testJobThree = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
     Employer ACME = testJobThree.getEmployer();
     Location Desert = testJobThree.getLocation();
     PositionType qualityControl = testJobThree.getPositionType();
     CoreCompetency persistence = testJobThree.getCoreCompetency();

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
    public void  doesThisNewMethodWork(){

    Job testJobSix = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    assertTrue( testJobSix.toString() != " ");
    System.out.println("Why is this harder than it should be?");
}

}
