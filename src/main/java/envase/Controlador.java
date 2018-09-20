package envase;

import javafx.event.*;
import javafx.stage.Stage;
import login.Login;
import org.apache.log4j.Logger;
import tapas.Tapas;

public class Controlador implements EventHandler<ActionEvent> {

    Vista formulario;
    Login lisa;
    Logger logger;
    Stage stage;
    Tapas tapa;

    Controlador(Stage primaryStage) {
        logger = Logger.getLogger(Controlador.class);
        stage = primaryStage;
        formulario = new Vista();
        lisa = new Login();
        tapa=new Tapas();
        formulario.config();
        lisa.config();
        tapa.config();
        lisa.aceptar.setOnAction(this);
        stage.setTitle("Formulario Envase");
        stage.setScene(tapa.scene);
        stage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        stage.setScene(formulario.scene);

    }

}
