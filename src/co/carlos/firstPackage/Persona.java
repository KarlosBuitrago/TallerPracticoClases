package co.carlos.firstPackage;

import java.util.*;

public class Persona {

    public String name;
    public String lastName1;
    public String lastname2;
    public Date dateBirth;
    public float heigth;

    public Persona() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public float getHeigth() {
        return heigth;
    }

    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }
}

class Fruta{
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    public Fruta() {
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(String name) {
        colors.add(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }
}

class CuentaBancaria{
    private int AccountNumber;
    protected boolean activated;

    public CuentaBancaria() {
    }

    public void setActivated(boolean activated){
        this.activated = activated;
    }

    public boolean getActivated(){
        return activated;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

}

class Plane {
    private String name;
    private String color;
    private int numberPassanger;
    private int numberTires;
    private int numberDoors;

    public Plane() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberPassanger() {
        return numberPassanger;
    }

    public void setNumberPassanger(int numberPassanger) {
        this.numberPassanger = numberPassanger;
    }

    public int getNumberTires() {
        return numberTires;
    }

    public void setNumberTires(int numberTires) {
        this.numberTires = numberTires;
    }

    public int getNumberDoors() {
        return numberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }
}

class Television{

    public int ScreenSize;
    private String color;
    private String Mark;
    private int weight;

    public Television() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMark() {
        return Mark;
    }

    public void setMark(String mark) {
        Mark = mark;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

class phoneMobile {
    private String Mark;
    private String color;
    private String Model;
    private double ScreenSize;

    public phoneMobile() {
        this.Mark = "Samsung";
        this.color = "Blue";
        this.Model = "A10";
        this.ScreenSize = 6.5;
    }

    public String getMark() {
        return Mark;
    }

    public void setMark(String mark) {
        Mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public double getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(double screenSize) {
        ScreenSize = screenSize;
    }
}
