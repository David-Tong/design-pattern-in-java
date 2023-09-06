package bpi;

public class ClassroomIterator<T> implements Iterator<T> {

	private Classroom<T> classroom;
	private int index;
	
	public ClassroomIterator(Classroom<T> classroom) {
		this.classroom = classroom;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		return index < classroom.getSize();
	}

	@Override
	public T next() {
		return classroom.getAt(index++);
	}

}
