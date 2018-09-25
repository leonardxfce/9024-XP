
package vistas;

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
public class VistaTapa {

    private Scene scene;
    StackPane contenedor;
    Button btnAceptar;
    Button btnCancelar;
    Label cantidad;
    Label tipoDeTapa;
    TextField seleccionTipoDeTapa;
    TextField seleccionCantidad;
    HBox boxTipo;
    HBox boxCantidad;
    HBox boxBotones;
    VBox todo;

    public Scene getScene() {
        return scene;
    }
    
    public Button getBtnAceptar() {
        return btnAceptar;
    }

    public Button getBtnCancelar() {
        return btnCancelar;
    }
    
    public VistaTapa() {
        contenedor = new StackPane();
        scene = new Scene(contenedor);
        btnAceptar = new Button("Aceptar");
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
        boxBotones.getChildren().addAll(btnAceptar, btnCancelar);
        todo.getChildren().addAll(boxTipo, boxCantidad, boxBotones);
        contenedor.getChildren().add(todo);
    }

}
