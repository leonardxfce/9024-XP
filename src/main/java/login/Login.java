package login;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class Login {

    public Scene scene;
    StackPane contenedor;
    Label usuario;
    Label contrasena;
    TextField usuario_campo;
    TextField contrasena_campo;
    public Button aceptar;
    VBox vbox;

    public Login() {
        contenedor = new StackPane();
        scene = new Scene(contenedor);
        usuario = new Label("Usuario");
        contrasena = new Label("Contraseña");
        usuario_campo = new TextField();
        contrasena_campo = new TextField();
        aceptar = new Button("Aceptar");
        vbox = new VBox();
    }

    public void config() {
        vbox.getChildren().addAll(usuario,contrasena,usuario_campo,contrasena_campo,aceptar);
        contenedor.getChildren().add(vbox);
    }

    }
