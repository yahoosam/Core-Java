package com.demo.trywithresource;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TrywithResourceBufferedDemo {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("file1.txt");
				FileWriter fw = new FileWriter("file1_copy.txt");
				BufferedReader br = new BufferedReader(fr);
				BufferedWriter bw = new BufferedWriter(fw);) {

			long start = System.currentTimeMillis();

			System.out.println("file copy using FileReader/FileWriter in progress...");

			String data = null;
			while ((data = br.readLine()) != null) {
				bw.write(data);
				bw.newLine();
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
