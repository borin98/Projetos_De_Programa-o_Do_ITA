import org.junit.Test;

import static org.junit.Assert.*;

public class TesteAutenticadorTest
{

    @Test
    public void loginComSucesso (  ) throws LoginException
    {

        Autenticador aut = new Autenticador ( ) ;

        Usuario usu = aut.logar ( "borin", "12345" ) ;

        assertEquals ( "borin", usu.getLogin ( ) ) ;

    }

    // esta função espera que ocorra este tipo de excessão ou não ocorra para ser considerado como certo neste teste
    @Test ( expected = LoginException.class )
    public void loginComFalha (  ) throws LoginException
    {

        Autenticador aut = new Autenticador ( ) ;
        Usuario usu = aut.logar ( "Borin", "12345" ) ;

        assertEquals ( "borin", usu.getLogin ( ) ) ;

    }

    // esta função espera que ocorra e excessão, caso ela não ocorra, não passará no teste
    @Test
    public void informacaoDoErro (  )
    {

        Autenticador aut = new Autenticador ( ) ;
        try
        {

            Usuario usu = aut.logar ( "borin", "aaa" ) ;
            fail ( ) ;

        } catch (LoginException e) {

            assertEquals ( "borin", e.getLogin ( ) ) ;

        }

    }
}