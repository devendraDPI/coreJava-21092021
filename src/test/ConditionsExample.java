package test;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=50;i++) {
			// if Even else Odd
			if(i%2==0) {
				
				System.out.println("Even" + i);
			}else {
				System.out.println("Odd" + i);
			
			/* // Odd
			if(i%2!=0) {
				
				System.out.println(i);*/
			}
				
		}
		//===========================================================================================
		
		int age = 17; // Eligible for voting
		//age = 17; // Sorry, you will be eligible for voting by next year
		//age = 16; // Sorry you are not eligible for voting
		if(age>=18) {
			System.out.println("Eligible for voting");
		}else if(age == 17) {
			System.out.println("Sorry, you will be eligible for voting by next year");
		}else {
			System.out.println("Sorry you are not eligible for voting");
			
		}

	}

}