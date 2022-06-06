package com.confiz.command.pattern;

public class Light {
	public void turnOn(){
		System.out.println("Light On!");
	}
	
	public void turnOff(){
		System.out.println("Light Off!");
	}
	
	public void changeColor(String color) {
		System.out.println("Light color changed to " + color);
	}
}
