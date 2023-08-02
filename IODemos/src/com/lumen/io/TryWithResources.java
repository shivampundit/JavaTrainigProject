package com.lumen.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		try (FileReader reader = new FileReader("demo.txt"); FileWriter fileWriter = new FileWriter("trial.txt");) {
			int text = reader.read();
			char value = (char) text;
			fileWriter.write(value);
			do {
				text = reader.read();
				value = (char) text;
				fileWriter.write(value);
			} while (text != -1);
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
