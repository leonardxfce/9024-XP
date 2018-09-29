/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedra_papel_tijera;

import java.sql.*;

/**
 * @author caro_
 */
public class BaseDeDatos {
    public String conexionEjemplo(int puntaje) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:piedra_papel_tijera.db");
            Statement statement = connection.createStatement();
            statement.executeUpdate("drop table if exists usuario");
            statement.executeUpdate("create table usuario (nombre string,puntaje int)");
            statement.executeUpdate("insert into usuario values('usuario1'," + puntaje + ")");
            ResultSet rs = statement.executeQuery("select * from usuario");
            rs.next();
            return rs.getString("nombre");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return "fail";
    }

}
