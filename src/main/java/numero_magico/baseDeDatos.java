/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero_magico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class baseDeDatos {
    public int conexionEjemplo(int vidas) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:numerosMagicos.db");
            Statement statement = connection.createStatement();
            statement.executeUpdate("drop table if exists person");
            statement.executeUpdate("create table person (id integer, vidas int)");
            statement.executeUpdate("insert into person values(1, "+vidas+")");
            ResultSet rs = statement.executeQuery("select * from person");
            rs.next();
            return rs.getInt("vidas");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return 0;
}

}