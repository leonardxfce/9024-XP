package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample {

    public String conexionEjemplo() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:pepitoxd.db");
            Statement statement = connection.createStatement();
            statement.executeUpdate("drop table if exists person");
            statement.executeUpdate("create table person (id integer, name string)");
            statement.executeUpdate("insert into person values(1, 'leo')");
            statement.executeUpdate("insert into person values(2, 'yui')");
            ResultSet rs = statement.executeQuery("select * from person");
            rs.next();
            return rs.getString("name");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return "fail";
    }
}
