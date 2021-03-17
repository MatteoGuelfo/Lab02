package it.polito.tdp.alien;

import java.util.*;

public class DizionarioAlieno {
	
	private List<Word> dizionario; 
	
	
	
	
	public DizionarioAlieno() {
		this.dizionario = new LinkedList();
	}




	public void aggiungi(String parolaAliena, String traduzione) {
		for(Word w: dizionario)
			if(w.equals(parolaAliena))
				w.setTraduzione(traduzione);
		
		dizionario.add(new Word(parolaAliena, traduzione));
	}
	
	public String traduci(String parolaAliena) {
		for(Word w: dizionario)
			if(w.equals(parolaAliena))
				return w.getTraduzione();
		
		return null;
	}
	

}
