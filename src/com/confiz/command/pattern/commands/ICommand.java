package com.confiz.command.pattern.commands;

public interface ICommand {
	public void execute();

	public void undo();
}
