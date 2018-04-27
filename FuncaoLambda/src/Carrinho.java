import java.util.List;

public class Carrinho
{

    private List<Produto> produtos ;

    public Carrinho(List<Produto> produtos)
    {
        this.produtos = produtos;
    }

    public void darDesconto ( float porcentagem, Condicao < Produto > condicao )
    {

        for ( Produto p : produtos )
        {

            if ( condicao.incluir ( p ) )
            {

                p.setValor( p.getValor() - ( p.getValor ( ) * porcentagem ) ) ;

            }

        }

    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
