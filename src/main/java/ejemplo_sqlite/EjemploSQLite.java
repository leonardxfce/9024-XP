package ejemplo_sqlite;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EjemploSQLite {

    Connection connection;
    Statement statement;
    ResultSet rs;

    public String conexionEjemplo(String url) {
        try {
            connection = DriverManager.getConnection(url);
            statement = connection.createStatement();
            statement.executeUpdate("drop table if exists person");
            statement.executeUpdate("create table person (id integer, name string)");
            statement.executeUpdate("insert into person values(1, 'leo')");
            statement.executeUpdate("insert into person values(2, 'yui')");
            rs = statement.executeQuery("select * from person");
            rs.next();
            return rs.getString("name");
        } catch (Exception e) {
            Logger logger = Logger.getLogger(EjemploSQLite.class);
            logger.error(e.getMessage());
            return "fail";
        }
    }
}
