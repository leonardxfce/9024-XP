package envase;

import javafx.event.*;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import login.Login;
import org.apache.log4j.Logger;
import tapas.Tapas;

public class Controlador implements EventHandler<ActionEvent> {

    Vista Envase;
    Login login;
    Logger logger;
    Stage stage;
    Tapas Tapa;
    menu Menu;

    Controlador(Stage primaryStage) {
        logger = Logger.getLogger(Controlador.class);
        stage = primaryStage;
        Envase = new Vista();
        login = new Login();
        Tapa = new Tapas();
        Menu = new menu();
        Envase.config();
        login.config();
        Tapa.config();
        Menu.config();
        login.aceptar.setOnAction(this);
        Menu.btnEnvase.setOnAction(this);
        Menu.btnTapas.setOnAction(this);
        Menu.btnVolver.setOnAction(this);
        Envase.aceptar.setOnAction(this);
        Envase.cancelar.setOnAction(this);
        Tapa.getBtnGuardar().setOnAction(this);
        Tapa.getBtnCancelar().setOnAction(this);
        stage.setTitle("Formulario Envase");
        stage.setScene(login.scene);
        stage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        stage.setScene(Envase.scene);
        Button botonSeleccionado = (Button) event.getSource();
        String dato = event.getClass().toString();
        System.out.println(dato);

        String textoDelBoton = botonSeleccionado.getText();
        switch (textoDelBoton) {
            case "Aceptar":
                stage.setScene(Menu.scene);
                break;
            case "Formulario Envase":
                stage.setScene(Envase.scene);
                break;
            case "Formulario Tapa":
                stage.setScene(Tapa.scene);
                break;
            default:
                throw new AssertionError();
        }

    }

}
