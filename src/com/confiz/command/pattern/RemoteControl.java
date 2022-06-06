package com.confiz.command.pattern;

import com.confiz.command.pattern.commands.ICommand;

public class RemoteControl {
	ICommand turnOnLight;
	ICommand turnOffLight;
	ICommand undoCommand;

	public void pressOn(ICommand turnOnCommand) {
		this.turnOnLight = turnOnCommand;
		turnOnLight.execute();
		undoCommand = turnOnCommand;
	}

	public void pressOff(ICommand turnOnCommand) {
		this.turnOnLight = turnOnCommand;
		turnOnLight.execute();
		undoCommand = turnOnCommand;
	}

	public void pressUndo() {
		undoCommand.undo();
	}
}
