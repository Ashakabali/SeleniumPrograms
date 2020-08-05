package testNGFramework;

import org.testng.annotations.Test;

public class Groupingconcepts1 {
	
@Test (groups = "a")
public void F1() {
	System.out.println("F1test");
}

@Test (groups = "b")
public void F2( ) {
	System.out.println("F2test");
}

@Test (groups ="c")
public void F3() {
	System.out.println("F3test");
}

@Test (groups = "d")
public void F4() {
	System.out.println("F4test");
}
}
