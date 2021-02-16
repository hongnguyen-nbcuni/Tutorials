package com.example.java;

import com.example.java.model3.*;
import com.example.java.model3.Ligurian;

import java.util.ArrayList;
import java.util.List;

public class Main10_04 {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        OlivePress10_04 press = new OlivePress10_04();
        int totalOil = press.getOil(olives);

        System.out.println("You got " + totalOil + " units of oil");

    }

}
