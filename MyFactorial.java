package Week1.day1;

public class MyFactorial {
 
	public static void main(String[] args) {
		int i  , number=5;
		int fact =1;
		for ( i= 1; i <=number ; i++) {
			 fact  = fact * i;
								
		}
		System.out.println("factorial " + fact);
	}

}
