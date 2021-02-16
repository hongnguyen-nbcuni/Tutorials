package com.example.java.model3;

public class Olive {

    private OliveName name;
    private OliveColor color;
    private int oil;

    public Olive(OliveName ligurian, OliveColor black, int oil) {
        this.name = ligurian;
        this.color = black;
        this.oil = oil;
    }

    public OliveName getName() {
        return name;
    }

    public void setName(OliveName name) {
        this.name = name;
    }

    public OliveColor getColor() {
        return color;
    }

    public void setColor(OliveColor color) {
        this.color = color;
    }

    public int crush() {
        System.out.println(name + ": " + oil + " units");
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    @Override
    public String toString() {
        return name.toString();
    }

}
