package Clases;
import java.sql.*;
public class Conexion {
    public static Connection Conectar(){
        String dbURL = "jdbc:mysql://localhost/bd_sc?useTimezone=true&serverTimezone=UTC";
        try{
            Connection cn = DriverManager.getConnection(dbURL, "root", "");
            return cn;
        } catch(SQLException e){
            System.out.println("Error en conexion local" + e);
        }
        return (null);
    }
}
