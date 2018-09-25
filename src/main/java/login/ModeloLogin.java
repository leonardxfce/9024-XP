/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lauta
 */
public class ModeloLogin {
    int id;
    String usuario;
    String password;
    String url;
    Connection connection;
    Statement statement;
    public ModeloLogin(String usuario,String password){
    this.usuario = usuario;
    this.password = password;
    this.url = "jdbc:sqlite:sample.db";
    
    
    }
    public void seleccionar(){
        
    }
    public void insertar(){
        try {
            connection = DriverManager.getConnection(url);
            statement = connection.createStatement();
            statement.executeUpdate("insert into USUARIOS values(1, '"+usuario+"','"+password+"')");
        } catch (SQLException ex) {
            Logger.getLogger(ModeloLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminar() {
        
    }
    public void modificar() {
        
    }
}
