package envase;

import javafx.application.Application;
import javafx.stage.Stage;

public class Inicio extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Controlador controlador = new Controlador();
        primaryStage.setTitle("Formulario Envase");
        primaryStage.setScene(controlador.getEnvaseScene());
        primaryStage.show();

    }
}
