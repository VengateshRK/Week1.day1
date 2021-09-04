package Week1.day1;

public class MyFibonocci {

	public static void main(String[] args) {
		int firstnum = 0,secnum = 1, sum;
		System.out.println(" "+ firstnum);
		System.out.println(" "+ secnum);
		for (int i=1 ; i<=8; i++) {
				
			sum = firstnum + secnum;
			System.out.println(" "+sum);			
			firstnum=secnum;
			secnum=sum;
					
			
		}

	}

}
