package MecanicaDeJogo;

import java.util.List;

public final class MecanicaDeJogo1 implements MecanicaDeJogo
{

    private int tamanhoLista, pontuacaoTotal, pontuacaoAtual = 0, maxTentativa, tentativa = 0 ;
    private boolean acertouPalavra = false, fimJogo = false, perdeu = false ;

    public boolean isAcertouPalavra ( )
    {

       return this.acertouPalavra ;

    }

    public boolean isFimJogo ( )
    {

        return this.fimJogo ;

    }

    public MecanicaDeJogo1 ( int tamanhoLista )
    {

        this.tamanhoLista = tamanhoLista ;
        this.pontuacaoTotal = tamanhoLista*2 ;

        if ( tamanhoLista %2 == 0 )
        {

            this.maxTentativa = tamanhoLista/2 ;

        }

        else
        {

            this.maxTentativa = ( tamanhoLista + 1 )/2 ;

        }

    }

    @Override
    public void fimJogo (  )
    {

        if ( this.pontuacaoAtual >= this.pontuacaoTotal )
        {

            this.fimJogo = true ;

        }

        this.fimJogo = false ;

    }

    @Override
    public final void acertouPalavra ( List<String> listaPalavras, String palavra )
    {

        if ( listaPalavras.equals ( palavra ) )
        {

            this.acertouPalavra = true ;

        }

        this.pontuacao ( ) ;

    }

    @Override
    public final void pontuacao ( )
    {
        //vendo se o jogo acabou, seja porque ele perdeu ou ganhou
        if ( this.fimJogo )
        {

            if ( this.tentativa <= this.maxTentativa )
            {

                System.out.println("Parabéns, você ganhou o jogo !!!");

            }

            else
            {

                System.out.println("Mais sorte na próxima vez, você perdeu o jogo !!!");

            }

        }

        //caso em que ele acerta qual é a palavra que deve ser adivinhada
        else if ( this.acertouPalavra )
        {

            this.pontuacaoAtual += 1 ;

        }

        //caso em que ele analisa quando ele erra a palavra
        else
        {

          this.tentativa += this.tentativas ( ) ;

        }

        this.acertouPalavra = false ;

    }

    @Override
    public final int tentativas (  )
    {

        if ( this.tentativa <= this.maxTentativa )
        {

            this.tentativa += 1 ;

        }

        return this.tentativa ;

    }
}
