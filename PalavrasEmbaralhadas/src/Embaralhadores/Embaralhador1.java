package Embaralhadores;

import java.util.Random;

public class Embaralhador1 implements Embaralhador {

    @Override
    public int pegaIndiceAleatorio ( int tam )
    {

        Random gerador = new Random ( ) ;
        tam -= 1 ;

        return gerador.nextInt ( tam ) ;

    }

    // esta função só pega uma única letra da string palavra
    @Override
    public String funcao1 ( String palavra )
    {

        Random gerador = new Random ( ) ;

        String aux = "" ;

        int indice = gerador.nextInt ( ( palavra.length ( ) - 1 )  ) ;
        return aux + palavra.charAt ( indice ) ;

    }

    // esta função vai concatenando o resto das palavras em uma única string
    @Override
    public String funcao2 ( String palavra )
    {
        Random gerador = new Random ( ) ;

        String aux = "" ;

        int indice = gerador.nextInt ( ( palavra.length ( ) - 1 )  ) ;

        if ( indice == ( palavra.length ( ) - 1 )  )
        {

            aux = palavra ;

        }

        else
        {

            while ( indice < palavra.length ( ) )
            {

                aux += palavra.charAt ( indice ) ;

                indice ++ ;

            }

        }

        return aux ;

    }
}