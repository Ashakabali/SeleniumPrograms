package samplejavaprograms;

public class ConstructorExample {
int a;
public int ConstructorExample1(int a){
	System.out.println("this is not constructor");
	return a;
}
public void name() {
	System.out.println("My name is Asha");
}
ConstructorExample(){
	a=100;
	
}

	public static void main(String[] args) {
	ConstructorExample addition = new ConstructorExample();
	System.out.println(addition.a);
	addition.name();
	int x = addition.ConstructorExample1(70);
	System.out.println(x);
	}

}
