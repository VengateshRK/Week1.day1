package Week1.day1;

public class MyPrimeNumber {

	public static void main(String[] args) {
		int number=13, k;
		boolean j = false;
		int i;
		for (i=2;i<13;i++) {
			k=13 % i;
			
			if (k == 0  ) {
				j = true;
				break;
			}
		}
			
			if (j== true) {
				System.out.println("not a prime number");
			}
			else {
				System.out.println(number + " is a prime number");
			}
		

	}

}
