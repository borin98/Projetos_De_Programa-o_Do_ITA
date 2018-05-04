import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List ;

public class UsuarioDao
{

    static
    {

        try
        {

            // é apenas um exemplo que não adicioneio o banco de dados, serve mais de uma representação do que fazer
            Class.forName ( "org.postgreesql.Driver" ) ;

        }catch ( ClassNotFoundException e )
        {

            e.printStackTrace();

        }

    }

    public static List < Usuario > todosUsuario()
    {

        List < Usuario > todos = new ArrayList<>() ;

        // criando a connection do banco de dados
        try (Connection c = DriverManager.getConnection (
                "jdbc:postgresql://localhost/usuarios", "postgrees", "admin" ) )
        {

        }catch ( SQLException e )
        {

            throw new RuntimeException("Não foi possível realizar o acesso ao banco de dados", e) ;

        }

        return todos ;

    }
}
