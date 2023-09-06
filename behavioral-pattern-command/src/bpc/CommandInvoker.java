package bpc;

import java.util.Stack;

public class CommandInvoker {
	
	Stack<Command> commandStack = new Stack<Command>();
	Stack<Command> undoStack = new Stack<Command>();
	
	public void execute(Command command) {
		command.execute();
		commandStack.add(command);
	}
	
	public void undo() {
		Command command = commandStack.pop();
		command.undo();
		undoStack.add(command);
	}
	
	public void redo() {
		Command command = undoStack.pop();
		command.execute();
		commandStack.add(command);
	}

}
