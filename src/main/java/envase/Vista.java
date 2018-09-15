package envase;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Vista extends Application {

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

    public Vista() {
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

    @Override
    public void start(Stage primaryStage) {
        contenedor.setPadding(margenes);
        labelTexts.setAlignment(Pos.CENTER);
        botones.setAlignment(Pos.CENTER);
        labels.setAlignment(Pos.TOP_LEFT);
        texts.setAlignment(Pos.TOP_LEFT);
        labels.getChildren().addAll(labelNom, labelCap, labelCant, labelEstado, labelProv);
        texts.getChildren().addAll(textField, textCap, textCant, textEstado, textProv, cancelar);
        botones.getChildren().addAll(aceptar, cancelar);
        labelTexts.getChildren().addAll(labels, texts);
        todo.getChildren().addAll(labelTexts, botones);
        contenedor.getChildren().add(todo);
        primaryStage.setTitle("Formulario Envase");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
