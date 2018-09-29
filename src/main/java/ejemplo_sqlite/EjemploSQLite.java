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
            this.connection = DriverManager.getConnection(url);
            this.statement = this.connection.createStatement();
            this.statement.executeUpdate("drop table if exists person");
            this.statement.executeUpdate("create table person (id integer, name string)");
            this.statement.executeUpdate("insert into person values(1, 'leo')");
            this.statement.executeUpdate("insert into person values(2, 'yui')");
            this.rs = this.statement.executeQuery("select * from person");
            this.rs.next();
            return this.rs.getString("name");
        } catch (Exception e) {
            Logger logger = Logger.getLogger(EjemploSQLite.class);
            logger.error(e.getMessage());
            return "fail";
        }
    }
}
