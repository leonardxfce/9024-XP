package vistas;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import vistas.VistaPadre;

public class Login extends VistaPadre{

    Label usuario;
    Label contrasena;
    public TextField usuario_campo;
    public TextField contrasena_campo;
    public Button btnIngresar;

    public Scene getScene() {
        return scene;
    }
    
    public Login() {
        super();
        usuario = new Label("Usuario");
        contrasena = new Label("Contraseña");
        usuario_campo = new TextField();
        contrasena_campo = new TextField();
        btnIngresar = new Button("Ingresar");
    }

    public void config() {
        contenido.getChildren().addAll(usuario, contrasena, usuario_campo, contrasena_campo, btnIngresar);
        contenedor.getChildren().add(contenido);
    }

}
