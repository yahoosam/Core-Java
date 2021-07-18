package com.demo.characterstreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;

		try {
			long start = System.currentTimeMillis();

			fr = new FileReader("file1.txt");
			fw = new FileWriter("file1_copy.txt");

			System.out.println("file copy using FileReader/FileWriter in progress...");

			int data = 0;
			while ((data = fr.read()) != -1) {
				fw.write(data);
			}

			System.out.println("file copy successful...");

			long end = System.currentTimeMillis();
			System.out.println(
					"Total time taken: " + ((end - start) / 1000) + " seconds [or] " + (end - start) + " milliseconds");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
