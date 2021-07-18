package com.demo.characterstreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedCharacterStreamDemo {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;

		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			long start = System.currentTimeMillis();

			fr = new FileReader("file1.txt");
			fw = new FileWriter("file1_copy.txt");

			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);

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
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
