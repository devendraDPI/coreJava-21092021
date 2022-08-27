package test;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowsExample obj = new ThrowsExample();
		
		obj.calculator();

	}
	
	public void calculator() {
		
		try {
			
			div();
			
		}catch (ArithmeticException e) {
			
			e.printStackTrace();
		}
	}
	
	public void div() throws ArithmeticException {
		
		System.out.println("Inside Div method");
		
	}

}