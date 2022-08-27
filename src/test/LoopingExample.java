package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialize
		int i;
		
		int[] array1 = {11,34,55,22,23,76};
		
		String str1 = " Clean India Green India";
		
		String revStr1 = "";
		
		//===========================================================================================
		// Printing 1 to 10
		for(i=1;i<=10;i++) {
		
			System.out.println(i);
			
		}
		
		//===========================================================================================
		// Printing from array
		for (i=0;i<array1.length;i++) {
			
			System.out.println(array1[i]);
		}
		
		//===========================================================================================
		// Reverse array
		for (i=array1.length-1;i>=0;i--) {
			
			System.out.println(array1[i]);
		
		}
		//===========================================================================================
		// For each loop
		for(int values:array1) {
			
			System.out.println(values);
			
		}
		
		//===========================================================================================
		// Printing string
		for(int j=0;j<str1.length();j++) {
			
			System.out.println(str1.charAt(j));
			
		}
		
		//===========================================================================================
		// Reverse String
		for (int k=str1.length()-1;k>=0;k--) {
			
			revStr1 += str1.charAt(k);
		}
		
		System.out.println("Reversed String : " + revStr1);
		
		//===========================================================================================
		// Counting words in string
		String[] words = str1.trim().split(" "); // {"Clean", "India", "Green", "India"}
		
		System.out.println("Total Words are " + words.length);
		
		//===========================================================================================
		// While
		
		int x=1;
		while(x<=10) {
			
			System.out.println(x);
			
			x+=1; //x++;
		}
		
		//===========================================================================================
		
		int n1 = 436721;
		int count=0;
		
		while(n1>0) {
			
			int r = n1%10;
			System.out.println(r);
			count++;
			n1 = n1/10;
		}
		System.out.println("Total digits are : " + count);
		
		//===========================================================================================
		// Do while
		
		int n2=0;
		
		do {
			
			System.out.println(n2);
			n2--;
			
		}while(n2>0); // Exit control loop
		
	}

}