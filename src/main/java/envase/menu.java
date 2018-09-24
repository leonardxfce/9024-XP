package envase;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author SantiagoLisa
 */
public class menu {

    public Scene scene;
    StackPane contenedor;
    Button btnEnvase;
    Button btnTapas;
    Button btnVolver;
    Label titulo;
    VBox contenido;

    public menu() {
        contenedor = new StackPane();
        scene = new Scene(contenedor);
        btnEnvase = new Button("Formulario Envase");
        btnTapas = new Button("Formulario Tapa");
        btnVolver = new Button("Volver");
        titulo = new Label("-----");
        contenido = new VBox();
    }
    
    public void config(){
        contenido.getChildren().addAll(titulo,btnEnvase,btnTapas,btnVolver);
        contenedor.getChildren().add(contenido);
    }
}
