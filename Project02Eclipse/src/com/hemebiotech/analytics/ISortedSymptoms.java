package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * Interface permettant de trier un objet par paire clé, valeur
 * </p>
 *
 */

public interface ISortedSymptoms {

	/**
	 * <p>
	 * Méthode prenant un objet de type List en paramètre le triant par paire
	 * clé,valeur et retournant un objet TreeMap classé par ordre alphabétique et
	 * dont les occurences ont été comptées
	 * </p>
	 * 
	 * @param l List à trier
	 * @return un objet de type Map
	 */
	Map<String, Integer> sortSymptoms(List<String> l);

}
