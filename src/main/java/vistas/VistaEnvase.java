package vistas;

import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class VistaEnvase extends VistaPadre {

    Button aceptar;
    Button cancelar;
    Label labelNom;
    Label labelCap;
    Label labelCant;
    Label labelEstado;
    Label labelProv;
    public TextField textField;
    public TextField textCap;
    public TextField textCant;
    public TextField textEstado;
    TextField textProv;
    VBox labels;
    VBox texts;
    HBox botones;
    HBox labelTexts;

    public Scene getScene() {
        return this.scene;
    }

    public Button getAceptar() {
        return aceptar;
    }

    public Button getCancelar() {
        return cancelar;
    }

    public VistaEnvase() {
        super();
        labelNom = new Label("Nombre");
        labelCap = new Label("Capacidad");
        labelCant = new Label("Cantidad");
        labelEstado = new Label("Estado");
        labelProv = new Label("Proveedor");
        textField = new TextField();
        textCap = new TextField();
        textCant = new TextField();
        textEstado = new TextField();
        textProv = new TextField();
        aceptar = new Button("Guardar Envase");
        cancelar = new Button("Cancelar");
        labels = new VBox(10);
        texts = new VBox(3);
        botones = new HBox();
        labelTexts = new HBox();
        margenes = new Insets(20, 20, 20, 20);
    }

    public void config() {
        labelTexts.setAlignment(Pos.CENTER);
        botones.setAlignment(Pos.CENTER);
        labels.setAlignment(Pos.TOP_LEFT);
        texts.setAlignment(Pos.TOP_LEFT);
        labels.getChildren().addAll(labelNom, labelCap, labelCant, labelEstado, labelProv);
        texts.getChildren().addAll(textField, textCap, textCant, textEstado, textProv, getCancelar());
        botones.getChildren().addAll(getAceptar(), getCancelar());
        labelTexts.getChildren().addAll(labels, texts);
        contenido.getChildren().addAll(labelTexts, botones);
        contenedor.getChildren().add(contenido);
    }

}
