package envase;

import javafx.event.*;
import javafx.scene.Scene;
import org.apache.log4j.Logger;

public class Controlador implements EventHandler<ActionEvent> {

    Vista formulario;
    Logger logger;

    Controlador() {
        logger = Logger.getLogger(Controlador.class);
        formulario = new Vista();
        formulario.config();
        formulario.aceptar.setOnAction(this);
    }

    Scene getEnvaseScene() {
        return formulario.scene;
    }

    @Override
    public void handle(ActionEvent event) {
        logger.debug("ME HICIERON CLICK");
    }

}
