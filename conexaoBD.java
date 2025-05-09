import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;

public class conexaoBD {
    public static Connection conectar() {
        Connection conexao = null;

        try {
             Properties props = new Properties();
             props.load(new FileInputStream("config.properties"));

            String url = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String pass = props.getProperty("db.password");


            conexao = DriverManager.getConnection(url, user, pass);
            System.out.println("Conectado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        return conexao;
    }
}