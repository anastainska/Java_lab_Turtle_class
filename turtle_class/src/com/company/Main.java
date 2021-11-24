package com.company;

public class Main {

    public static void main(String[] args) {

        Turtle object1 = new Turtle("scientificName", "5khm", 19, "Yellow", "Anastassia", 20, "5khm", "Sea turtle", true, true);

        Turtle object2 = new Turtle();

        object2.scientificName = "Nemo";
        object2.maritalStatus = true;
        object2.speed = "11kmh";

        Turtle object3 = new Turtle();

        object3.scientificName = "Ninja";
        object3.maritalStatus = false;
        object3.speed = "14kmh";

        Turtle object4 = new Turtle();

        object4.scientificName = "Rafael";
        object4.maritalStatus = true;
        object4.speed = "21kmh";

        Turtle object5 = new Turtle();

        object5.scientificName = "Michael";
        object5.maritalStatus = false;
        object5.speed = "9kmh";

        Turtle object6 = new Turtle();

        object6.scientificName = "Oleg";
        object6.maritalStatus = false;
        object6.speed = "14kmh";

        Turtle object7 = new Turtle("dflgkd", "skjfbk",83,"skjdb");

        Turtle object8 = new Turtle();

        System.out.println("Scientific name of first turtle: " + object1.getScientificName());
        System.out.println("Speed1 of second turtle: " + object2.getSpeed());
        object2.setSpeed("100khm");
        System.out.println("Speed2 of second turtle: " + object2.getSpeed());
        object2.setScientificName("Yellow-bellied");
        object3.setWeight(57);
        System.out.println("Weight of third turtle: " + object3.getWeight());
        object3.setColor("Yellow");
        System.out.println("Color of firth turtle: " + object4.getColor());
        object1.setName("Little baby");
        System.out.println("Name of first turtle" + object1.getName());
        object1.setAge(153);
        System.out.println("Age of first turtle: " + object6.getAge());
        object1.setBirthCountry("Japan");
        System.out.println("Birth country of first turtle: " + object1.getBirthCountry());
        object6.setSubgroup("Sea turtle");
        System.out.println("Subgroup of first turtle: " + object1.getSubgroup());
        object6.setAlive(false);
        System.out.println("Is sixth turtle alive: " + object6.isAlive());
        object7.setMaritalStatus(true);
        System.out.println("Is seventh turtle have a couple: " + object7.isMaritalStatus());
        object1.printStaticField();
        object1.resetValues("Big-foot turtle", "743khm", 19, "green", "Naruto", 19, "Ukraine", "Sea turtle", true, true);
    }
}

