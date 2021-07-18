package com.demo.objectstreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamsSerializationDemo {

	public static void main(String[] args) {

		// serialize
		try (FileOutputStream fos = new FileOutputStream("creditcardcustdata.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			CreditCardCust[] ccc = {
					new CreditCardCust("John Kevin", "Apt 1000", "Fountain Blvd", "Mooresville", "NC", 28117, "Visa",
							"5454545454545454", "12/22", 123),
					new CreditCardCust("Mike Madding", "Apt 387", "Lake View", "Charlotte", "NC", 28187, "M/C",
							"4534654345434543", "11/21", 197) };
			oos.writeObject(ccc);
			System.out.println("serialization completed...");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// de-serialize
		try (FileInputStream fis = new FileInputStream("creditcardcustdata.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			CreditCardCust[] ccc = (CreditCardCust[]) ois.readObject();
			System.out.println("de-serialization completed...");
			for (CreditCardCust creditCardCust : ccc) {
				System.out.println(creditCardCust.toString());
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
