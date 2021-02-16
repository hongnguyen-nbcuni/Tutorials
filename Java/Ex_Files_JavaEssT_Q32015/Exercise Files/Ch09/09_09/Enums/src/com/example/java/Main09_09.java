package com.example.java;

import java.util.ArrayList;
import java.util.List;

import com.example.java.model.Olive09_09;

public class Main09_09 {

    public static void main(String[] args) {

        List<Olive09_09> olives = new ArrayList<>();
        olives.add(new Olive09_09(Olive09_09.KALAMATA, 0x2E0854, 3));
        olives.add(new Olive09_09(Olive09_09.KALAMATA, 0x2E0854, 3));
        olives.add(new Olive09_09(Olive09_09.LIGURIAN, 0x000000, 2));
        olives.add(new Olive09_09(Olive09_09.LIGURIAN, 0x000000, 2));
        olives.add(new Olive09_09(Olive09_09.LIGURIAN, 0x000000, 2));
        olives.add(new Olive09_09(Olive09_09.LIGURIAN, 0x000000, 2));

        OlivePress09_09 press = new OlivePress09_09();
        int totalOil = press.getOil(olives);
        System.out.println("Total olive oil: " + totalOil);

    }

}
