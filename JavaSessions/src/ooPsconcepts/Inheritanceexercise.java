package ooPsconcepts;

class subjectmarks{
	int physics = 70;
	int chemistry = 80;
}
class total extends subjectmarks{
	int totmarks() {
		int tot = physics + chemistry;
		return tot;
	}
	
	
	
}

public class Inheritanceexercise {
	
	

	public static void main(String[] args) {
	total submarks = new total();
	int finalmarks = submarks.totmarks();
	System.out.println(finalmarks);
	}

}
