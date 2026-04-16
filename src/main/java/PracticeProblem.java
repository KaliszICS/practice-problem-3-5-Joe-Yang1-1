/**
	* Lesson: 3.5
	* Author: Joe Yang
	* Date Created: March 23, 2023
	* Date Last Modified: March 26, 2026
	*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String getFirstName(String firstName){
		firstName = firstName.trim();
		int space = firstName.indexOf(" ");
		return firstName.substring(0, space);
		}


	public static String getLastName(String lastName){
		lastName = lastName.trim();
		int space = lastName.lastIndexOf(" ");
		return lastName.substring(space + 1);
	}

	public static boolean isValidName(String name){
		int space = name.indexOf(" ");
		int anotherSpace = name.lastIndexOf(" ");

	
		if (space == -1 || space != anotherSpace){return false;}

		String beforeSpace = name.substring(0, space);
		String afterSpace = name.substring(space + 1);
		
		if (beforeSpace.length() < 2 || afterSpace.length()<2){
			return false;
		}
		return true;

	
			
}
}


