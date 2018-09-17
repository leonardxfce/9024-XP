package envase;

import javafx.event.*;
import javafx.stage.Stage;
import org.apache.log4j.Logger;

public class Controlador implements EventHandler<ActionEvent> {

    Vista formulario;
    Logger logger;
    Stage stage;

    Controlador(Stage primaryStage) {
        logger = Logger.getLogger(Controlador.class);
        stage = primaryStage;
        formulario = new Vista();
        formulario.config();
        formulario.aceptar.setOnAction(this);
        stage.setTitle("Formulario Envase");
        stage.setScene(formulario.scene);
        stage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        logger.debug("ME HICIERON CLICK");
    }

}
