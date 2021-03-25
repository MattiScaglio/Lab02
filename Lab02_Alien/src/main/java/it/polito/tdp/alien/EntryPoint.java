package it.polito.tdp.alien;

import javafx.application.Application;
import static javafx.application.Application.launch;

import it.polito.tdp.alien.model.AlienDictionary;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class EntryPoint extends Application {

    @Override
    public void start(Stage stage) throws Exception {
    	
    	FXMLLoader loader= new FXMLLoader(getClass().getResource("/fxml/Scene.fxml")); //(*)    si predispone a  legge il scene.fxml
    	//Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml")); questa riga è autogenerata quando io definisco a mano l'fxml loasder sopra copio e icnollo il contenuto della parentesi dopo load
    	
    	//la riga autocreata sopra la devo poi moddificare come:
    	 Parent root =loader.load(); //legge l'fxml e crea tutti gli oggetti di tipo nodo e crea il controller
    	 //seguito da 
    	 FXMLController controller =loader.getController(); //permette al main di riconoscere il riferimento alla classe controller che è stata creata dl loader sopra
    	
    	AlienDictionary model = new AlienDictionary();
    	controller.setModel(model);//devo chiamare il setmodel dall'entrypoint la variabile controller la crea l'fxml loader (*)
    	
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        
        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
