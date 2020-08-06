package ooPsconcepts;

abstract class dog {
	String breed;
	public void bark() {
		System.out.println("barking");
	}
	public abstract void check();
}
class cat extends dog{
	public void check() {
		System.out.println("meow");
	}
}


public class Abstraction {

	public static void main(String[] args) {
	cat sounds = new cat();
	sounds.bark();
	sounds.check();
	

	}

}
