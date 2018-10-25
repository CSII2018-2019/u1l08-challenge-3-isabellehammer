import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class U1L08 {

	public static void main(String[] args) {
		//given a string, determine if it is a palindrome
		//use the toCharArray method to determine if a word is a palindrome without creating...
		//...a second array
		//hint: think about which elements you will need to compare!
		
		
		System.out.println("Enter a string ");
	      Scanner sc = new Scanner(System.in);
	      String s = sc.nextLine();
	      //this part I had to Google
	      char[] array = s.toCharArray();
	      int arraylength = array.length;
	      char [] original = Arrays.copyOf(array,array.length);

	      //this is the loop we talked about in class
	      for (int i = 0; i < arraylength / 2; i++) {
	         char temp = array[i];
	         array[i] = array[arraylength-i-1];
	         array[arraylength-i-1] = temp;
	      }
	      System.out.println("Original Array"+Arrays.toString(original));
	      System.out.println("Reverse Array"+Arrays.toString(array));

	      if(Arrays.equals(array, original)) {
	         System.out.println("Entered string is a palindrome");
	      } else {
	         System.out.println("Entered string is not a palindrome");
	      }
		}

	}


