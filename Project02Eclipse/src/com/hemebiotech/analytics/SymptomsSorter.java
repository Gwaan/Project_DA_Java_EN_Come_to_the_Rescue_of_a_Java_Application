package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SymptomsSorter implements ISortedSymptoms {

	@Override
	public Map<String, Integer> sortSymptoms() {
		ISymptomReader list = new ReadSymptomDataFromFile("symptoms.txt");
		Map<String, Integer> sortedList = new TreeMap<>();
		List<String> tmp = list.getSymptoms();

		for (String s : tmp) {
			if (!sortedList.containsKey(s)) {
				sortedList.put(s, 1);
			} else {
				sortedList.put(s, sortedList.get(s) + 1);
			}
		}
		return sortedList;
	}

	@Override
	public Map<String, Integer> sortSymptoms(List<String> l) {
		Map<String, Integer> sortedList = new TreeMap<>();
		List<String> tmp = l;

		for (String s : tmp) {
			if (!sortedList.containsKey(s)) {
				sortedList.put(s, 1);
			} else {
				sortedList.put(s, sortedList.get(s) + 1);
			}
		}
		return sortedList;

	}

}
