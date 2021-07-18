package com.demo.bytestreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedByteStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			long start = System.currentTimeMillis();

			fis = new FileInputStream("pic1.jpg");
			fos = new FileOutputStream("pic1_copy.jpg");

			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			System.out.println("file copy using FileInputStream/FileOutputStream(Buffered) in progress...");

			int data = 0;
			while ((data = bis.read()) != -1) {
				bos.write(data);
			}

			System.out.println("file copy successful...");

			long end = System.currentTimeMillis();
			System.out.println(
					"Total time taken: " + ((end - start) / 1000) + " seconds [or] " + (end - start) + " milliseconds");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// no need to close fileiostream - bufferiostream will takecare of it
				bis.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
