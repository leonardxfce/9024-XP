/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapas;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author ikariRules
 */
public class Tapas {

    public Scene scene;
    StackPane contenedor;
    Button btnGuardar;
    Button btnCancelar;
    Label cantidad;
    Label tipoDeTapa;
    TextField seleccionTipoDeTapa;
    TextField seleccionCantidad;
    HBox boxTipo;
    HBox boxCantidad;
    HBox boxBotones;
    VBox todo;

    public Tapas() {
        contenedor = new StackPane();
        scene = new Scene(contenedor);
        btnGuardar = new Button("Guardar");
        btnCancelar = new Button("Cancelar");
        cantidad = new Label("Cantidad");
        tipoDeTapa = new Label("Tipo");
        seleccionTipoDeTapa = new TextField();
        seleccionCantidad = new TextField();
        boxTipo = new HBox();
        boxCantidad = new HBox();
        boxBotones = new HBox();
        todo = new VBox();
    }

    public void config() {
        boxTipo.getChildren().addAll(tipoDeTapa, seleccionTipoDeTapa);
        boxCantidad.getChildren().addAll(cantidad, seleccionCantidad);
        boxBotones.getChildren().addAll(btnGuardar, btnCancelar);
        todo.getChildren().addAll(boxTipo, boxCantidad, boxBotones);
        contenedor.getChildren().add(todo);
    }
}
