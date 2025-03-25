package com.erp.aula;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    private static final String URL_CADASTRO_PESSOA = "jdbc:postgresql://localhost:5432/cadastropessoa"; // nome do banco
    private static final String URL_CADASTRO_PRODUTO = "jdbc:postgresql://localhost:5432/aula"; // nome do banco
    private static final String USER = "postgres"; // meu usuário
    private static final String PASSWORD = "1234"; // senha postgres

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL_CADASTRO_PESSOA, USER, PASSWORD);
    }
    
public static Connection getConexaoCadastroProduto() throws SQLException {
        return DriverManager.getConnection(URL_CADASTRO_PRODUTO, USER, PASSWORD);
    }
}
