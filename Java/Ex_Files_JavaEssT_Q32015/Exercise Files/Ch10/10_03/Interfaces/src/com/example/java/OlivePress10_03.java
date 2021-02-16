package com.example.java;

import java.util.List;

import com.example.java.model2.Olive;

public class OlivePress10_03{

	public int getOil(List<Olive> olives) {

		int totalOil = 0;
		for (Olive o : olives) {
			totalOil += o.crush();
		}

		return totalOil;

	}

}
