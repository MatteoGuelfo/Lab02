package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private DizionarioAlieno model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInput;

    @FXML
    private Button btnTraduci;

    @FXML
    private TextArea txtOutput;

    @FXML
    private Button btnCancella;
    
    
    

    public void setModel(DizionarioAlieno model) {
		this.model = model;
	}

	@FXML
    void doReset(ActionEvent event) {

    }

    @FXML
    void doTraduzione(ActionEvent event) {
    	String stringa = txtInput.getText(); 
    	String[] parole= stringa.split(" ");
    	
    	if(parole.length == 1) {
    		txtOutput.setText("La parola "+parole[0]+" è presente con traduzione: "+model.traduci(parole[0]));
    	}   		
    	else {    
    		model.aggiungi(parole[0], parole[1]);
    		txtOutput.setText(parole[0]+" aggiunta con traduzione "+parole[1]);
    		
    	}

    		
    		

    }

    @FXML
    void initialize() {
        assert txtInput != null : "fx:id=\"txtInput\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTraduci != null : "fx:id=\"btnTraduci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtOutput != null : "fx:id=\"txtOutput\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}