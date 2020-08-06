package samplejavaprograms;

public class Class1 {

public int addition(int x,int y,int z) {
	
	int add=x+y+z;
	return add;
}

	public static void main(String[] args) {
	Class1 sum= new Class1();
	int sumup = sum.addition(10, 20, 30);
	System.out.println(sumup);

	}

}
