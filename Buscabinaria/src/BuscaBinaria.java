import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BuscaBinaria
{

    public static int buscaBinaria ( ArrayList < Double > vetor, double elemento )
    {

        // definindo os índices iniciais do vetor
        int esquerda = 0 ;
        int direita = vetor.size() - 1 ;
        int meio = ( esquerda + direita ) / 2 ;

        while ( esquerda <= direita )
        {

            if ( vetor.get ( meio ) == elemento )
            {

                // ele retorna a posição onde se encontra o elemento do vetor
                return meio ;

            }

            else if ( vetor.get ( meio ) >= elemento )
            {

                direita -= 1 ;

            }

            else
            {

                esquerda += 1 ;

            }

            meio = ( direita + esquerda ) / 2 ;

        }

        // siginifica que ele não encontrou o elemento no vetor
        return -1 ;

    }

    public static void main ( String[] args )
    {

        ArrayList<Double> teste = new ArrayList<>() ;
        teste.add ( 2.7 ) ;
        teste.add ( 5.2 ) ;
        teste.add ( 10.0 ) ;

        int respo = buscaBinaria ( teste, 2.7 ) ;

        System.out.println(respo) ;

    }

}
