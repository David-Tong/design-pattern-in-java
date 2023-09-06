package bpc;

public class DeleteTextCommand implements Command {
	
	private String textToDelete;
	private StringBuilder textEditor;
	private int position;
	
	public DeleteTextCommand(StringBuilder textEditor, int position, int length) {
		this.textToDelete = textEditor.substring(position, position + length);
		this.textEditor = textEditor;
		this.position = position;
	}

	@Override
	public void execute() {
		textEditor.delete(position, position + textToDelete.length()); 
	}

	@Override
	public void undo() {
		textEditor.insert(position, textToDelete);
	}

}
