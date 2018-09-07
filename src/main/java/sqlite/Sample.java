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
      // create a database connection
      connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
      Statement statement = connection.createStatement();
      statement.setQueryTimeout(30); // set timeout to 30 sec.
      statement.executeUpdate("drop table if exists person");
      statement.executeUpdate("create table person (id integer, name string)");
      statement.executeUpdate("insert into person values(1, 'leo')");
      statement.executeUpdate("insert into person values(2, 'yui')");
      ResultSet rs = statement.executeQuery("select * from person");
      rs.next();
      return rs.getString("name");
    } catch (SQLException e) {
      // if the error message is "out of memory",
      // it probably means no database file is found
      System.err.println(e.getMessage());
    } finally {
      try {
        if (connection != null)
          connection.close();
      } catch (SQLException e) {
        // connection close failed.
        System.err.println(e);
      }
    }
    return "fail";
  }
}