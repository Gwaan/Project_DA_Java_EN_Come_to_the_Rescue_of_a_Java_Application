package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class WriteSymptomsToFile implements ISymptomWriter {
	private String filePath;

	/**
	 * 
	 * @param filePath chemin du fichier cible
	 * 
	 */
	public WriteSymptomsToFile(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public void writeSymptoms(Map<String, Integer> m) {
		BufferedWriter fW = null;
		try {
			File f = new File(filePath);
			fW = new BufferedWriter(new FileWriter(f));
			for (Entry<String, Integer> entry : m.entrySet()) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
				fW.write(entry.getKey() + ": " + entry.getValue());
				fW.newLine();
				fW.flush();
			}
			System.out.println("Done !");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fW.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
