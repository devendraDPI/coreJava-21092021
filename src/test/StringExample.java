package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String FName = "Devendra";
		String LName = "Indapawar";
		
		// Concatenating string
		String FullName = FName + " " + LName;
		
		System.out.println("Full Name is " + FullName);
		
		// Length Of String
		System.out.println("Length of Full Name is " + FullName.length());
		
		//String in UPPER CASE
		System.out.println("My Name in Upper Case " + FullName.toUpperCase());
		
		// Replacing
		String NewName = FullName.replace(" ", ",");
		System.out.println("New Name is " + NewName);

	}

}