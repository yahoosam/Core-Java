package com.demo.bytestreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			long start = System.currentTimeMillis();

			fis = new FileInputStream("pic1.jpg");
			fos = new FileOutputStream("pic1_copy.jpg");

			System.out.println("file copy using FileInputStream/FileOutputStream in progress...");

			int data = 0;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}

			System.out.println("file copy successful...");

			long end = System.currentTimeMillis();
			System.out.println(
					"Total time taken: " + ((end - start) / 1000) + " seconds [or] " + (end - start) + " milliseconds");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
