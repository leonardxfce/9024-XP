package envase;

import javafx.event.*;
import javafx.stage.Stage;
import login.Login;
import org.apache.log4j.Logger;

public class Controlador implements EventHandler<ActionEvent> {

    Vista formulario;
    Login lisa;
    Logger logger;
    Stage stage;

    Controlador(Stage primaryStage) {
        logger = Logger.getLogger(Controlador.class);
        stage = primaryStage;
        formulario = new Vista();
        lisa = new Login();
        formulario.config();
        lisa.config();
        lisa.aceptar.setOnAction(this);
        stage.setTitle("Formulario Envase");
        stage.setScene(lisa.scene);
        stage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        stage.setScene(formulario.scene);

    }

}
