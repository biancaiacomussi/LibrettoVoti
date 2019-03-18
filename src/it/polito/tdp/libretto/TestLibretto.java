package it.polito.tdp.libretto;

import java.awt.List;
import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		
		Libretto libr = new Libretto();
		
		libr.add(30, "Analisi I", LocalDate.of(2017, 1, 12));
		libr.add(22, "Analisi II", LocalDate.of(2017, 1, 24));
		libr.add(23, "Fisica I", LocalDate.of(2017, 1, 14));
		libr.add(24, "Fisica II", LocalDate.of(2017, 2, 29));
		libr.add(26, "Geometria", LocalDate.of(2018, 1, 12));
		libr.add(21, "Ricerca operativa", LocalDate.of(2018, 1, 23));
		libr.add(29, "Economia", LocalDate.of(2017, 1, 12));
		libr.add(25, "Programmazione a oggetti", LocalDate.of(2018, 2, 15));
		libr.add(26, "Sistemi elettrici", LocalDate.of(2019, 1, 6));
		libr.add(27, "Diritto privato", LocalDate.of(2018, 6, 19));

		
		List<Voto> venticinque = libr.cercaVoti(25);
		System.out.println(venticinque);
	}

}
