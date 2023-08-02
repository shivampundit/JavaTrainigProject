package com.lumen.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReadFileWrite {

	public static void main(String[] args) {
		// create an objects for converting bytes into characters
		InputStreamReader reader = new InputStreamReader(System.in);

		// create an object for BufferedReader
		BufferedReader bufferedReader = new BufferedReader(reader);

		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("demo.txt");
			String text = bufferedReader.readLine();
//			System.out.println(text);
			fileWriter.write(text);
			do {
				text = bufferedReader.readLine();
//				System.out.println(text);
				fileWriter.write(text);

			} while (!text.equals("Stop"));

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileWriter != null)
					fileWriter.close();
			} catch (IOException e) {
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}

}
