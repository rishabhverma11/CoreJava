import java.util.Scanner;

public class Sumofno {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int x = sc.nextInt();
		int sum = 0 ; 
		while (x >0) {
			int a = x%10;
			sum =sum +a ;// rev =rev *10 +a
			x =x /10;
			
		}
		System.out.println("Sum :" + sum );
		
	}

}
