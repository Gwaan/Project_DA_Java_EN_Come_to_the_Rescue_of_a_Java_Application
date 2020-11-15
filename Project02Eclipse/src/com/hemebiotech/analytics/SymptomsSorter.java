package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * <p>
 * Classe utilitaire permettant de trier une List et la transformer en un objet
 * de type TreeMap
 * </p>
 * 
 * @author Gwen
 * @version 1.0
 */

public class SymptomsSorter implements ISortedSymptoms {

	@Override
	public Map<String, Integer> sortSymptoms(List<String> l) {
		Map<String, Integer> sortedList = new TreeMap<>();

		for (String s : l) {
			if (!sortedList.containsKey(s)) {
				sortedList.put(s, 1);
			} else {
				sortedList.put(s, sortedList.get(s) + 1);
			}
		}
		return sortedList;
	}

}
