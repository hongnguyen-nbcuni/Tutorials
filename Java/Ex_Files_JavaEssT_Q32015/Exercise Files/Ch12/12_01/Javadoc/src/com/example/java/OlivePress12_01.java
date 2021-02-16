package com.example.java;

import com.example.java.model4.Olive;

import java.util.List;

public class OlivePress12_01 {

	public int getOil(List<Olive> olives) {

		int totalOil = 0;
		for (Olive o : olives) {
			totalOil += o.crush();
		}

		return totalOil;

	}

}
