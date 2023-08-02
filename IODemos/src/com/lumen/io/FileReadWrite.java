package com.lumen.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
	public static void main(String[] args) {
		
	
	FileReader reader = null;
	FileWriter fileWriter = null;

	try
	{
		reader = new FileReader("demo.txt");
		fileWriter = new FileWriter("trial.txt");
		int text = reader.read();
		char value = (char) text;
		fileWriter.write(value);

		do {
			text = reader.read();
			value = (char) text;
			fileWriter.write(value);
		} while (text != -1);
	}

	catch(
	IOException e)
	{
		e.printStackTrace();
	}finally
	{
		try {
			if (fileWriter != null)
				fileWriter.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}}
