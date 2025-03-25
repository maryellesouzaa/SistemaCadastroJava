package com.erp.aula;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioService {

    public void cadastrarUsuario(String nome, String senha, String cpf, String telefone, String sexo,
                                  String dataNascimento, String cidade, String estado, String endereco) {
        String sql = "INSERT INTO usuarios (nome, senha, cpf, telefone, sexo, data_nascimento, cidade, estado, endereco) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setString(1, nome);
            statement.setString(2, senha);
            statement.setString(3, cpf);
            statement.setString(4, telefone);
            statement.setString(5, sexo);
            statement.setDate(6, java.sql.Date.valueOf(dataNascimento));
            statement.setString(7, cidade);
            statement.setString(8, estado);
            statement.setString(9, endereco);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean verificarLogin(String cpf, String senha) {
        String sql = "SELECT * FROM usuarios WHERE cpf = ? AND senha = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setString(1, cpf);
            statement.setString(2, senha);
            
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
