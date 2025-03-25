# 🌸 Sobre o Projeto

Este projeto é um sistema de login desenvolvido em Java, utilizando Swing para a interface gráfica e PostgreSQL como banco de dados. O sistema permite que usuários façam login e, caso autenticados, sejam redirecionados para a tela de cadastro de produtos.

✨ Tecnologias Utilizadas

• Java (JDK 11 ou superior)

• Swing (Interface gráfica)

• JDBC (Conexão com banco de dados)

• PostgreSQL (Banco de dados)

• Apache Netbeans IDE (Pode ser usado Eclipse ou IntelliJ)

 
💻 Configuração do Banco de Dados

1. Instale o PostgreSQL e crie um banco de dados:

```CREATE DATABASE erp_aula;```

2. Crie a tabela de usuários:

```
CREATE TABLE usuarios (
    id SERIAL PRIMARY KEY,
    nome_completo VARCHAR(100) NOT NULL,
    senha VARCHAR(255) NOT NULL -- Deve ser armazenada com hash
);
```

3. Configure a conexão no arquivo ConexaoBanco.java:

```
private static final String URL = "jdbc:postgresql://localhost:5432/erp_aula";
private static final String USER = "seu_usuario";
private static final String PASSWORD = "sua_senha";
```

🌼 Como Executar o Projeto

1. Clone o repositório com o comando:

```
git clone https://github.com/seu-usuario/erp-aula.git
```

2. Abra o projeto em sua IDE favorita (como Eclipse ou IntelliJ).

3. Compile e execute a classe Login.java.

4. Faça login com um usuário cadastrado ou crie um novo.
