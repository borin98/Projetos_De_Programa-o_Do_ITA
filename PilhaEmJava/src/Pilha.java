import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pilha
{

    private List< Livro > pilha = new ArrayList < Livro > ( ) ;

    public void adicionaNaPilha ( Livro livro )
    {

        this.pilha.add ( livro );

    }
    public void retiraElementoIndice ( int i )
    {

        Livro livro = new Livro ( "" ) ;
        livro = this.pilha.get ( i ) ;
        System.out.println("Índice retirado : "+i) ;
        System.out.println("Livro retirado : "+livro.getNomeLivro() );
        this.pilha.remove ( i ) ;

    }

    public void retiraTodosOsElementos (  )
    {

        int i = this.pilha.size() ;
        i -= 1 ;

        while ( !this.pilha.isEmpty() )
        {

            Livro livro = new Livro ( "" ) ;
            livro = pilha.get( i ) ;
            System.out.print("Elemento "+ ( i + 1 )+ " retirado : "+livro.getNomeLivro()+"\n" );
            pilha.remove ( i ) ;
            i-- ;

        }

    }

    public void retiraELementoAleatorio ( )
    {

        int tam = this.pilha.size ( ) ;
        tam -= 1 ;

        Random r = new Random ( ) ;

        int i = r.nextInt ( tam ) ;

        Livro livro = new Livro ( "" ) ;
        livro = this.pilha.get ( i ) ;

        System.out.println("Índice retirado : "+i) ;
        System.out.println("Livro retirado : "+livro.getNomeLivro() );

        this.pilha.remove ( i ) ;

    }

}
