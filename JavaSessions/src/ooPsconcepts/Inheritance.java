package ooPsconcepts;
class Add{
	int a = 45;
	int b=5;
	void add1() {
		System.out.println(a+b);
	}
}
class Sub extends Add{
	void sub1() {
		System.out.println(a-b);
	}
	
}
class Multiplication extends Sub{
	void multi1() {
		System.out.println(a*b);
	}
	
}
class Division extends Multiplication{
	void divide() {
		System.out.println(a/b);
	}
}
public class Inheritance {
	
	
	

	public static void main(String[] args) {
	//Multiplication XX = new Multiplication();
	Division divide1 = new Division();
	divide1.multi1();
	divide1.add1();
	divide1.sub1();
	divide1.divide();
	
	

	}

}
