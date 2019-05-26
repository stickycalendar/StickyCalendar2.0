package Clases;
import java.sql.*;
public class Conexion {
    public static Connection Conectar(){
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/NOMBRE DE LA BASE DE DATOS", "root", "");
            return cn;
        } catch(SQLException e){
            System.out.println("Error en conexion local" + e);
        }
        return (null);
    }
}
