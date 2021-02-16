package com.example.java;

import com.example.java.model.Olive09_09;

import java.util.List;

public class OlivePress09_09 {

    public int getOil(List<Olive09_09> olives) {

        int totalOil = 0;
        for (Olive09_09 o : olives) {
            System.out.println(o.getName());
            totalOil += o.crush();
        }

        return totalOil;

    }

}
