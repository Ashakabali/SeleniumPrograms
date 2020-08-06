package samplejavaprograms;

public class Intarray {

	public static void main(String[] args) {
	int []b = {25,35,45,55,65,75};
	String []s = {"Asha","Dhiya","Thukira"};
	System.out.println(b[0]);
	System.out.println(b.length);
	for(int v:b) {
		System.out.println(v);
	}
	System.out.println(s[2]);
	System.out.println(s.length);
	for(String name:s) {
		System.out.println(name);
	}

	}

}
