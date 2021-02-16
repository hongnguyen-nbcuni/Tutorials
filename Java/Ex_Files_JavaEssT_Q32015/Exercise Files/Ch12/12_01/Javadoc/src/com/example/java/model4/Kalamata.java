package com.example.java.model4;

import com.example.java.model4.OliveColor;
import com.example.java.model4.OliveName;

public class Kalamata extends Olive {

    public Kalamata() {
        super(OliveName.KALAMATA, OliveColor.PURPLE, 2);
    }

    @Override
    public String getOrigin() {
        return "Greece";
    }
}
