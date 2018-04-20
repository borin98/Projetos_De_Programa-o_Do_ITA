public class Principal
{
    //perceba que esta função não olha para todos os objetos, apenas os printam na tela
    public static void sons ( Barulhento [] barulhentos )
    {

        for ( Barulhento b : barulhentos )
        {

            System.out.println(b.fazerBarulho());

        }

    }

    public static void main ( String [] args )
    {

        Barulhento[] barulhentos = new Barulhento[3] ;

        barulhentos [0] = new Cachorro ( ) ;
        barulhentos [1] = new Carro ( ) ;
        barulhentos [2] = new Bateria ( ) ;

        sons ( barulhentos ) ;

    }

}
