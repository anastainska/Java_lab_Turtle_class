package com.company;

public class Turtle {
    public Turtle(String scientificName, String speed, int weight, String color, String name, int age, String birthCountry, String subgroup, boolean isAlive, boolean maritalStatus) {
        this.scientificName = scientificName;
        this.speed = speed;
        this.weight = weight;
        this.subgroup = subgroup;
        this.isAlive = isAlive;
        this.maritalStatus = maritalStatus;
    }

    public Turtle() {};

    public Turtle(String color, String name, int age, String birthCountry) {
        this.color = color;
        this.name = name;
        this.age = age;
        this.birthCountry = birthCountry;
    }

    public String scientificName;
    public String speed;
    public int weight;
    private String color;
    private String name;
    private int age;
    private String birthCountry;
    private String subgroup;
    protected boolean isAlive;
    protected boolean maritalStatus;
    static int turtleCounter;

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getSubgroup() {
        return subgroup;
    }

    public void setSubgroup(String subgroup) {
        this.subgroup = subgroup;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String toString() {
        return "Turtle:" +
                "\n scientificName = " + scientificName +
                "\n speed = " + speed +
                "\n weight = " + weight +
                "\n color = " + color +
                "\n name = " + name +
                "\n age = " + age +
                "\n birthCountry = " + birthCountry +
                "\n subgroup = " + subgroup +
                "\n isAlive = " + isAlive +
                "\n maritalStatus = " + maritalStatus;
    }

    public static void printStaticField() {
        System.out.println("Value of turtle is: " + turtleCounter);
    }

    public void resetValues(String scientificName, String speed, int weight, String color, String name, int age, String birthCountry, String subgroup, boolean isAlive, boolean maritalStatus) {
        this.scientificName = scientificName;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.name = name;
        this.age = age;
        this.birthCountry = birthCountry;
        this.subgroup = subgroup;
        this.isAlive = isAlive;
        this.maritalStatus = maritalStatus;
    }
}