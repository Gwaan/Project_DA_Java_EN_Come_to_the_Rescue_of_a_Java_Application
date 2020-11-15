package com.hemebiotech.analytics;

import java.util.Map;

/**
 * <p>
 * Programme lisant une source (fichier) de symptômes, comptant chaque
 * occurence, les triant par ordre alphabétique puis les enregistrant dans un
 * fichier cible
 * </p>
 * 
 * @author Gwen
 * @version 1.0
 */

public class AnalyticsCounter {

	/**
	 * Main du programme
	 * 
	 * @param args
	 */

	public static void main(String args[]) {

		// get input
		ISymptomReader sR = new ReadSymptomDataFromFile("symptoms.txt");
		// sort symptoms
		ISortedSymptoms sS = new SymptomsSorter();
		Map<String, Integer> sortedSymptoms = sS.sortSymptoms(sR.getSymptoms());
		// write file
		ISymptomWriter sW = new WriteSymptomsToFile("result.out");
		sW.writeSymptoms(sortedSymptoms);

	}
}
