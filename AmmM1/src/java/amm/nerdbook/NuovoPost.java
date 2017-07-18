/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook;

import amm.nerdbook.classi.UtentiRegistratiFactory;
import amm.nerdbook.classi.Post;
import amm.nerdbook.classi.PostFactory;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nobinberg
 */
public class NuovoPost extends HttpServlet{
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session = request.getSession(false);
        
        if(session!=null && 
           session.getAttribute("loggedIn")!=null &&
           session.getAttribute("loggedIn").equals(true)){
        
           if(request.getParameter("thereIsPost")!=null)
            {
                
                String Postesistente = request.getParameter("Post esistente");
                String content = request.getParameter("textPost");
                String type = request.getParameter("postType");
                
                if(Postesistente.equals("needConfirm")){
                    request.setAttribute("content", content);
                    request.setAttribute("typePost", type);
                    request.setAttribute("newpost", "true");
                    request.getRequestDispatcher("nuovopost.jsp").forward(request, response);
                    return;
                    
                }else{
                        Post post = new Post();
                        post.setContenuto(content);
                    if(type.equals("textType")){
                        post.setPostTipo(Post.Tipo.TEXT);
                    }else{
                        post.setPostTipo(Post.Tipo.IMAGE);
                        }
                    
                    post.setUtente(UtentiRegistratiFactory.getInstance().getUtenteById((Integer)session.getAttribute("loggedUserID")));
                    
                    PostFactory.getInstance().addNewPost(post);
                    
                    request.getRequestDispatcher("Bacheca").forward(request, response);
                    }
            }else{
                    request.getRequestDispatcher("nuovopost.jsp").forward(request, response);
                    return;
                }
        }else{
                request.getRequestDispatcher("Login").forward(request, response);
            }
    }
    
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
}
