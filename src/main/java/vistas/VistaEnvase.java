package vistas;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class VistaEnvase extends VistaPadre {

    public TextField textField;
    public TextField textCap;
    public TextField textCant;
    public TextField textEstado;
    Button aceptar;
    Button cancelar;
    Label labelNom;
    Label labelCap;
    Label labelCant;
    Label labelEstado;
    Label labelProv;
    TextField textProv;
    VBox labels;
    VBox texts;
    HBox botones;
    HBox labelTexts;

    public VistaEnvase() {
        this.labelNom = new Label("Nombre");
        this.labelCap = new Label("Capacidad");
        this.labelCant = new Label("Cantidad");
        this.labelEstado = new Label("Estado");
        this.labelProv = new Label("Proveedor");
        this.textField = new TextField();
        this.textCap = new TextField();
        this.textCant = new TextField();
        this.textEstado = new TextField();
        this.textProv = new TextField();
        this.aceptar = new Button("Guardar Envase");
        this.cancelar = new Button("Cancelar");
        this.labels = new VBox(10);
        this.texts = new VBox(3);
        this.botones = new HBox();
        this.labelTexts = new HBox();
        this.margenes = new Insets(20, 20, 20, 20);
    }

    public Scene getScene() {
        return this.scene;
    }

    public Button getAceptar() {
        return this.aceptar;
    }

    public Button getCancelar() {
        return this.cancelar;
    }

    public void config() {
        this.labelTexts.setAlignment(Pos.CENTER);
        this.botones.setAlignment(Pos.CENTER);
        this.labels.setAlignment(Pos.TOP_LEFT);
        this.texts.setAlignment(Pos.TOP_LEFT);
        this.labels.getChildren().addAll(this.labelNom, this.labelCap, this.labelCant, this.labelEstado, this.labelProv);
        this.texts.getChildren().addAll(this.textField, this.textCap, this.textCant, this.textEstado, this.textProv, this.getCancelar());
        this.botones.getChildren().addAll(this.getAceptar(), this.getCancelar());
        this.labelTexts.getChildren().addAll(this.labels, this.texts);
        this.contenido.getChildren().addAll(this.labelTexts, this.botones);
        this.contenedor.getChildren().add(this.contenido);
    }

}
