package cpb;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example example = new Example.Builder()
				.foo("FOO")
				.bar("BAR")
				.build();
		
		System.out.println(example);
		System.out.println(example.getFoo());
		System.out.println(example.getBar());
		
		Example example2 = new Example.Builder()
				.foo("foo")
				.bar("bar")
				.build();
		
		System.out.println(example2);
		System.out.println(example2.getFoo());
		System.out.println(example2.getBar());
	}

}
