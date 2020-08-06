package ooPsconcepts;

public class Class2 extends Class1 {
	int b=5;
	int c=a+b;
	

	public static void main(String[] args) {
	Class2 object2 = new Class2();
	System.out.println(object2.c);
	int obj= object2.class1method(5, 6);
    System.out.println(obj);
	}

}
