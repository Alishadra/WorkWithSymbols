package org.itstep.model;

import java.util.ArrayList;
import java.util.List;

public class Symbols {

	public static void main(String[] args) {
		
		
		String output = "";
		String inputText = " dc1b2a hgf3e4 m5lk6ji i5jk6lm ";
		System.out.println(inputText);

		String[] words = inputText.split(" ");
		
		for(String word:words) {
			
			char[] symbs = word.toCharArray();
			
			List<String> symbList = new ArrayList<>();
			for(char symb : symbs) {
				if(Character.isDigit(symb)) {
					continue;
				} else {
					symbList.add(0, String.valueOf(symb));
				}
			}
			for( int i=0; i< symbs.length; i++) {
				if(Character.isDigit(symbs[i])) {
					symbList.add(i, String.valueOf(symbs[i]));
				} else {
					continue;
				}
			}
			for (String string : symbList) {
				output+=string;
			}
			output+=" ";

			
		}
		
		output.trim();
		
		System.out.println(output);
		
		

	}




}
