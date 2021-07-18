package com.demo.trywithresource;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TrywithResourceCharacterDemo {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("file1.txt"); FileWriter fw = new FileWriter("file1_copy.txt");) {
			long start = System.currentTimeMillis();

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
		}
	}

}
