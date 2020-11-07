package com.hemebiotech.analytics;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		

		// output
		ISymptomWriter sW = new WriteSymptomsToFile();
		sW.writeSymptoms("result.out");

	}
}
