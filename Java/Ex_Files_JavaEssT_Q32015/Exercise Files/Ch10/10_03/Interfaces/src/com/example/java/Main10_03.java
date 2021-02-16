package com.example.java;

import com.example.java.model2.*;

import java.util.ArrayList;
import java.util.List;

public class Main10_03 {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        OlivePress10_03 press = new OlivePress10_03();

        int totalOil = press.getOil(olives);
        
        System.out.println("You got " + totalOil + " units of oil");

    }

}
