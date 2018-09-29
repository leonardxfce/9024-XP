/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author lauta
 */
public class ModeloLogin {

    int id;
    String usuario;
    String password;
    String url;
    Connection connection;
    Statement statement;
    ResultSet rs;

    public ModeloLogin(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
        this.url = "jdbc:postgresql://pellefant.db.elephantsql.com:5432/prafqulb";

    }

    public String seleccionar() {
        try {
            this.connection = DriverManager.getConnection(this.url, "prafqulb", "M-dsT1RJ6AM7h17OM2PppJ2-Z5TPIQTc");
            this.statement = this.connection.createStatement();
            this.rs = this.statement.executeQuery("SELECT * FROM USUARIOS where USUARIO = '" + this.usuario + "' AND CONTRASENA = '" + this.password + "';");
            this.rs.next();
            return this.rs.getString("USUARIO");
        } catch (SQLException ex) {
            Logger.getLogger(ModeloLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void insertar() {
        try {

            this.connection = DriverManager.getConnection(this.url, "prafqulb", "M-dsT1RJ6AM7h17OM2PppJ2-Z5TPIQTc");
            this.statement = this.connection.createStatement();
            this.statement.executeUpdate("insert into USUARIOS values( 2,'" + this.usuario + "'," + this.password + ");");
        } catch (SQLException ex) {
            Logger.getLogger(ModeloLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar() {

    }

    public void modificar() {

    }
}
