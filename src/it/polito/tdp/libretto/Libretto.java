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
	
	/**
	 * Ricerca un {@link Voto} relativo al corso di cui è specificato il nome
	 * @param nomeEsame nome del corso da ricercare
	 * @return il {@link Voto}
	 */
	public Voto cercaEsame(String nomeEsame) { //si può fare con contains e indexOf
		/*for(Voto v : this.voti) {
			if(v.getCorso().equals(nomeEsame)) { //con == confronto la posizione in memoria
				return v;
			}
			
		}*/
		
		//il metodo equals guarda solo il nome del corso
		//costruisco un oggetto Voto incompleto che serve solo per la ricerca
		
		Voto voto = new Voto(0, nomeEsame, null);
		int pos = this.voti.indexOf(voto);
		if(pos==-1) //l'oggetto non è stato trovato
			return null;
		 else
			return this.voti.get(pos);
		
	}
	
	/**
	 * Dato un {@link Voto} determina se esiste già un voto con uguale corso e uguale punteggio
	 * @param v
	 * @return {@code true} se ha trovato un corso e punteggio uguali
	 * 			{@code false} se non ha trovato il corso oppure l'ha trovato con voto diverso
	 */
	public boolean esisteGiaVoto(Voto v) {
		int pos = this.voti.indexOf(v);
		if(pos==-1) return false;
		
		else 
			return (v.getPunti() == this.voti.get(pos).getPunti());
				
		
	/*	Voto trovato = this.cercaEsame(v.getCorso());
		if(trovato == null) {
			return false;
		}
		if(trovato.getPunti()==v.getPunti()) {
			return true;
		}else {
			return false;
		}*/
	}
}
