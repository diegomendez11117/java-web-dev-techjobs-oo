package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static Integer nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {

        if (this.getId() != null
             && name == null
             && employer == null
             && location == null
             && positionType == null
             && coreCompetency == null
        )
            return "OOPS! This job does not seem to exist.";

            return "ID:  " + ((this.getId() != null) ? this.getId() : "Data not available") + "\n" +
                    "Name: " + ((this.getName() != null) ? this.getName() : "Data not available") + "\n" +
                    "Employer: " + ((this.getEmployer().getValue() != null) ? this.getEmployer().getValue() : "Data not available") + "\n" +
                    "Location: " + ((this.getLocation().getValue() != null) ? this.getLocation().getValue() : "Data not available") + "\n" +
                    "Position Type: " + ((this.getPositionType().getValue() != null) ? this.getPositionType().getValue() : "Data not available") + "\n" +
                    "Core Competency: " + ((this.getCoreCompetency().getValue() != null) ? this.getCoreCompetency().getValue() : "Data not available") + "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job that = (Job) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Integer getId() {
        return id;
    }

    //Getters and Setters

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

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
