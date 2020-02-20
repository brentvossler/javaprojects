package com.fdmgroup.collections;

import java.awt.Color;
import java.util.HashMap;

public class ColorMap {
	// Colors: RED , GREEN , BLUE , MAGENTA , CYAN , YELLOW , 
	// BLACK , WHITE , GRAY , DARK_GRAY, LIGHT_GRAY , ORANGE , and PINK
	
	HashMap<String, Color> map = new HashMap<>();
	
	public ColorMap() {
		map.put("Red", Color.RED);
		map.put("Green", Color.GREEN);
		map.put("Blue", Color.BLUE);
		map.put("Magenta", Color.MAGENTA);
		map.put("Cyan", Color.CYAN);
		map.put("Yellow", Color.YELLOW);
		map.put("Black", Color.BLACK);
		map.put("White", Color.WHITE);
		map.put("Gray", Color.GRAY);
		map.put("Dark_Gray", Color.DARK_GRAY);
		map.put("Light_Gray", Color.LIGHT_GRAY);
		map.put("Orange", Color.ORANGE);
		map.put("Pink", Color.PINK);
	}
	
	public void getAllColors() {
		System.out.println(map);
	}
	
	public void getColorMap(String name) {
		System.out.println(map.get(name));
	}

}
