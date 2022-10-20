package co.edu.uniquindio.subasta.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PrincipalController implements Initializable{

    @FXML
    private Button btnLoginAnunciante;

    @FXML
    private Button btnLoginComprador;

    @FXML
    private Button btnRegistroAnunciante;

    @FXML
    private Button btnRegistroComprador;

    @FXML
    void loginAnunciante(ActionEvent event) {
    	//Metodo que permite tener solo una pestaña abierta (implementar en todo el codigo)
    	try {

    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/subasta/view/TransaccionAnuncianteLog.fxml"));
			Parent root = loader.load();

			TransaccionAnuncianteLogController controlador = loader.getController();

			Scene scene = new Scene(root);
			Stage stage = new Stage();
			
			stage.setScene(scene);
			stage.show();
			stage.setOnCloseRequest(e -> controlador.volver(event));
			Stage myStage = (Stage) this.btnLoginAnunciante.getScene().getWindow();
			myStage.close();

		} catch (IOException ex) {

			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
		}
    }

    @FXML
    void loginComprador(ActionEvent event) {
    	try {

    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/subasta/view/TransaccionCompradorLog.fxml"));
			Parent root = loader.load();

			TransaccionCompradorLogController controlador = loader.getController();

			Scene scene = new Scene(root);
			Stage stage = new Stage();
			
			stage.setScene(scene);
			stage.show();
			stage.setOnCloseRequest(e -> controlador.volver(event));
			Stage myStage = (Stage) this.btnLoginAnunciante.getScene().getWindow();
			myStage.close();

		} catch (IOException ex) {

			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
		}
    }

    @FXML
    void registroAnunciante(ActionEvent event) {

    	try {

    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/subasta/view/CrudAnuncianteRegistro.fxml"));
			Parent root = loader.load();

			CrudAnuncianteRegistroController controlador = loader.getController();

			Scene scene = new Scene(root);
			Stage stage = new Stage();
			
			stage.setScene(scene);
			stage.show();
			stage.setOnCloseRequest(e -> controlador.volver(event));
			Stage myStage = (Stage) this.btnLoginAnunciante.getScene().getWindow();
			myStage.close();

		} catch (IOException ex) {

			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
		}
    }

    @FXML
    void registroComprador(ActionEvent event) {

    	try {

    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/subasta/view/CrudCompradorRegistro.fxml"));
			Parent root = loader.load();

			CrudCompradorRegistroController controlador = loader.getController();

			Scene scene = new Scene(root);
			Stage stage = new Stage();
			
			stage.setScene(scene);
			stage.show();
			stage.setOnCloseRequest(e -> controlador.volver(event));
			Stage myStage = (Stage) this.btnLoginAnunciante.getScene().getWindow();
			myStage.close();

		} catch (IOException ex) {

			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
		}
    }

    @Override
   	public void initialize(URL url, ResourceBundle rb) {
   		// TODO Auto-generated method stub
   		
   	}
}