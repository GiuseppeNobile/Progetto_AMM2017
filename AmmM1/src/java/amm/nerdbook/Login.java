package amm.nerdbook;

import amm.nerdbook.classi.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giuseppe Nobile
 */

@WebServlet(name = "Login", urlPatterns = {"/login.jsp"}, loadOnStartup = 0)

public class Login extends HttpServlet {
      
    private static final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    private static final String DB_CLEAN_PATH = "../../web/WEB-INF/db/ammdb";
    private static final String DB_BUILD_PATH = "WEB-INF/db/ammdb";
    
    protected String username;
    protected String password;
    
    @Override
    public void init() {
        String dbConnection = "jdbc:derby:" + this.getServletContext().getRealPath("/") + DB_BUILD_PATH;
        try {
            Class.forName(JDBC_DRIVER);
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Connection string per le factory
        GruppiFactory.getInstance().setConnectionString(dbConnection);
        PostFactory.getInstance().setConnectionString(dbConnection);
        UtentiRegistratiFactory.getInstance().setConnectionString(dbConnection);
    }

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
            response.setContentType("text/html;charset=UTF-8");
            
            //creazione della sessione
            HttpSession session = request.getSession();
                       
            if(request.getParameter("logout")!= null){
            
                session.invalidate();
                request.getRequestDispatcher("login.jsp").forward(request, response);
                return;
            }
            
            if(session.getAttribute("loggedIn") != null &&
               session.getAttribute("loggedIn").equals(true)){
            
                request.getRequestDispatcher("Bacheca").forward(request, response);
                
                
            }else{
                username = request.getParameter("username");
                password = request.getParameter("password");            
            }
        }
    
    //Override dei metodi di HttpServlet
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Login";
    }

}