package Week1.day1;

public class MyNegativeToPositive {

	public static void main(String[] args) {
		int i= -40;
		
		if (i < 0) {
			System.out.println("negative value or original value = " +i);
			i = (-i);
			System.out.println("converted value = " + i );
		}
		else {
			System.out.println("Positive value");
		}
	}

}
