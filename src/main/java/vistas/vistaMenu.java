package vistas;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * @author SantiagoLisa
 */
public class vistaMenu extends VistaPadre {

    Button btnEnvase;
    Button btnTapas;
    Button btnCerrarSesion;
    Label titulo;

    public vistaMenu() {
        this.btnEnvase = new Button("Formulario Envase");
        this.btnTapas = new Button("Formulario Tapa");
        this.btnCerrarSesion = new Button("Cerrar Sesion");
        this.titulo = new Label("-----");
    }

    public Scene getScene() {
        return this.scene;
    }

    public Button getBtnEnvase() {
        return this.btnEnvase;
    }

    public Button getBtnTapas() {
        return this.btnTapas;
    }

    public Button getBtnCerrarSesion() {
        return this.btnCerrarSesion;
    }

    public void config() {
        this.contenido.getChildren().addAll(this.titulo, this.getBtnEnvase(), this.getBtnTapas(), this.getBtnCerrarSesion());
        this.contenedor.getChildren().add(this.contenido);
    }

}
