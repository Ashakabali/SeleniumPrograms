package samplejavaprograms;

public class sampleexercise1 {
public int addition(int a,int b) {
	int add = a+b;
	return add;

}

public int subtraction(int x,int y) {
	int sub = x-y;
	return sub;
	
}

public static int multiplication(int m,int n) {
	int mutiply=m*n;
	return mutiply;
}

public int division(int r,int s) {
	int divide=r/s;
	return divide;
}

	public static void main(String[] args) {
		//addition 
	sampleexercise1 sampleobject = new sampleexercise1();
	int sum = sampleobject.addition(6, 10);
	System.out.println(sum);
	//another addition using same method 
	int addition =sampleobject.addition(5, 9);
	System.out.println(addition);
	//subtraction
	int subresult = sampleobject.subtraction(7, 3);
	System.out.println(subresult);
	//mutiplication using static
	int multiple= multiplication(5,10);
	System.out.println(multiple);
	//creating another object
	sampleexercise1 sampleobject1 = new sampleexercise1();
	int divide1 = sampleobject1.division(70, 10);
	System.out.println(divide1);
	

	}

}
