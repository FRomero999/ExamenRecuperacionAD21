package com.paco.examenrecuperaciondatos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBManager {
    
    private Connection conn;

    // consultas
    private static final String listadoEstado = "SELECT * FROM biblioteca WHERE estado=?";
    private static final String prestarLibro = "UPDATE biblioteca SET estado='prestado' WHERE id=?";
    private static final String devolverLibro = "UPDATE biblioteca SET estado='disponible' WHERE id=?";

    
    public DBManager() {
    }

    // Método para iniciar la conexión con la base de datos
    public void startConnection() {
        try {
            // Carga y lectura del archivo con los datos de la conexión
            Properties params = new Properties();
            params.load(new FileReader("bbdd.cfg"));

            String protocol = params.getProperty("protocol");
            String server = params.getProperty("server");
            String port = params.getProperty("port");
            String database = params.getProperty("database");
            String extra = params.getProperty("params");
            String user = params.getProperty("user");
            String password = params.getProperty("password");
            // Creación url de la conexión
            String url = protocol + server + ":" + port + "/" + database + "?" + extra;
            // Creación de la conexión
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión con la base de datos establecida.");
        } catch (FileNotFoundException | SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<models.Libro> listarPorEstado(String estado) {

        ArrayList<models.Libro> libros = new ArrayList<models.Libro>();
        
        try {

            /* 
               TO DO 
               ...
            */
            
        } catch (SQLException ex) {
            System.out.println("EXCEPCIÓN");
            System.out.println(ex.toString());
        }
        return libros;
    }

    public void prestar(Integer id) {
        try {

            /* 
               TO DO 
               ...
            */            
            
        } catch (SQLException ex) {
            System.out.println("EXCEPCIÓN");
            System.out.println(ex.toString());
        }
    }

    public void devolver(Integer id) {
        try {
            
            /* 
               TO DO 
               ...
            */
            
        } catch (SQLException ex) {
            System.out.println("EXCEPCIÓN");
            System.out.println(ex.toString());
        }
    }
    
    
    // Método para cerrar la conexión
    public void endConnection() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("EXCEPCIÓN");
            System.out.println(ex.toString());
        }

    }
}

    

