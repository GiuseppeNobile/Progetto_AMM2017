package amm.nerdbook;

import amm.nerdbook.classi.*;
import java.io.IOException;
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

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
    
        HttpSession session = request.getSession();
            
            if(request.getParameter("logout")!= null){
            
                session.invalidate();
                System.out.println("Non sei loggato");
            }
            else{
                
            }
    }
}
