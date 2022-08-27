package test;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 19;
		
		switch(age) {
		
		case 18:
		case 19:
			System.out.println("Eligible");
			break;
		
		case 17:
			System.out.println("Will be eligible by next year");
			break;
			
		case 15:
			System.out.println("Ineligible");
			break;
			
		default:
			System.out.println("Default");
		
		}

	}

}