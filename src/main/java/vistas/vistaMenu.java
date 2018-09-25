package vistas;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author SantiagoLisa
 */
public class vistaMenu {

    private Scene scene;
    StackPane contenedor;
    Button btnEnvase;
    Button btnTapas;
    Button btnCerrarSesion;
    Label titulo;
    VBox contenido;

    public Scene getScene() {
        return scene;
    }
    
    public Button getBtnEnvase() {
        return btnEnvase;
    }

    public Button getBtnTapas() {
        return btnTapas;
    }

    public Button getBtnCerrarSesion() {
        return btnCerrarSesion;
    }
    
    public vistaMenu() {
        contenedor = new StackPane();
        scene = new Scene(contenedor);
        btnEnvase = new Button("Formulario Envase");
        btnTapas = new Button("Formulario Tapa");
        btnCerrarSesion = new Button("Cerrar Sesion");
        titulo = new Label("-----");
        contenido = new VBox();
    }
    
    public void config(){
        contenido.getChildren().addAll(titulo, getBtnEnvase(), getBtnTapas(), getBtnCerrarSesion());
        contenedor.getChildren().add(contenido);
    }

}
