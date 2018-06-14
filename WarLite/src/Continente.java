import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class Continente {
	
	List <País> paises = new ArrayList<País>();
	
	/**
	 * Adiciona um país p ao ArrayList paises;
	 * @param p
	 */
	void addPais(País p) {
		paises.add(p);
	}
	
	//VerificaControle
	int verControle() {
		int id = -1;
		
		for(int i = 0; i < paises.size(); i++) {
			if(i == 0) {
				id = paises.get(i).getpID();
			}
			else {
				if(paises.get(i).getpID() != id) {
					return -1;
				}
			}
		}
		return id;
	}
}
