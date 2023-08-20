package bpv;

public interface Visitor {
	public void visit(Book book);
	public void visit(Electronics electronics);
}
