package cps;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton.equals(singleton2));
		System.out.println(singleton);
		System.out.println(singleton2);
	}

}
