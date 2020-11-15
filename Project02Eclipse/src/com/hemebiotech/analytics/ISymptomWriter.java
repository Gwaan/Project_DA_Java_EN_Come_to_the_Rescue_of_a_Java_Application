package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Interface permettant d'écrire un objet de type Map dans un fichier cible
 *
 */

public interface ISymptomWriter {

	/**
	 * <p>
	 * Méthode prenant en paramètre un objet de type Map et l'écrivant dans un
	 * fichier cible
	 * </p>
	 * 
	 * @param m objet de type Map à écrire dans le fichier cible
	 */
	void writeSymptoms(Map<String, Integer> m);

}
