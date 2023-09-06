package bpc;

public class InsertTextCommand implements Command {
	
	private String textToInsert;
	private StringBuilder textEditor;
	private int position;
	
	public InsertTextCommand(String textToInsert, StringBuilder textEditor, int position) {
		this.textToInsert = textToInsert;
		this.textEditor = textEditor;
		this.position = position;
	}

	@Override
	public void execute() {
		textEditor.insert(position, textToInsert);
	}

	@Override
	public void undo() {
		textEditor.delete(position, position + textToInsert.length());
	}

}
