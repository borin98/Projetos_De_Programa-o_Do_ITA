package Embaralhadores;

import java.util.Random;

public class Embaralhador2 extends Embaralhador1 implements Embaralhador {

    @Override
    public int pegaIndiceAleatorio ( int tam )
    {

        Random gerador = new Random ( ) ;
        tam -= 1 ;

        return gerador.nextInt ( tam ) ;

    }

    // esta funcao só pega as letras pares da string
    @Override
    public String funcao1 ( String palavra )
    {

        Random gerador = new Random ( ) ;

        String aux = "" ;

        //pode aver erros aqui
        int indice = gerador.nextInt ( ( palavra.length ( ) - 1 ) ) ;

        if ( indice == palavra.length ( ) )
        {

            aux = palavra ;

        }

        else
        {

            if ( indice%2 == 0 )
            {

                while ( indice < palavra.length ( ) )
                {

                    aux += palavra.charAt ( indice ) ;

                    indice += 2 ;

                }

            }

            else
            {

                while ( indice < palavra.length ( ) )
                {

                    aux += palavra.charAt ( indice ) ;

                    indice ++ ;

                }

            }

        }

        return aux ;

    }

    @Override
    public String funcao2(String palavra)
    {

        Random gerador = new Random ( ) ;

        String aux = "" ;

        //pode aver erros aqui
        int indice = gerador.nextInt ( ( palavra.length ( ) - 1 )  ) ;

        if ( indice == palavra.length ( ) )
        {

            aux = palavra ;

        }

        else
        {

            if ( indice%2 == 0 )
            {

                while ( indice >= 0 )
                {

                    aux += palavra.charAt ( indice ) ;

                    indice -= 2 ;

                }

            }

            else
            {

                while ( indice >= 0 )
                {

                    aux += palavra.charAt ( indice ) ;

                    indice -= 1 ;

                }

            }

        }

        return aux ;

    }

}
