package controladorVistas;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import modeloSQL_Envase.Envase_Modelo;
import org.apache.log4j.Logger;
import vistas.Login;
import vistas.VistaEnvase;
import vistas.VistaTapa;
import vistas.vistaMenu;

public class Controlador implements EventHandler<ActionEvent> {

    VistaEnvase vistaEnvase;
    Login vistaLogin;
    Logger logger;
    Stage stage;
    VistaTapa vistaTapa;
    vistaMenu menuIntermedioParaElegirFormulario;

    Controlador(Stage primaryStage) {
        this.logger = Logger.getLogger(Controlador.class);
        this.stage = primaryStage;
        this.vistaEnvase = new VistaEnvase();
        this.vistaLogin = new Login();
        this.vistaTapa = new VistaTapa();
        this.menuIntermedioParaElegirFormulario = new vistaMenu();
        this.vistaEnvase.config();
        this.vistaLogin.config();
        this.vistaTapa.config();
        this.menuIntermedioParaElegirFormulario.config();
        this.vistaLogin.btnIngresar.setOnAction(this);
        this.menuIntermedioParaElegirFormulario.getBtnEnvase().setOnAction(this);
        this.menuIntermedioParaElegirFormulario.getBtnTapas().setOnAction(this);
        this.menuIntermedioParaElegirFormulario.getBtnCerrarSesion().setOnAction(this);
        this.vistaEnvase.getAceptar().setOnAction(this);
        this.vistaEnvase.getCancelar().setOnAction(this);
        this.vistaTapa.getBtnAceptar().setOnAction(this);
        this.vistaTapa.getBtnCancelar().setOnAction(this);
        this.stage.setTitle("Formulario Envase");
        this.stage.setScene(this.vistaLogin.getScene());
        this.stage.show();
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
                this.stage.setScene(this.menuIntermedioParaElegirFormulario.getScene());
                break;
            case "Cerrar Sesion":
                this.stage.setScene(this.vistaLogin.getScene());
                break;
            case "Formulario Envase":
                this.stage.setScene(this.vistaEnvase.getScene());
                break;
            case "Formulario Tapa":
                this.stage.setScene(this.vistaTapa.getScene());
                break;
            case "Aceptar":
                this.stage.setScene(this.menuIntermedioParaElegirFormulario.getScene());
                break;
            case "Cancelar":
                this.stage.setScene(this.menuIntermedioParaElegirFormulario.getScene());
                break;
            case "Guardar Envase":
                String nombre = this.vistaEnvase.textField.getText();
                Envase_Modelo modelo = new Envase_Modelo("A", "B", "C", 1);
                modelo.insert();
                break;

        }

    }

}
