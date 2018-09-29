package vistas;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class VistaPadre {
    Scene scene;
    StackPane contenedor;
    VBox contenido;
    Insets margenes;

    public VistaPadre() {
        this.contenedor = new StackPane();
        this.scene = new Scene(this.contenedor);
        this.contenido = new VBox();
        this.margenes = new Insets(20, 20, 20, 20);
        this.contenedor.setPadding(this.margenes);
    }


}
