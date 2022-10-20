package co.edu.uniquindio.subasta.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.subasta.exceptions.EdadException;
import co.edu.uniquindio.subasta.model.Comprador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CrudCompradorRegistroController implements Initializable{

	ModelFactoryController modelFactoryController = ModelFactoryController.getInstance();
	
	@FXML
    private Button btnRegistro;
	
    @FXML
    private Button btnVolver;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtIdUsuario;

    @FXML
    private TextField txtNombre;

    @FXML
    void volver(ActionEvent event) {
    	try {
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/subasta/view/MenuPrincipal.fxml"));
			Parent root = loader.load();
	
			PrincipalController controlador = loader.getController();
	
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			
			stage.setScene(scene);
			stage.show();
			Stage myStage = (Stage) this.btnVolver.getScene().getWindow();
			myStage.close();
    	}catch(IOException ex) {
    		ex.printStackTrace();
    	}
    }
    @FXML
    void registro(ActionEvent event) throws EdadException {

    	String nombre = this.txtNombre.getText();
    	String idUsuario = this.txtIdUsuario.getText();
		int edad = Integer.parseInt(txtEdad.getText());
		
		Comprador comprador = new Comprador(nombre, idUsuario, edad);
		
		crearComprador(comprador);
		
		
    }


    private void crearComprador(Comprador comprador) throws EdadException {

    	if(comprador.getNombre().equals("") && comprador.getIdUsuario().equals("") || comprador.getEdad() == 0){

			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setHeaderText(null);
			alert.setTitle("Notificacion");
			alert.setContentText("Primero agregue informacion");
			alert.showAndWait();

			// Si la edad es menor a 18, mandara una alerta y propaga la excepcion de edad
		}else if(comprador.getEdad() < 18){

			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setHeaderText(null);
			alert.setTitle("Notificacion");
			alert.setContentText("Debes ser mayor de edad para ingresar.");
			alert.showAndWait();

			throw new EdadException("La edad es menor a los 18 a�os.");

		}else{
			
			// Este metodo no se usa, X, el proposito era comparar que no exista ya la misma identificacion
			if(comprador.getIdUsuario().equals(txtIdUsuario)){

				Alert alert = new Alert(Alert.AlertType.INFORMATION);
				alert.setHeaderText(null);
				alert.setTitle("Notificacion");
				alert.setContentText("El usuario ya existe.");
				alert.showAndWait();
				
			}else{
				
				// Si ninguno de los campos esta vacio y la ID no esta repetida procede a crear ese anunciante y
				// Abrirle la respectiva intefaz
				try {
					modelFactoryController.agregarComprador(comprador);
					
					FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/subasta/view/MenuComprador.fxml"));
					Parent root = loader.load();

					MenuCompradorController controlador = loader.getController();

					Scene scene = new Scene(root);
					Stage stage = new Stage();
					stage.initModality(Modality.APPLICATION_MODAL); 
					stage.setScene(scene);
					stage.showAndWait();

				} catch (IOException ex) {

					Alert alert = new Alert(Alert.AlertType.ERROR);
					alert.setHeaderText(null);
					alert.setTitle("Error");
					alert.setContentText(ex.getMessage());
					alert.showAndWait();
				}
			}

		}
		
	}
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}

}