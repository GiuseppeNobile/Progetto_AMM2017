/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook;

import amm.nerdbook.classi.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Giuseppe Nobile
 */

public class Login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
            response.setContentType("text/html;charset=UTF-8");
            
            HttpSession session = request.getSession();
            
            if(request.getParameter("logout")!= null){
            
                session.invalidate();
                request.getRequestDispatcher("login.jsp").forward(request, response);
                return;
            }
            
            if(session.getAttribute("loggedIn") != null &&
               session.getAttribute("loggedIn").equals(true)) {
            
                request.getRequestDispatcher("Bacheca").forward(request, response);
                return;
                
            }else{
                
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                
            
            }
        }
}