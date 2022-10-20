package co.edu.uniquindio.subasta.aplication;

import java.io.IOException;

import co.edu.uniquindio.subasta.controller.ModelFactoryController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Aplication extends Application{

	static ModelFactoryController instancia = ModelFactoryController.getInstance();
	
	
	@Override
	public void start(Stage primaryStage) {

		try {
			//Cargo la vista
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplication.class.getResource("/co/edu/uniquindio/subasta/view/MenuPrincipal.fxml"));

			// Cargo la ventana
			Pane ventana = (Pane) loader.load();

			// Cargo el scene
			Scene scene = new Scene(ventana);

			// Seteo la scene y la muestro
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

//	public static void loadAnunciantes() throws IOException{
//		instancia.cargarAnunciantes();
//	}
	
	public static void main(String[] args) throws IOException {
//		instancia.inicializarDatos();
		
//		loadAnunciantes();
		launch(args);
		
//		instancia.cargarAnunciantes

	}
}