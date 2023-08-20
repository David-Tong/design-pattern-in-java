package cpb;

public class Example {
	
	private String foo;
	private String bar;
	
	private Example() {
		
	}
	
	String getFoo() {
		return foo;
	}
	
	void setFoo(String foo) {
		this.foo = foo;
	}
	
	String getBar() {
		return bar;
	}
	
	void setBar(String bar) {
		this.bar = bar;
	}
	
	public static class Builder {
		private Example example;
		
		public Builder() {
			example = new Example();
		}
		
		public Builder foo(String foo) {
			example.setFoo(foo);
			return this;
		}
		
		public Builder bar(String bar) {
			example.setBar(bar);
			return this;
		}
		
		public Example build() {
			return example;
		}
	}	
}
