import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal
{

    private static int verificaValor (  )
    {

        Scanner lerInt = new Scanner ( System.in ) ;
        int valor ;

        do {

            System.out.print("\nDigite quantos elementos deseja colocar na lista : ") ;
            valor = lerInt.nextInt ( ) ;

            if ( valor <= 0 )
            {

                System.out.println("Valor inválido !!!") ;

            }

        }while ( valor <= 0 ) ;

        return valor ;
    }

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>() ;
        Scanner lerString = new Scanner ( System.in ) ;
        Scanner lerInt = new Scanner ( System.in ) ;
        int tam ;
        tam = verificaValor() ;
        float aux;

        for ( int i = 0; i < tam; i ++ )
        {

            System.out.printf("Digite o nome do produto %d : ", ( i + 1 ) ) ;
            String nome = lerString.next ( ) ;

            System.out.printf("\nDigite o valor do produto %d R$ : ", ( i + 1 ) );
            float preco = lerInt.nextFloat() ;

            produtos.add ( new Produto ( nome, preco ) ) ;
            System.out.println("\n");
        }

        do {

            System.out.print("Digite quanto de desconto deseja dar para cada produto : ") ;
            aux = lerInt.nextInt() ;

            if ( aux > 100 )
            {

                System.out.println("Valor inválido !!!") ;

            }


        } while ( aux > 100 ) ;

        float desconto =  aux/100 ;

        Carrinho c = new Carrinho ( produtos ) ;

        System.out.println("\n");

        System.out.println("Antes do desconto : ") ;
        c.getProdutos().forEach ( System.out::println ) ;

        // aplicando o desconto no produto
        c.darDesconto ( desconto, p -> p.getValor() >= 100 ) ;

        System.out.println("\nOs elementos dentro da lista e com desconto de "+( desconto*100) +"% são : ") ;
        // chama o método da função toString dentro do objeto Produtos
        produtos.forEach ( p -> System.out.println(p) ) ;

    }

}
