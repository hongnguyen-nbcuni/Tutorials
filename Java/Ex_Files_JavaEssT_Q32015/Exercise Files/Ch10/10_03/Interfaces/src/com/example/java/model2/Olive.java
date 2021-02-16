package com.example.java.model2;

import com.example.java.model2.OliveColor;
import com.example.java.model2.OliveName;

public class Olive {

    private OliveName name;
    private OliveColor color;
    private int oil;

    public Olive(OliveName kalamata, OliveColor purple, int oil) {
        this.name = kalamata;
        this.color = purple;
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
