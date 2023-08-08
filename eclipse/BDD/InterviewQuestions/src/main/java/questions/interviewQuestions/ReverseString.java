package interviewQuestions;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
//To print out the reverse string 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your word");
		String word = scan.nextLine();

		char[] myArray = word.toCharArray();
        
		String reverseWord = "";
		for (int i = word.length()-1; i >= 0; i--) {
             reverseWord=reverseWord+myArray[i];
		}
          System.out.println(reverseWord);
	}
	
	 
}
