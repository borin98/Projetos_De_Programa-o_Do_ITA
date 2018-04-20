/****
 *  Comentários gerais sobre o programa :
 *
 *  1 - V A lógida do BancoDePalavras está funcionando perfeitamente
 *  2 - V A FábricaEmbaralhadores está funcionando perfeitamente e retornando o embaralhador sem nenhum erro
 *  3 - V a lógica dos embaralhadores estão perfeita !!
 *  4 - F falta fazer testes com as mecânicas de jogo
 *  5 - F falta implementar o resto da mecânica de jogo
 *  6 - F preciso dar funcionalidade pro BancoDePalavras
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import MecanicaDeJogo.* ;
import FabricaEmbaralhadores.FabricaEmbaralhadores ;
import Embaralhadores.* ;

public class Main
{

    public static void main(String[] args)
    {

        Scanner in = new Scanner ( System.in ) ;

        boolean erro = false ;
        boolean acertouPalavra = false ;
        int tam = 0 ;
        String palavraAleatoria = "" ;
        String resp = "" ;

        FabricaEmbaralhadores fe = new FabricaEmbaralhadores ( ) ;
        Embaralhador1 embaralhador = new Embaralhador1() ;

        BancoDePalavras ba = new BancoDePalavras ( ) ;

        List <String> palavras = new ArrayList<String>() ;

        do{

            System.out.print("Digite o tamanho do vetor : ");

            tam = in.nextInt();

            if ( tam < 0 )
            {

                System.out.println("\nValor inválido !!") ;
                System.out.println("\nDigite um valor maior do que zero !!!");

            }

        }while ( tam < 0 ) ;

        for ( int i = 0; i < tam; i ++ )
        {

            System.out.printf("Digite o nome da palavra %d : ", ( i + 1 ) ) ;

            String pal = in.nextLine() ;
            palavras.add( pal ) ;

        }

        MecanicaDeJogo1 mDJ = new MecanicaDeJogo1 ( tam ) ;

        boolean jooj = mDJ.isFimJogo ( ) ;


        // jooj == false
        while ( !jooj )
        {

            palavraAleatoria = ba.retornaPalavra ( palavras, tam ) ;
            embaralhador = fe.tipoDeEmbaralhador() ;

            System.out.println("Adivinhe qual é a palavra que eu estou pensado !!! ") ;
            System.out.print("Sua resposta : ") ;
            resp = in.next() ;

            mDJ.acertouPalavra ( palavras, resp ) ;

            if ( acertouPalavra )
            {

                System.out.println("Parabêns seu animal") ;

            }

            else
            {

                System.out.println("Tu é muito burro");

            }

        }


    }

}
