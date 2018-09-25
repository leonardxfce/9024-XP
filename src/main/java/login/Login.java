package login;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class Login {

    private Scene scene;
    StackPane contenedor;
    Label usuario;
    Label contrasena;
    public TextField usuario_campo;
    public TextField contrasena_campo;
    public Button btnIngresar;
    VBox vbox;

    public Scene getScene() {
        return scene;
    }
    
    public Login() {
        contenedor = new StackPane();
        scene = new Scene(contenedor);
        usuario = new Label("Usuario");
        contrasena = new Label("Contraseña");
        usuario_campo = new TextField();
        contrasena_campo = new TextField();
        btnIngresar = new Button("Ingresar");
        vbox = new VBox();
    }

    public void config() {
        vbox.getChildren().addAll(usuario, contrasena, usuario_campo, contrasena_campo, btnIngresar);
        contenedor.getChildren().add(vbox);
    }

}
