import java.util.*;
class alphanumeric
{
	public static void main(String[] args)
	{
		String string = "smuneera253@123";
		
		
		//String str = string.toLowerCase();
		
		char[] array = string.toCharArray();
		
		System.out.println(array);
		
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String special = "!@#$%^&*";
		
		//we take the three count
		int alphaCount = 0;
		int numbersCount = 0;
		int specialCount = 0;
		//and check the character in for loop
		
		for(int i = 0; i < string.length(); i++)
		{
			if(CharacterChecking(string.charAt(i), alpha)) {
				alphaCount += 1;
			}else if(CharacterChecking(string.charAt(i), numbers)) {
				numbersCount += 1;
			}else {
				specialCount += 1;
			}

		}
		//after count we have to print
		System.out.println(alphaCount+" "+numbersCount+" "+specialCount);
		if(alphaCount > 0 && numbersCount > 0 && specialCount > 0)//the will be >0all three character  the print the alpha numeruc.
		{
			System.out.println("String contains alphanumeric characters");
		}
		else
		{
			System.out.println("String not contains alphanumeric characters");
		}	
		
	}
	//this is for running  loop on alpha and numbercheck if the characterof the string is present or not.
	public static boolean CharacterChecking(char Character, String str){
		for(int i = 0; i < str.length(); i++){
		
			if(str.charAt(i) == Character){ //check the str.charAt(i)==character (string)  same or not.after if condition.
				return true;
			}
		}
		return false;
	}
}
