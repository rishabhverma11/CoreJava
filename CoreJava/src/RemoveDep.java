import java.util.Scanner;

public class RemoveDep {
	public static int[] remove(int[] input) {
		int i =1 ;
		int j =0;
		int[] output;
		if(input.length <2) {
			return input;
		}
		while(i < input.length) {
			if(input[i] == input[j]) {
				i++;
			} else {
				++j;
				input[j] = input[i];
				i++;
			}
		}
			output = new int[j+1];
			for(int x =0 ; x<output.length;x++) {
				output[x]=input[x];
			}
		
			return output;				
		}
		
		

	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a = sc.nextInt();
		int arr[]= new int[a];
		System.out.println("Enter element");
		for(int i =0 ; i<arr.length ;i++) {
			arr[i]=sc.nextInt();	
		}
		 int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	                 System.out.println("Sorted array"+ arr[i]);
	         }  
			
			
					
					
				
				
			
		
		 int output[] =remove(arr);
		 
		 for(int i =0 ; i<output.length;i++) {
			System.out.println(arr[i]);
		}
//		for (int i:output) {
//			System.out.print(i+" ");
//		}
		
		
		
	}
	

}
