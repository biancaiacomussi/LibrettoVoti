package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {

	public static void main(String[] args) {
		
		Libretto libr = new Libretto();
		
		libr.add(30, "Analisi I", LocalDate.of(2017, 1, 12));
		libr.add(22, "Analisi II", LocalDate.of(2017, 1, 24));
		libr.add(23, "Fisica I", LocalDate.of(2017, 1, 14));
		libr.add(24, "Fisica II", LocalDate.of(2017, 2, 12));
		libr.add(26, "Geometria", LocalDate.of(2018, 1, 12));
		libr.add(21, "Ricerca operativa", LocalDate.of(2018, 1, 23));
		libr.add(29, "Economia", LocalDate.of(2017, 1, 12));
		libr.add(25, "Programmazione a oggetti", LocalDate.of(2018, 2, 15));
		libr.add(26, "Sistemi elettrici", LocalDate.of(2019, 1, 6));
		libr.add(27, "Diritto privato", LocalDate.of(2018, 6, 19));

		
		List<Voto> venticinque = libr.cercaVoti(25);
		System.out.println(venticinque);
		
		Voto v1 = libr.cercaEsame("Analisi I");
		Voto v2 = libr.cercaEsame("Analisi III");
		System.out.println(v1);
		System.out.println(v2);
		
		Voto giusto = new Voto(30,"Analisi I", LocalDate.now());
		Voto sbagliato = new Voto(18,"Analisi I", LocalDate.now());
		Voto mancante = new Voto(28,"Merendine", LocalDate.now());
		System.out.format("Il voto %s è %s\n", giusto.toString(), libr.esisteGiaVoto(giusto));
		System.out.format("Il voto %s è %s\n", sbagliato.toString(), libr.esisteGiaVoto(sbagliato));
		System.out.format("Il voto %s è %s\n", mancante.toString(), libr.esisteGiaVoto(mancante));
		
		System.out.format("Il voto %s è in conflitto %s\n", giusto.toString(), libr.votoConflitto(giusto));
		System.out.format("Il voto %s è in conflitto %s\n", sbagliato.toString(), libr.votoConflitto(sbagliato));
		System.out.format("Il voto %s è in conflitto %s\n", mancante.toString(), libr.votoConflitto(mancante));
		
		System.out.println(libr.add(giusto));
		System.out.println(libr.add(sbagliato));
		System.out.println(libr.add(mancante));
		
		System.out.println(libr.toString());
	
	}

}
