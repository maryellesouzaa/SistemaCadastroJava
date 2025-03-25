package com.erp.aula;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/cadastropessoa"; // nome do banco
    private static final String URL_CADASTRO_PRODUTO = "jdbc:postgresql://localhost:5432/aula"; // nome do banco

    private static final String USER = "postgres"; // usuario postgres
    private static final String PASSWORD = "1234"; // senha postgres

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
