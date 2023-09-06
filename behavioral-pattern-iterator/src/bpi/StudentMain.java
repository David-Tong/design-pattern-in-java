package bpi;

public class StudentMain {

	public static void main(String[] args) {
		Classroom<Student> classroom = new Classroom<Student>();
		classroom.add(new Student("Alice", 20));
		classroom.add(new Student("Bob", 21));
		classroom.add(new Student("Charlie", 22));
		
		Iterator<Student> iter = classroom.createIterator();
		while(iter.hasNext()) {
			Student student = iter.next();
			System.out.println(student);
		}
	}

}
