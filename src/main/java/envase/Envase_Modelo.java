/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package envase;

import ejemplo_sqlite.EjemploSQLite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.log4j.Logger;

/**
 *
 * @author caro_
 */
public class Envase_Modelo {

    Connection connection;
    Statement statement;
    ResultSet rs;

    String nombre;
    String tipo;
    String material;
    int capacidad;

   
    
    public void insert(String url) {
        try {
            connection = DriverManager.getConnection(url);
            statement = connection.createStatement();
            statement.executeUpdate("drop table if exists envase");
            statement.executeUpdate("create table envase (nombre string, tipo string, material string, capacidad int)");
            statement.executeUpdate("insert into envase values(" + nombre + ", " + tipo + ", " + material + ", " + capacidad + ")");
        } catch (Exception e) {
            Logger logger = Logger.getLogger(EjemploSQLite.class);
            logger.error(e.getMessage());
        }
    }

    //setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
