package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Otavio
 */
public class ConexaoTeste {

    public static Connection getConexao() {
        try {
            Connection connection;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientes_crud", "root", "");

            System.out.println("conectado com sucesso!");
            return connection;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados!\nErro: "+ e);
        }
        return null;
    }
}
