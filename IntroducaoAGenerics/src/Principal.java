import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal
{

    public static void frutasNormais (Cesta<Fruta> frutaCesta, int tam, Scanner leitura  )
    {

        for ( int i = 0; i < tam; i++  )
        {

            System.out.printf("Digite nome da fruta %d que deseja adicionar : ", ( i + 1 ) ) ;
            String nome = leitura.next ( ) ;

            Fruta fruta = new Fruta ( nome ) ;
            frutaCesta.adiciona ( fruta ) ;

            /* perceba que neste caso abaixo ele não aceitará a estrutura
                frutaCesta.adiciona("Açai")
             */

        }

    }

    public static void frutasVermelhas ( List<FrutasVermelhas> vermelhas  , int tam, Scanner leitura )
    {

        for ( int i = 0; i < tam; i++  ) {

            System.out.printf("Digite nome da fruta vermelha %d que deseja adicionar : ", (i + 1));
            String nome = leitura.next();
            FrutasVermelhas frutasVermelhas = new FrutasVermelhas(nome);
            vermelhas.add ( frutasVermelhas ) ;
        }
    }

    public static int confirmaNumeroPositivo( Scanner leitura )
    {

        int valor ;

        do {

            System.out.print("\nDigite quantas frutas você deseja adicionar : ") ;
            valor = leitura.nextInt() ;

            if ( valor <= 0)
            {

                System.out.println("\nValor Inválido !!!") ;

            }


        } while ( valor <= 0 ) ;

        return valor ;

    }

    public static void main(String[] args)
    {

        Scanner leitura = new Scanner(System.in) ;

        Cesta<Fruta> frutaCesta = new Cesta<Fruta>() ;

        List<FrutasVermelhas> frutasVermelhas = new ArrayList<FrutasVermelhas>() ;

        int tam = 0 ;
        int frutasVermelhasTam ;

        tam = confirmaNumeroPositivo ( leitura ) ;
        frutasNormais( frutaCesta, tam, leitura ) ;

        System.out.println("\n////////// Para Frutas Vermelhas //////////\n");

        frutasVermelhasTam = confirmaNumeroPositivo ( leitura ) ;
        frutasVermelhas ( frutasVermelhas, frutasVermelhasTam, leitura ) ;

        // perceba que este método só irá funcionar se usarmos o coringa ? para indicar que ele pode adicionar objetos por herança
        frutaCesta.adicionaTodos ( frutasVermelhas ) ;

        while ( frutaCesta.temItens() )
        {

            System.out.println( frutaCesta.retira()+"\n" ) ;

        }

    }

}
