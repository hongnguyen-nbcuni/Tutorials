package com.example.java;

import com.example.java.model4.*;
import com.example.java.model4.Ligurian;

import java.util.ArrayList;
import java.util.List;

public class Main12_01 {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        OlivePress12_01 press = new OlivePress12_01();
        int totalOil = press.getOil(olives);

        System.out.println("You got " + totalOil + " units of oil");

    }

}
