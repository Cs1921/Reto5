package com.mycompany.reto5.modelo.DAO;

import java.sql.*;

public class Conexion {

    Connection conectar = null;

    public Connection conectar() {
        try {
            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection("jdbc:sqlite:ProyectosConstruccion.db");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conectar;
    }

}
