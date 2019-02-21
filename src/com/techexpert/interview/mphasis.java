package com.techexpert.interview;

public class mphasis {
	
	
	// Program to count vowels, consonants, digits and spaces
	
	public static void getvowelsCount(String line)
	{
		//String line = "This website is aw3som3.";
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;

        line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i)
        {
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
            }
            else if( ch >= '0' && ch <= '9')
            {
                ++digits;
            }
            else if (ch ==' ')
            {
                ++spaces;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("White spaces: " + spaces);
    }
	
	public static String removeVowels(String vowels) {
		
		String result=vowels.replaceAll("[aeiou 1-2]", "");
		
		return result;
	}
	
	
	public static void getVowels() {
		
		String str ="This is a test";
        for(int i=0;i <str.length();i++){
            if((str.charAt(i) == 'a') || 
                (str.charAt(i) == 'e')  ||
                (str.charAt(i) == 'i') || 
                (str.charAt(i) == 'o') ||
                (str.charAt(i) == 'u')) {
                System.out.println(" The String contains " + str.charAt(i));
            }
        }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(removeVowels("mohamed saud 227"));
		
//		getvowelsCount("mohamedsau  d");
//		getVowels();

	}

}
