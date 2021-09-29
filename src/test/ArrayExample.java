package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {11,34,55,22,23,76};
		
		System.out.println(array1[0]);
		
		array1[0] = 50;
		System.out.println(array1[0]);
		
		System.out.println(array1[5]);
		
		System.out.println(array1.length);
		
		System.out.println(array1[array1.length-1]);
		
		for(int i=0; i <= (array1.length-1); i++ ){
     
            System.out.println(array1[i]);
            
        }
		
	}

}