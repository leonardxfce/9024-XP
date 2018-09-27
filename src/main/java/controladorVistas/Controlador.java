package controladorVistas;

import javafx.event.*;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import vistas.Login;
import login.ModeloLogin;
import org.apache.log4j.Logger;
import vistas.VistaTapa;
import vistas.VistaEnvase;
import vistas.vistaMenu;

public class Controlador implements EventHandler<ActionEvent> {

    VistaEnvase vistaEnvase;
    Login vistaLogin;
    Logger logger;
    Stage stage;
    VistaTapa vistaTapa;
    vistaMenu menuIntermedioParaElegirFormulario;

    Controlador(Stage primaryStage) {
        logger = Logger.getLogger(Controlador.class);
        stage = primaryStage;
        vistaEnvase = new VistaEnvase();
        vistaLogin = new Login();
        vistaTapa = new VistaTapa();
        menuIntermedioParaElegirFormulario = new vistaMenu();
        vistaEnvase.config();
        vistaLogin.config();
        vistaTapa.config();
        menuIntermedioParaElegirFormulario.config();
        vistaLogin.btnIngresar.setOnAction(this);
        menuIntermedioParaElegirFormulario.getBtnEnvase().setOnAction(this);
        menuIntermedioParaElegirFormulario.getBtnTapas().setOnAction(this);
        menuIntermedioParaElegirFormulario.getBtnCerrarSesion().setOnAction(this);
        vistaEnvase.getAceptar().setOnAction(this);
        vistaEnvase.getCancelar().setOnAction(this);
        vistaTapa.getBtnAceptar().setOnAction(this);
        vistaTapa.getBtnCancelar().setOnAction(this);
        stage.setTitle("Formulario Envase");
        stage.setScene(vistaLogin.getScene());
        stage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        Button botonSeleccionado = (Button) event.getSource();
        String dato = event.getClass().toString();

        String textoDelBoton = botonSeleccionado.getText();
        switch (textoDelBoton) {
            case "Ingresar":
             //   String usuario = vistaLogin.usuario_campo.getText();
               // String contrasena = vistaLogin.contrasena_campo.getText();
               // ModeloLogin mL = new ModeloLogin(usuario,contrasena);
                //mL.insertar();
                stage.setScene(menuIntermedioParaElegirFormulario.getScene());
                break;
            case "Cerrar Sesion":
                stage.setScene(vistaLogin.getScene());
                break;
            case "Formulario Envase":
                stage.setScene(vistaEnvase.getScene());
                break;
            case "Formulario Tapa":
                stage.setScene(vistaTapa.getScene());
                break;
            case "Aceptar":
                stage.setScene(menuIntermedioParaElegirFormulario.getScene());
                break;
            case "Cancelar":
                stage.setScene(menuIntermedioParaElegirFormulario.getScene());
                break;

        }

    }

}
