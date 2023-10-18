package no.hvl.dat100.prosjekt.modell;

import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;

public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling
	 * 			samling av kort som skal sorteres. 
	 */
	
	public static void sorter(KortSamling samling) {
		
		 Kort[] samlingSrt = samling.getSamling();
		    int antall = samling.getAntalKort();

		    if (samlingSrt != null && antall > 0) {
		    	
		        for (int i = 0; i < antall - 1; i++) {
		            for (int j = 0; j < antall - i - 1; j++) {
		                if (samlingSrt[j].compareTo(samlingSrt[j + 1]) > 0) {
		                	
		                    Kort temp = samlingSrt[j];
		                    samlingSrt[j] = samlingSrt[j + 1];
		                    samlingSrt[j + 1] = temp;
		                }
		            }
		        }
		    }
		}
	
	/**
	 * Stokkar en kortsamling. 
	 * 
	 * @param samling
	 * 			samling av kort som skal stokkes. 
	 */
	public static void stokk(KortSamling samling) {
		
		Kort[] kortArray = samling.getSamling();
		int antallKort = samling.getAntalKort();
		Random random = new Random();

		for (int i = antallKort - 1; i >= 0; i--) {
		    
		    int tilfeldigIndeks = random.nextInt(i + 1);

		    
		    Kort temp = kortArray[i];
		    kortArray[i] = kortArray[tilfeldigIndeks];
		    kortArray[tilfeldigIndeks] = temp;
		}
	}
}

