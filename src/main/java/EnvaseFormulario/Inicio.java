/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnvaseFormulario;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Lisa
 */
public class Inicio extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Controlador c = new Controlador(primaryStage);
    }
}
