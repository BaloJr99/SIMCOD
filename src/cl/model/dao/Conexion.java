/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Angel
 */
public class Conexion {
     private String bd="restaurante";
    private String user="sa";       /*  Usuario de cada quien */ 
    //private String password="Angel123"; /* Contraseña de cada quien */ /* "cheche123";*/
    //private String url="jdbc:sqlserver://LAPTOP-9M1FS39R\\SQLSERVER272:1433;databaseName="+bd;
    private String password="Pirata99*"; /* Contraseña de cada quien */ /* "cheche123";*/
    private String url="jdbc:sqlserver://BALOJR999\\SQLSERVER267:1433;databaseName="+bd;
    //private String password="czenia2000"; /* Contraseña de cada quien */ /* "cheche123";*/
    //private String url="jdbc:sqlserver://DESKTOP-CZENIA\\SQLSERVER268:1433;databaseName="+bd;
   // private String password="Tec123_";
   // private String url="jdbc:sqlserver://DESKTOP-9Q77JE2\\SQLSERVER265:1433;databaseName="+bd;
    //Importar la clase Connection
    private Connection con=null;
    
    public Conexion(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerConnection");
            this.con=(Connection)DriverManager.getConnection(url,user,password);
            System.out.println("Conexion a la base de datos "+url+ "...ok");
        }catch (Exception e){
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
    }
    public Connection getCon(){
        return con;
    }
    public void setCon(Connection con){
        this.con=con;
    }  
}
