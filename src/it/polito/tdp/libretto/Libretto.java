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
}
