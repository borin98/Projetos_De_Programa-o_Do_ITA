import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/op")
public class ContarServlet extends HttpServlet
{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        // estamos verificando se não existe o escopo de cada objeto, para que assim criarmos novos objetos a partir disso
        response.setContentType("text/html;charset=UTF-8");
        // para o request
        if ( request.getAttribute ("contador" ) == null )
        {

            request.setAttribute ( "contador", new Contador ( "request" ) ) ;

        }

        ( ( Contador )request.getAttribute ( "contador" ) ).contar();

        // para a session
        if ( request.getSession().getAttribute ("contador" ) == null )
        {

            request.getSession().setAttribute ( "contador", new Contador ( "session" ) ) ;

        }

        ( ( Contador )request.getSession().getAttribute ( "contador" ) ).contar();

        // para o aplication

        // request
        if ( getServletContext().getAttribute ("contador" ) == null )
        {

            getServletContext().setAttribute ( "contador", new Contador ( "aplication" ) ) ;

        }

        ( ( Contador )getServletContext().getAttribute ( "contador" ) ).contar();

        try ( PrintWriter pw = response.getWriter ( ) ) {
            pw.println("<html>");
            pw.println("<body>");
            pw.println("<h1>" + request.getAttribute("contador") + "</h1>");
            pw.println("<h1>" + request.getSession().getAttribute("session") + "</h1>");
            pw.println("<h1>" + getServletContext().getAttribute("aplication") + "</h1>");
            pw.println("</body>");
            pw.println("</html>");
        }
    }

}
