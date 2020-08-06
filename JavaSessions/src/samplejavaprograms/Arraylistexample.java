package samplejavaprograms;

import java.util.ArrayList;

public class Arraylistexample {

	public static void main(String[] args) {
	ArrayList arr = new ArrayList();
	arr.add(100);
	arr.add("ASha");
	arr.add(1000);
	arr.add("Dhiya");
	for(Object obb:arr) {
		System.out.println(obb);
	}

	}

}
