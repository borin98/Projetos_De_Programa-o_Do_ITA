public class LoginException extends Exception
{

    public String login ;

    /**
     *Fazendo o tratamento de erro
     * Aqui, extendemos a classe Exception para fazermos o tratamento de erro da excessão
     */
    public LoginException ( String message, String login )
    {

        super ( message ) ;

        this.login = login ;

    }

    // esta função ve se o login foi realmente autenticado
    public String getLogin ( )
    {
        return login;
    }
}
