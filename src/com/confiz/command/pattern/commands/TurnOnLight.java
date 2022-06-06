package com.confiz.command.pattern.commands;

import com.confiz.command.pattern.Light;

public class TurnOnLight implements ICommand{

	Light light;
	
	public TurnOnLight(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.turnOn();
	}

	@Override
	public void undo() {
		light.turnOff();
	}
}
