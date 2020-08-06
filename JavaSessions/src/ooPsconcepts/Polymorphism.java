package ooPsconcepts;
//same method name but differentiating the arguments inside method is called method overloading
public class Polymorphism {
	public void info() {
		System.out.println("Date");
	}
	public void info(int a) {
		System.out.println(a);
	}
	public void info(int x,int y) {
		System.out.println(x);
		System.out.println(y);
	}
	public void info(int b,int c,String name) {
		System.out.println(b);
		System.out.println(c);
		System.out.println(name);
	}

	public static void main(String[] args) {
	Polymorphism poly = new Polymorphism();
	poly.info();
	poly.info(5);
	poly.info(4, 8);
	poly.info(10, 100, "Asha");

	}

}
