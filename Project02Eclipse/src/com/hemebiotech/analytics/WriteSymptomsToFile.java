package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;

public class WriteSymptomsToFile implements ISymptomWriter {

	private BufferedWriter fW;

	@Override
	public void writeSymptoms(String fileName) {
		try {
			ISortedSymptoms sS = new SymptomsSorter();
			File f = new File(fileName);
			fW = new BufferedWriter(new FileWriter(f));

			for (Entry<String, Integer> entry : sS.sortSymptoms().entrySet()) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
				fW.write(entry.getKey() + ": " + entry.getValue());
				fW.newLine();
				fW.flush();
			}
			fW.close();
			System.out.println("Done !");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
