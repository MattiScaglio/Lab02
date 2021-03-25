package it.polito.tdp.alien.model;

import java.util.HashSet;

public class AlienDictionary {
	
	HashSet<Word> dictionary = new HashSet<Word>();
	
	public void addWord (String alienWord, String translation) {
		for(Word w: dictionary){
			if(w.getAlienWord().equals(alienWord)) {
				w.setTranslation(translation);
				return;
			}
		}
		Word wo = new Word(alienWord,translation);
		dictionary.add(wo);
		return;
	}
	
	public String translateWord (String alienWord) {
		for(Word w: dictionary){
			if(w.getAlienWord().equals(alienWord)) {
				return w.getTranslation();	
			}
		}
		return null;
	}

	public String printMe() {
		String s="";
		for(Word w : dictionary) {
			s+= w.getAlienWord()+" "+"-"+" "+w.getTranslation()+"\n";
		}
		s.trim();
		return s;
	}
}