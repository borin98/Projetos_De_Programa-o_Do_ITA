import java.util.Scanner;

//Quando utilizar o throws, sempre precisarei indicar por quais funções o mesmo fará estas comparações
// a função try já para o código no caso de entrar ela, evitando que o erro se extenda ao longo do programa
public class OutrosMetodos
{

    public static void funcao1 ( int a )
    {

        System.out.println("Executando a funcao1 com "+a) ;

        try {

            funcao2 ( a ) ;

        } catch  ( Exception e ){

            System.out.println("Tratando a exceção : "+e.getMessage() ) ;

        }

        System.out.println("Terminando a execução da função1") ;

    }

    public static void funcao2 ( int i ) throws Exception
    {

        System.out.println("Executando funcao2 com "+i) ;


        // caso ele caia nesta função, ele não executará mais o código
        if ( i < 0 )
        {

            throw new Exception("Mensagem De Erro");

        }

        System.out.println("Termiando a execução da funcao2");

    }

    public static void main(String[] args)
    {

        Scanner ler = new Scanner ( System.in ) ;

        System.out.print("Digite o valor para jogar na função : ") ;
        int valor = ler.nextInt ( ) ;

        funcao1( valor ) ;
        System.out.println("Executando a funcao main");
    }

}
