package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[]strings = {"a", "b", "c", "d", "e"};
		printRandomOrder(strings);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void printStrings(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void printStringsReverse(String[] strings) {
		for (int i = strings.length-1; i >= 0; i--) {
			System.out.println(strings[i]);
		}
		
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void printEveryOtherString(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			if(i%2==0) {
			System.out.println(strings[i]);
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void printRandomOrder(String[]strings) {
		Random r = new Random();
		ArrayList<String> string= new ArrayList<String>();
		ArrayList<String> string2= new ArrayList<String>();
		for (int i = 0; i < strings.length; i++) {
			string.add(strings[i]);
		}
		
		int num;
		for (int i = 0; i < strings.length; i++) {
		num=r.nextInt(5-i);
		string2.add(string.get(num));
		string.remove(num);
		System.out.println(string2.get(i));
		}
		
		
	}
	
	
}
