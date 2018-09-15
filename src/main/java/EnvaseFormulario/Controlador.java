/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnvaseFormulario;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

/**
 *
 * @author Lisa
 */
public class Controlador implements EventHandler<ActionEvent> {

    Vista formulario;

    public Controlador(Stage primaryStage) {
        formulario = new Vista();
        formulario.start(primaryStage);
        formulario.aceptar.setOnAction(this);
    }

    @Override
    public void handle(ActionEvent pepito) {
        System.out.println("ME HICIERON CLICK");
    }

}
