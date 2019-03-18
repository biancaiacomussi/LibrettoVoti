package it.polito.tdp.libretto;

import java.time.LocalDate;

public class Voto {

	private int voto;
		private String corso;
	//	private Calendar data;
		private LocalDate data;
		public int getVoto() {
			return voto;
			
			
		}
		public Voto(int voto, String corso, LocalDate data) {
			super();
			this.voto = voto;
			this.corso = corso;
			this.data = data;
		}
		public void setVoto(int voto) {
			this.voto = voto;
		}
		public String getCorso() {
			return corso;
		}
		public void setCorso(String corso) {
			this.corso = corso;
		}
		public LocalDate getData() {
			return data;
		}
		public void setData(LocalDate data) {
			this.data = data;
		}
		
		@Override
		public String toString() {
			return "Voto [voto=" + voto + ", corso=" + corso + ", data=" + data + "]";
		}
		
		
}
