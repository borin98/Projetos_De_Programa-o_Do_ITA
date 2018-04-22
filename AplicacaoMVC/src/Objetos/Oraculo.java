package Objetos;

import java.util.ArrayList;
import java.util.List;

public class Oraculo
{

    public List<String> melhoresProdutos ( String tipo )
    {

        List < String > lista = new ArrayList<>() ;

        if ( tipo.equals("doce de leite") )
        {

            lista.add("Viçosa") ;
            lista.add("Boreal") ;

        }

        else if ( tipo.equals("queijo mineiro") )
        {

            lista.add("Candido Tostes") ;
            lista.add("Humaitá") ;

        }

        return lista ;

    }

    public void printLista ( List<String> lista )
    {

        for ( int i = 0; i < lista.size(); i++ )
        {

            System.out.println( lista.get ( i ) ) ;

        }

    }

}
