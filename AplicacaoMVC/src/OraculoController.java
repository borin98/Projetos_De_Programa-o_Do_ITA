import Objetos.Oraculo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/oraculoController")
public class OraculoController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        //pegaremos o parâmetro e chamar a regra de negócios, passando o controle para um view

        //pegando o parâmetro
        String tipoProduto = request.getParameter("produto") ;

        //chamando a regra de negócios
        Oraculo oraculo = new Oraculo() ;
        List<String> produtos = oraculo.melhoresProdutos(tipoProduto) ;

        // passando o controle para um view
        request.setAttribute("produtos", produtos) ;
        request.getRequestDispatcher("resposta.jsp").forward(request, response) ;

    }

}
