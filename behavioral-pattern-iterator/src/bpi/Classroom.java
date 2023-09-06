package bpi;

import java.util.ArrayList;
import java.util.List;

public class Classroom<T> implements Aggregate<T> {
	
	private List<T> ts;
	
	public Classroom() {
		ts = new ArrayList<T>();
	}
	
	public void add(T t) {
		ts.add(t);
	}
	
	public int getSize() {
		return ts.size();
	}
	
	public T getAt(int index) {
		return ts.get(index);
	}
	
	@Override
	public Iterator<T> createIterator() {
		return new ClassroomIterator<T>(this);
	}

}
