package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * <p>Classe triant un objet de type List par paire clé, valeur
 * et retournant un objet de type TreeMap</p>
 *
 */

public class SymptomsSorter implements ISortedSymptoms {

	/**
	 * <p>Méthode prenant un objet de type List en paramètre
	 * le triant par paire clé,valeur et retournant
	 * un objet TreeMap classé par ordre alphabétique et 
	 * dont les occurences ont été comptées</p>
	 * 
	 * @param l List à trier
	 * @return un objet de type TreeMap
	 */
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
