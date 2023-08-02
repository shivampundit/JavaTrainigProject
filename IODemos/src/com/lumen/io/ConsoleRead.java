package com.lumen.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleRead {

	public static void main(String[] args) {
		// create an objects for converting bytes into characters
		InputStreamReader reader = new InputStreamReader(System.in);
		
		//create an object for BufferedReader
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		char value;
		try {
			value = (char) bufferedReader.read();
			System.out.print(value);
			while (value != 'q') {
				value = (char) bufferedReader.read();
				System.out.print(value);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
