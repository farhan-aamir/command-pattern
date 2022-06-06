package com.confiz.command.pattern.commands;

import com.confiz.command.pattern.Light;

public class TurnOffLight implements ICommand {

	Light light;

	public TurnOffLight(Light light) {
		this.light = light;
	}

	@Override
	public void execute(){
		light.turnOff();

	}

	@Override
	public void undo() {
		light.turnOn();
	}
}
