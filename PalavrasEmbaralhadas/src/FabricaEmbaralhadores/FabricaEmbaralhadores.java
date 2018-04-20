package FabricaEmbaralhadores;

import Embaralhadores.*;
import java.util.Random;

public class FabricaEmbaralhadores
{

    public Embaralhador1 tipoDeEmbaralhador ( )
    {

        Random gerador = new Random ( ) ;

        int tipo = gerador.nextInt ( 2 ) ;

        if ( tipo == 0 )
        {

            return new Embaralhador1 ( ) ;

        }

        else if ( tipo == 1 )
        {

            return new Embaralhador2 ( ) ;

        }

        else
        {

            return new Embaralhador3 ( ) ;

        }

    }

}
