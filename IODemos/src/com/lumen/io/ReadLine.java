package com.lumen.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine {

	public static void main(String[] args) {
		// create an objects for converting bytes into characters
		InputStreamReader reader = new InputStreamReader(System.in);
		
		//create an object for BufferedReader
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		String value;
		try {
			value = bufferedReader.readLine();
			System.out.print(value);
			while (!value.equals("stop")) {
				value = bufferedReader.readLine();
				System.out.print(value);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
