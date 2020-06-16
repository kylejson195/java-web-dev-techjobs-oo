package org.launchcode.techjobs_oo;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job(){
        id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id &&
                name.equals(job.name) &&
                employer.equals(job.employer) &&
                location.equals(job.location) &&
                positionType.equals(job.positionType) &&
                coreCompetency.equals(job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
@Override
    public String toString() {
    if (getName().equals("") && employer.getValue() == null && location.getValue() == null && location.getValue() == null && positionType.getValue() == null && coreCompetency.getValue() == null){
        String errorMessage = "OOPS! This job does not seem to exist";
        return errorMessage;
    }
    if (getName() == null || getName().equals("")){
        setName("Data Not Available");}
    if (employer.getValue() == null || employer.getValue() == ""){
        employer.setValue("Data Not Available");
    }
    if (location.getValue() == null || location.getValue() == ""){
        location.setValue("Data Not Available");
    }
    if (positionType.getValue() == null || positionType.getValue() == ""){
        positionType.setValue("Data Not Available");
    }
    if (coreCompetency.getValue() == null || coreCompetency.getValue() == ""){
        coreCompetency.setValue("Data Not Available");
    }

    String result = "ID: " + getId()
            + "\nName: " + getName()
            + "\nEmployer: " + getEmployer()
            + "\nLocation: " + getLocation()
            + "\nPosition Type: " + getPositionType()
            + "\nCore Competency: " + getCoreCompetency();
        return result;
    }
}

