import java.util.List;
import java.util.Random ;

public class BancoDePalavras {

    public String retornaPalavra ( List<String> palavras, int tam )
    {

        if ( tam == 0 )
        {

            return palavras.get ( 0 ) ;

        }

        else
        {

            Random gerador = new Random();
            tam -= 1;

            tam = gerador.nextInt(tam);

            return palavras.get(tam);

        }

    }

}
