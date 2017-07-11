/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook;

import amm.nerdbook.classi.Post;
import amm.nerdbook.classi.PostFactory;
import amm.nerdbook.classi.UtentiRegistrati;
import amm.nerdbook.classi.UtentiRegistratiFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nobinberg
 */
@WebServlet(name = "Bacheca", urlPatterns = {"/bacheca.jsp"})
public class Bacheca extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session = request.getSession(false);
        
        if(session != null && session.getAttribute("loggedIn") != null && session.getAttribute("loggedIn").equals(true)){
            
            String user = request.getParameter("user");
            
            int userID;
            
            if(user != null){
                userID = Integer.parseInt(user);
            }else{
                Integer loggedUserID = (Integer)session.getAttribute("loggedUserID");
                userID = loggedUserID;
            }
            
            UtentiRegistrati utente = UtentiRegistratiFactory.getInstance().getUtenteById(userID);
            
            if(utente != null){
                request.setAttribute("utente", utente);
                
                List<Post> posts = PostFactory.getInstance().getPostList(utente);
                request.setAttribute("posts", posts);
                
                request.getRequestDispatcher("bacheca.jsp").forward(request, response);
            }else{
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
            
            
        }
    }
    //Override dei metodi
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
        return "Bacheca";
    }

}
