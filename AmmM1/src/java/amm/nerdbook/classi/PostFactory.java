package amm.nerdbook.classi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    
    private ArrayList<Post> listaPost = new ArrayList<>();

//creazione post
    private PostFactory(){

    }
    
    public Post getPostById(int id) {
        for (Post post : this.listaPost) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }
    
    public List<Post> getPostList(UtentiRegistrati utente){
    
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
    
    public void addNewPost(Post post){
        try {
            
            Connection conn = DriverManager.getConnection(connectionString, "utente", "utente");
            
            String query = 
                      "insert into posts (post_id, content, type, author) "
                    + "values (default, ? , ? , ? )";
            
            
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setString(1, post.getContenuto());

            stmt.setInt(2, this.postTypeFromEnum(post.getPostTipo()));
            
            stmt.setInt(3, post.getUtente().getId());
            
            
            stmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
       
    }
    
    private Post.Tipo postTipoFromString(String tipo){
        
        if(tipo.equals("IMAGE"))
            return Post.Tipo.IMAGE;
        
        return Post.Tipo.TEXT;
    }
    
    private int postTypeFromEnum(Post.Tipo tipo){
        //È realizzabile in modo più robusto rispetto all'hardcoding degli indici
        if(tipo == Post.Tipo.TEXT)
                return 1;
            else
                return 2;
    }
}
