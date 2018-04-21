import java.util.Scanner;

public class Principal
{

    public static void retiraElementosAleatorios ( Pilha pilha )
    {

        System.out.println("\n////////// Retirando um elemento aleatório da pilha //////////\n") ;
        pilha.retiraELementoAleatorio();

    }

    public static void retiraElementoIndice ( Pilha pilha, Scanner ler )
    {

        System.out.println("\n////////// Retirando um livro da pilha //////////\n") ;

        int elemento ;

        do {

            System.out.print("Digite o índice de qua é o livro que deseja retira : ") ;
            elemento = ler.nextInt ( ) ;

            if ( elemento < 0 )
            {

                System.out.println("\nValor inválido !!!\n") ;

            }

        }while ( elemento < 0 ) ;

        pilha.retiraElementoIndice ( elemento ) ;

    }

    public static void retiraTodosOsElementos ( Pilha pilha )
    {

        System.out.println("\n////////// Retirando todos os elementos da pilha //////////\n") ;

        pilha.retiraTodosOsElementos ( ) ;

    }

    public static void main(String[] args)
    {

        Scanner lerString = new Scanner ( System.in ) ;
        Scanner lerInt = new Scanner ( System.in ) ;

        Pilha pilha = new Pilha ( ) ;

        int quantidadeELementos ;
        int opcao ;

        do {

            System.out.print("Digite quantos elementos deseja adicionar na pilha : ") ;
            quantidadeELementos = lerInt.nextInt ( ) ;

            if ( quantidadeELementos <= 0 )
            {

                System.out.println("\nValor inválido !!!") ;

            }

        }while ( quantidadeELementos <= 0 ) ;

        System.out.println("\n");

        for ( int i = 0; i < quantidadeELementos; i++ )
        {

            System.out.printf("Digite o nome do livro %d que deseja adicionar na pilha : ", ( i + 1 ) ) ;
            String nomeLivro = lerString.nextLine() ;

            Livro livro = new Livro ( nomeLivro ) ;
            pilha.adicionaNaPilha ( livro ) ;

        }

        do{

            System.out.println("\nDigite qual é a função que deseja utilizar\n") ;
            System.out.println("0 para retirar elementos aleatórios") ;
            System.out.println("1 para retirar elemento por índice ");
            System.out.println("2 para retirar todos os elementos") ;
            System.out.print("\nResposta : ");
            opcao = lerInt.nextInt() ;

            if ( opcao < 0 || opcao > 2 )
            {

                System.out.println("Valor inválido !!!!") ;

            }

        }   while ( opcao < 0 || opcao > 2  ) ;


        switch ( opcao )
        {

            case 0 :
                retiraElementosAleatorios ( pilha ) ;
                break;

            case 1 :
                retiraElementoIndice ( pilha, lerInt ) ;
                break;

            case 2 :
                retiraTodosOsElementos ( pilha ) ;
                break;
        }

    }

}
