package it.polito.tdp.alien;

import java.util.*;

public class DizionarioAlieno {
	
	private List<Word> dizionario; 
	
	
	
	
	public DizionarioAlieno() {
		this.dizionario = new LinkedList();
	}




	public void aggiungi(String parolaAliena, String traduzione) {
		boolean settata=false;
		for(Word w: dizionario)
			if(w.equals(parolaAliena)) {
				w.setTraduzione(traduzione.toLowerCase());
				settata=true; 
			}
		if(!settata)
			dizionario.add(new Word(parolaAliena.toLowerCase(), traduzione.toLowerCase()));
	}
	
	public void aggiungiDuplicati(String parolaAliena, String traduzione) {
		dizionario.add(new Word(parolaAliena.toLowerCase(), traduzione.toLowerCase()));
	}
	

	
	public String traduci(String parolaAliena) {
		String ritorno = ""; 
		for(Word w: dizionario)
			if(w.equals(parolaAliena.toLowerCase()))
				ritorno+=w.getTraduzione()+"\n";
		
		if(ritorno.equals(""))
			return null;
	
		return ritorno; 
	}
	

}
