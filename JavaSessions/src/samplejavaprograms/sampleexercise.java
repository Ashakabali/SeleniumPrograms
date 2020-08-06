package samplejavaprograms;

public class sampleexercise {
public void a() {
	int ab = 60;
	int cd=40;
	int ef=ab+cd;
	System.out.println(ef);
	System.out.println("method output");
}
public int add(int x,int y) {
	int result = x+y;
	return result;
}
public int sub(int a,int b) {
	int output = a-b;
	return output;
}

public static int subtraction(int p,int q,int r) {
	int subresult = p-q-r;
	return subresult;
	
}

public static int mutiple(int m,int y) {
	int mutiplicationoutput = m*y;
	return mutiplicationoutput;
	
}

public int divide(int r,int s) {
	int divisionresult = r/s;
	return divisionresult;
}
	public static void main(String[] args) {
		System.out.println("Today is Friday");
		sampleexercise sample = new sampleexercise();
		sample.a();
		int addition = sample.add(5, 10);
		System.out.println(addition);
		int newaddition = sample.add(4, 30);
		System.out.println(newaddition);
		int sub = sample.sub(10, 3);
		System.out.println(sub);
		int subtract = subtraction(7,3,2);
		System.out.println(subtract);
		int mutiplex = mutiple(6,5);
		System.out.println(mutiplex);
		int dividing = sample.divide(40,8);
		System.out.println(dividing);
		int newdivide = sample.divide(80,8);
		System.out.println(newdivide);
		sampleexercise sample1 = new sampleexercise();
		int instanceaddition = sample1.add(4, 9);
		System.out.println(instanceaddition);
	}

}
