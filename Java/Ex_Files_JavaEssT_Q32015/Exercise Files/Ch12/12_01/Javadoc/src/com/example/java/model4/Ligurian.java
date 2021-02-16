package com.example.java.model4;

public class Ligurian extends Olive {

    public Ligurian() {
        super(OliveName.LIGURIAN, OliveColor.BLACK, 5);
    }

    @Override
    public String getOrigin() {
        return "Italy";
    }
}
