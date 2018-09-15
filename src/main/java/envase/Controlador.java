/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package envase;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import org.apache.log4j.Logger;

/**
 * @author Lisa
 */
public class Controlador implements EventHandler<ActionEvent> {

    Vista formulario;
    Logger logger;

    Controlador(Stage primaryStage) {
        formulario = new Vista();
        formulario.start(primaryStage);
        formulario.aceptar.setOnAction(this);
        logger = Logger.getLogger(Controlador.class);
    }

    @Override
    public void handle(ActionEvent event) {
        logger.debug("ME HICIERON CLICK");
    }

}
