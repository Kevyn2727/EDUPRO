/*package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {
            String myBD = "jdbc:mysql://localhost:3306/sis_java?serverTimezone=UTC";
            //database-1.cf8bk6y6jikd.us-east-2.rds.amazonaws.com
            
            con = DriverManager.getConnection(myBD, "root", "");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }

}

*/
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {
            String myBD = "jdbc:mysql://database-2.cf8bk6y6jikd.us-east-2.rds.amazonaws.com:3306/sis_java?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD, "admin", "adminadmin");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
}

