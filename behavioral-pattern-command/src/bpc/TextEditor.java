package bpc;

public class TextEditor {

	public static void main(String[] args) {
		StringBuilder textEditor = new StringBuilder();
		CommandInvoker invoker = new CommandInvoker();
		
		invoker.execute(new InsertTextCommand("Hello, ", textEditor, 0));
		invoker.execute(new InsertTextCommand("world!", textEditor, 7));
		invoker.execute(new DeleteTextCommand(textEditor, 5 , 2));
		
		System.out.println("Current text : " + textEditor.toString());
		
		invoker.undo();
		System.out.println("After undo : " + textEditor.toString());
		
		invoker.undo();
		System.out.println("After undo : " + textEditor.toString());
		
		invoker.redo();
		System.out.println("After redo : " + textEditor.toString());
	}

}
