package com.himalaya;

public class Solution {

	public static void generateNumeralFromRoman(String romanNumber){

		for(int i=0; i<romanNumber.length(); i++) {
			System.out.println(romanNumber.charAt(i));
		}
	}

	public static void main(String[] args) {
		generateNumeralFromRoman("himalay go-swami");
	}
}
