package amm.nerdbook;

import amm.nerdbook.classi.*;
import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Giuseppe Nobile
 */
@WebServlet(name = "Profilo", urlPatterns = {"/profilo.jsp"})
public class Profilo extends HttpServlet {
    
    protected String nome;
    protected String cognome;
    protected String url;
    protected String data;
    protected String password;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
    
        HttpSession session = request.getSession();
            
            if(request.getParameter("logout")!= null){
            
                session.invalidate();
                System.out.println("Accesso negato");
            }
            else{
                nome = request.getParameter("nome");
                cognome = request.getParameter("cognome");
                url = request.getParameter("url");
                data = request.getParameter("data");
                password = request.getParameter("password");
            }
    }
}
