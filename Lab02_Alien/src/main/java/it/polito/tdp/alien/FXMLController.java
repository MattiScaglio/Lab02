package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.AlienDictionary;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	private AlienDictionary model; //il modello deve essere noto al controller 
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField CampoParole;

    @FXML
    private TextArea campoRisultato;

    @FXML
    void actionClear(ActionEvent event) {
    	campoRisultato.clear();
    	CampoParole.clear();
    }

    @FXML
    void bottoneTranslate(ActionEvent event) {
    	String parola= CampoParole.getText();
    	String campi[]=parola.split("\\s+");
    	
    	if(campi.length==2) {
    		model.addWord(campi[0], campi[1]);
        	campoRisultato.setText("Parola Inserita");
        	return;
    	}
    	
    	String ris=model.translateWord(campi[0]);
		campoRisultato.setText(ris);
		return;
    	
    	
    	
    }

    @FXML
    void initialize() {
        assert CampoParole != null : "fx:id=\"CampoParole\" was not injected: check your FXML file 'Scene.fxml'.";
        assert campoRisultato != null : "fx:id=\"campoRisultato\" was not injected: check your FXML file 'Scene.fxml'.";

    }
    
    public void setModel(AlienDictionary model) { //devo inzializzarla 
    	this.model=model;
    }
}

