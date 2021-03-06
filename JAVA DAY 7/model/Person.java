package com.torryharris.model;

public class Person implements Comparable<Person> {
    private Long aadharNumber;
    private String name,state,occupation;

    public Person(Long aadharNumber, String name, String state, String occupation) {
        this.aadharNumber = aadharNumber;
        this.name = name;
        this.state = state;
        this.occupation = occupation;
    }

    @Override
    public int compareTo(Person o) {
        return this.state.compareTo(o.state); //return this.name.compareTo(o.name); //return this.aadharNumber.compareTo(o.aadharNumber);
    }

    public Long getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(Long aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return  "Person ====>  " +
                "aadharNumber = " + aadharNumber +
                ", name = " + name  +
                ", state = " + state +
                ", occupation = " + occupation +
                "";
    }
}
