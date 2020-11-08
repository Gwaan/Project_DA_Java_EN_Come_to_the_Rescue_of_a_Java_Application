package com.hemebiotech.analytics;

import java.util.Map;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

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
