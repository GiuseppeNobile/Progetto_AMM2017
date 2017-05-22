package amm.nerdbook.classi;

import java.util.ArrayList;
import java.util.List;
import amm.nerdbook.classi.UtentiRegistratiFactory;
/**
 *
 * @author Giuseppe Nobile
 */
public class PostFactory {
    
    String connectionString;
    private static PostFactory singleton;
    
    public static PostFactory getInstance() {
        if (singleton == null) {
            singleton = new PostFactory();
        }
        return singleton;
    }
    
    private ArrayList<Post> listaPost = new ArrayList<Post>();

//creazione post
    private PostFactory(){
        
        //Primo post
        Post post1 = new Post();
        post1.setId(0);
        post1.setUtente(UtentiRegistratiFactory.getInstance().getUtenteById(0));
        post1.setContenuto("MIAO!");
        
        
        //Secondo post
        Post post2 = new Post();
        post2.setId(1);
        post2.setUtente(UtentiRegistratiFactory.getInstance().getUtenteById(1));
        post2.setContenuto("http://www.fumettologica.it/wp-content/uploads/2016/08/labadessa-670x335.jpg");
        post2.setPostTipo(Post.Tipo.IMAGE);
        
        //Terzo post
        Post post3 = new Post();
        post3.setId(2);
        post3.setUtente(UtentiRegistratiFactory.getInstance().getUtenteById(2));
        post3.setContenuto("https://www.w3schools.com/html/default.asp");
        post3.setPostTipo(Post.Tipo.TEXT);
    
    
    listaPost.add(post1);
    listaPost.add(post2);
    listaPost.add(post3);
    }
    
    public Post getPostById(int id) {
        for (Post post : this.listaPost) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }
    
    List<Post> getPostList(UtentiRegistrati utente){
    
        for(Post post : this.listaPost){
        
            if(post.getUtente().equals(utente)){
            
                listaPost.add(post);
            }
        }
        return listaPost;
    }
    
    //task 3 milestone 4
    public void setConnectionString(String s){
	this.connectionString = s;
    }
    
    public String getConnectionString(){
	return this.connectionString;
    }
}