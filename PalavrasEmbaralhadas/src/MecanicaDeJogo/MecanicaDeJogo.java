package MecanicaDeJogo;

import java.util.List;

public interface MecanicaDeJogo
{

    public abstract void fimJogo (  ) ;
    public abstract void acertouPalavra (List< String > listaPalavras, String palavra ) ;
    public abstract void pontuacao (  ) ;
    public abstract int tentativas (  ) ;

}
