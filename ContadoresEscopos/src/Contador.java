public class Contador
{

    private int numeroAtual = 0 ;
    private String nome ;

    public Contador ( String nome )
    {

        this.nome = nome ;

    }

    public void contar ( )
    {

        this.numeroAtual++ ;

    }

    @Override
    public String toString()
    {

        return this.nome + " = " +
                this.numeroAtual ;
    }
}
