package com.confiz.command.pattern;

import com.confiz.command.pattern.commands.TurnOffLight;
import com.confiz.command.pattern.commands.TurnOnLight;

public class Driver {

	public static void main(String... args) {
		System.out.println("<====================>");
		System.out.println("   Command Pattern");
		System.out.println("<====================>");
		
		Light light = new Light();
		RemoteControl invoker = new RemoteControl(); 
		invoker.pressOn(new TurnOnLight(light));
		invoker.pressOff(new TurnOffLight(light));
		invoker.pressUndo();
		
		System.out.println();
		System.out.println("<=========================================================>");
	}
}
