package vistas;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Login extends VistaPadre {

    public TextField usuario_campo;
    public TextField contrasena_campo;
    public Button btnIngresar;
    Label usuario;
    Label contrasena;

    public Login() {
        this.usuario = new Label("Usuario");
        this.contrasena = new Label("Contraseña");
        this.usuario_campo = new TextField();
        this.contrasena_campo = new TextField();
        this.btnIngresar = new Button("Ingresar");
    }

    public Scene getScene() {
        return this.scene;
    }

    public void config() {
        this.contenido.getChildren().addAll(this.usuario, this.contrasena, this.usuario_campo, this.contrasena_campo, this.btnIngresar);
        this.contenedor.getChildren().add(this.contenido);
    }

}
