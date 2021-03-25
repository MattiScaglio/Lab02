package it.polito.tdp.alien.model;

public class modelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlienDictionary dizio = new AlienDictionary();
		dizio.addWord("sapio", "bello");
		System.out.println(dizio.translateWord("sapio"));
		
		dizio.addWord("sapio", "mamma");
		System.out.println(dizio.translateWord("sapio"));
		
		dizio.addWord("tito", "pettegolo");
		System.out.println(dizio.printMe());
	}

}
