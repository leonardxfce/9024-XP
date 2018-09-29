package vistas;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 * @author ikariRules
 */
public class VistaTapa extends VistaPadre {
    Button btnAceptar;
    Button btnCancelar;
    Label cantidad;
    Label tipoDeTapa;
    TextField seleccionTipoDeTapa;
    TextField seleccionCantidad;
    HBox boxTipo;
    HBox boxCantidad;
    HBox boxBotones;

    public VistaTapa() {
        this.btnAceptar = new Button("Aceptar");
        this.btnCancelar = new Button("Cancelar");
        this.cantidad = new Label("Cantidad");
        this.tipoDeTapa = new Label("Tipo");
        this.seleccionTipoDeTapa = new TextField();
        this.seleccionCantidad = new TextField();
        this.boxTipo = new HBox();
        this.boxCantidad = new HBox();
        this.boxBotones = new HBox();
    }

    public Scene getScene() {
        return this.scene;
    }

    public Button getBtnAceptar() {
        return this.btnAceptar;
    }

    public Button getBtnCancelar() {
        return this.btnCancelar;
    }

    public void config() {
        this.boxTipo.getChildren().addAll(this.tipoDeTapa, this.seleccionTipoDeTapa);
        this.boxCantidad.getChildren().addAll(this.cantidad, this.seleccionCantidad);
        this.boxBotones.getChildren().addAll(this.btnAceptar, this.btnCancelar);
        this.contenido.getChildren().addAll(this.boxTipo, this.boxCantidad, this.boxBotones);
        this.contenedor.getChildren().add(this.contenido);
    }

}
