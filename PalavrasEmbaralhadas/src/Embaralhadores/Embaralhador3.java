package Embaralhadores;

import java.util.Random;

public class Embaralhador3 extends Embaralhador1 implements Embaralhador
{

    @Override
    public int pegaIndiceAleatorio(int tam) {

        Random gerador = new Random ( ) ;
        tam -= 1 ;

        return gerador.nextInt ( tam ) ;

    }

    @Override
    public String funcao1(String palavra)
    {

        Random gerador = new Random ( ) ;

        String aux = "" ;

        //pode aver erros aqui
        int indice = gerador.nextInt ( ( palavra.length ( ) - 1 ) ) ;

        if ( indice%2 == 0 )
        {

            indice = indice/2 ;

        }

        else
        {

            indice += 1 ;
            indice = indice/2 ;

        }

        return aux + palavra.charAt ( indice ) ;

    }

    @Override
    public String funcao2(String palavra)
    {

        String aux = "" ;
        int tam = palavra.length ( ) - 1 ;
        int sair = 0 ;
        int metade = 0 ;

        // este é o caso quando o tamanho do vetor possui tamanho impar
        if ( palavra.length ( ) % 2 != 0 )
        {
            metade = ( palavra.length ( ) + 1 ) / 2 ;
            metade -= 1 ;

        }

        // caso quando o vetor possui tamanho par
        else
        {

            metade = palavra.length ( ) / 2 ;

        }

        for ( int i = 0; i < tam  && sair == 0; i++ )
        {

            if ( i == metade )
            {

                sair = 1 ;

                aux += palavra.charAt ( i ) ;

            }

            else
            {

                aux += palavra.charAt ( i ) + palavra.charAt ( ( tam - i ) ) ;

            }

        }

        return aux ;

    }

}
