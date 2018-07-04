import java.util.Scanner;

public class Palindrome {
	public static int palindromeNos(int num) {
		int rev = 0;
		int rem ; 
		
		while(num >0){
			rem = num % 10;
			
			rev = rev *10 + rem ;
			num = num /10;
			
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range");
		int a = sc.nextInt();
		int b = sc. nextInt();
		for(int x =a ; x<=b ; x++) {
			if(palindromeNos(x)== x) {
				System.out.println("Palindrome"+x);
			}
		}
	}
}
		
