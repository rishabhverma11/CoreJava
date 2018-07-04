import java.util.Scanner;

public class letter {
	public static void lett(String str) {
		String r ="how are you";
		String[] words=r.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(w); 
		}
		String trimstr = str.trim();
		String result = trimstr.replace(" ","");
		System.out.println(result);
		
		char ch[]= result.toCharArray();
		System.out.println(ch.length);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word");
		String s = sc.nextLine();
		lett(s);
		
	}

}
