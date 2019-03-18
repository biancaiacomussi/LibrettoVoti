package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.*;

public class Libretto {
	
	private List<Voto> voti; //un'arrayList vuota e null sono due cose diverse
	
	public Libretto() {
		this.voti = new ArrayList <Voto>();
	}
	
	public void add(int voto, String corso, LocalDate data) {
		
	}

	public void add(Voto v) { //meglio questo metodo
		voti.add(v);
	}
	
	/*public void stampaVoti(int voto) {
		
	}
	
	public String stampaVoti(int voto) {
		
	}*/
	
	
	/**
	 * Seleziona il sottoinsieme di voti che hanno il punteggio specificato
	 * @param punti, punteggio da ricerca
	 * @return lista di {@link} aventi quel punteggio (eventualmente vuota)
	 */
	public List<Voto> cercaVoti(int punti){
		List<Voto> result = new ArrayList<Voto>();
		for(Voto v: this.voti) {
			if(v.getPunti()==punti) {
				result.add(v);
			}
		}
		
		return result;
	}
}
