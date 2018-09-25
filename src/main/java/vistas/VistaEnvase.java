package vistas;

import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class VistaEnvase {

    Button aceptar;
    Button cancelar;
    Scene scene;
    StackPane contenedor;
    Label labelNom;
    Label labelCap;
    Label labelCant;
    Label labelEstado;
    Label labelProv;
    TextField textField;
    TextField textCap;
    TextField textCant;
    TextField textEstado;
    TextField textProv;
    VBox labels;
    VBox texts;
    VBox todo;
    HBox botones;
    HBox labelTexts;
    Insets margenes;

    public Scene getScene() {
        return scene;
    }
    
    public Button getAceptar() {
        return aceptar;
    }

    public Button getCancelar() {
        return cancelar;
    }

    public VistaEnvase() {
        contenedor = new StackPane();
        scene = new Scene(contenedor);
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
        aceptar = new Button("Aceptar");
        cancelar = new Button("Cancelar");
        labels = new VBox(10);
        texts = new VBox(3);
        todo = new VBox();
        botones = new HBox();
        labelTexts = new HBox();
        margenes = new Insets(20, 20, 20, 20);
    }

    public void config() {
        contenedor.setPadding(margenes);
        labelTexts.setAlignment(Pos.CENTER);
        botones.setAlignment(Pos.CENTER);
        labels.setAlignment(Pos.TOP_LEFT);
        texts.setAlignment(Pos.TOP_LEFT);
        labels.getChildren().addAll(labelNom, labelCap, labelCant, labelEstado, labelProv);
        texts.getChildren().addAll(textField, textCap, textCant, textEstado, textProv, getCancelar());
        botones.getChildren().addAll(getAceptar(), getCancelar());
        labelTexts.getChildren().addAll(labels, texts);
        todo.getChildren().addAll(labelTexts, botones);
        contenedor.getChildren().add(todo);
    }

}
