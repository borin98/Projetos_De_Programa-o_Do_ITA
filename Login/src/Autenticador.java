public class Autenticador
{

    public Usuario logar ( String login, String senha ) throws LoginException
    {
        // nome digitado
        if ( login.equals ( "borin" ) && senha.equals ( "12345" ) )
        {

            return new Usuario ( login ) ;

        }

        throw new LoginException ( "O Usuário está incorreto", login ) ;

    }

}
