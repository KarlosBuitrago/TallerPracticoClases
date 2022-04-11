package co.carlos.firstPackage;

import java.util.*;

/**
 * Clase persona con los atributos
 * name
 * lastName1
 * lastName2
 * dateBirth
 * heigth
 */
public class Persona {

    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float heigth;

    public Persona() {
    }

    /**
     * metodo que retorna el nombre
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Este metodo asigna el name a la variable name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * metodo que retorna el lastName1
     * @return
     */
    public String getLastName1() {
        return lastName1;
    }
    /**
     * Este metodo asigna el name a la variable name
     * @param lastName1
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }
    /**
     * metodo que retorna el lastName2
     * @return
     */
    public String getLastName2() {
        return lastName2;
    }
    /**
     * Este metodo asigna el name a la variable name
     * @param lastName2
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    /**
     * Este metodo retorna la fecha de cumpleaños
     * @return
     */
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
     * Asigna la fecha de Cumpleaños a la variable dateBirth
     * @param dateBirth
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     * retorna la variable heigth
     * @return
     */
    public float getHeigth() {
        return heigth;
    }

    /**
     * se asigna el valor de heigth a la variable heigth
     * @param heigth
     */
    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }
}

/**
 * Clase clase fruta con los atributos
 * name
 * averageWeight
 * colors
 */
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

/**
 * Clase cuenta bancaria con los atributos
 * accountNumber
 * activated
 */
class CuentaBancaria{
    private int accountNumber;
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
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

}

/**
 * Clase avion con los atributos
 * name
 * color
 * numberPassenger
 * numberTires;
 * numberDoors
 * numberWindows;
 */
class Plane {
    private String name;
    private String color;
    private int numberPassanger;
    private int numberTires;
    private int numberDoors;
    public int numberWindows;

    public Plane() {
        this.numberWindows = 150;
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

/**
 * Esta es una clase Television con los atributos
 * ScreeSize
 * color
 * mark
 * weight
 */
class Television{

    public int ScreenSize;
    private String color;
    private String mark;
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
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

/**
 * Clase Phote Mobile con los atributos
 * mark
 * color
 * model
 * ScreenSize
 */
class phoneMobile {
    private String mark;
    private String color;
    private String Model;
    private double ScreenSize;

    public phoneMobile() {
        this.mark = "Samsung";
        this.color = "Blue";
        this.Model = "A10";
        this.ScreenSize = 6.5;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
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
