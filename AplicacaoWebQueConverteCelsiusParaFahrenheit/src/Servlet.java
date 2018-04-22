import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/op")
public class Servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String n1 = request.getParameter("tIC");

        String n2 = request.getParameter("tIF");

        int tempInicial;
        int tempFinal = 0;

        response.setContentType("text/html;charset=UTF-8");

        // caso para celcius à fahrenheit
        if ( !n1.isEmpty() )
        {

            tempInicial = Integer.parseInt ( request.getParameter ( "tIC" ) ) ;
            tempFinal = ( ( tempInicial*9 )/5 ) + 32 ;

        }

        // caso para fahrenheit à celcius
        else
        {

            tempInicial = Integer.parseInt ( request.getParameter ( "tIF" ) ) ;
            tempFinal = ( ( tempInicial - 32 )*5 )/9 ;

        }

        try ( PrintWriter out = response.getWriter() )
        {

            out.println("<!DOCTYPE html>") ;
            out.println("<html>") ;
            out.println("<head>");
            out.println("<title> Resultado da Conversão </title>") ;
            out.println("</head>");
            out.println("<body>");

            if ( !n1.isEmpty() )
            {

                out.println("<h1> O resultado é : "+tempFinal+ " F") ;

            }

            else
            {

                out.println("<h1> O resultado é : "+tempFinal+ " C") ;

            }

            out.println("</body>");
            out.println("</html>");

        }

    }
}