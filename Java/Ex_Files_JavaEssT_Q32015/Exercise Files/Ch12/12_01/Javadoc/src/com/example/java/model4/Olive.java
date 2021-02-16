package com.example.java.model4;

import com.example.java.model4.OliveColor;
import com.example.java.model3.OliveName;

public abstract class Olive {

    private OliveName name;
    private OliveColor color;
    private int oil;

    public Olive(OliveName name, OliveColor color, int oil) {
        this.name = name;
        this.color = color;
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
        String msg = name + ", from " + getOrigin() +
                ": " + oil + " units";
        System.out.println(msg);
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public abstract String getOrigin();

    @Override
    public String toString() {
        return name.toString();
    }

}
