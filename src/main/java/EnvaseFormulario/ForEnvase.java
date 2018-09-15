/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnvaseFormulario;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Lisa
 */
public class ForEnvase extends Application {

    public Button aceptar;

    @Override
    public void start(Stage primaryStage) {
        
        Group miGrupo = new Group();
        StackPane contenedor = new StackPane();
        Scene scene = new Scene(contenedor, 350, 350);
        Label labelNom = new Label("Nombre");
        Label labelCap = new Label("Capacidad");
        Label labelCant = new Label("Cantidad");
        Label labelEstado = new Label("Estado");
        Label labelProv = new Label("Proveedor");

        TextField TextNom = new TextField();
        TextField TextCap = new TextField();
        TextField TextCant = new TextField();
        TextField TextEstado = new TextField();
        TextField TextProv = new TextField();

        aceptar = new Button("Aceptar");
        Button cancelar = new Button("Cancelar");
        VBox labels = new VBox(10);
        labels.getChildren().addAll(labelNom, labelCap, labelCant, labelEstado, labelProv, aceptar);
        labels.setAlignment(Pos.TOP_LEFT);

        VBox texts = new VBox(3);
        texts.getChildren().addAll(TextNom, TextCap, TextCant, TextEstado, TextProv, cancelar);
        texts.setAlignment(Pos.TOP_LEFT);

        HBox botones = new HBox();
        botones.getChildren().addAll(aceptar, cancelar);
        botones.setAlignment(Pos.CENTER);

        HBox labelTexts = new HBox();
        labelTexts.getChildren().addAll(labels, texts);
        labelTexts.setAlignment(Pos.CENTER);
        labelTexts.setPadding(new Insets(20, 50, 50, 30));

        VBox todo = new VBox();
        todo.getChildren().addAll(labelTexts, botones);

        //miGrupo.getChildren().addAll(labelTexts,aceptar,cancelar);
        contenedor.getChildren().add(todo);

        primaryStage.setTitle("Formulario Envase");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
