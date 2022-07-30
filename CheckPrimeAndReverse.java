package slow;

public class CheckPrimeAndReverse {

	public static void main(String[] args) {
		int num = 16;
		
		boolean isNumPrime = true;
		
		for (int s = 2; s < num; s++) {
			if(num % s == 0) {
				isNumPrime = false;
			}
		}
		
		if (isNumPrime) {
			System.out.println(num + " is Prime");
		}
		else {
			System.out.println(num + " is not prime");
		}
	
		int rev = 0;
		
		while (num != 0)  {  
			int remain = num % 10;  
			rev = remain + rev * 10;  
			num = num /10;  
		}
		
		boolean isRevPrime = true;
		
		for (int s = 2; s < rev; s++) {
			if(rev % s == 0) {
				isRevPrime = false;
			}
		}
		
		if (isRevPrime) {
			System.out.println(rev + " is Prime");
		}
		else {
			System.out.println(rev + " is not prime");
		}

	}

}
