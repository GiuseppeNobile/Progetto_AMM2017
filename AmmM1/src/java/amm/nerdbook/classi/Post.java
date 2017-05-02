package classi;

/**
 *
 * @author Giuseppe Nobile
 */
public class Post {
    
    public enum Tipo {
        TEXT, IMAGE
    };
    
//variabili
    protected int id;
    protected UtentiRegistrati utente;
    protected String contenuto;
    private Tipo postTipo;
    
        
//costruttori
    public Post(){
        
        id = 0;
        utente = null;
        contenuto = "";
        postTipo = Tipo.TEXT;
        
    }
    
//metodi
    public int getId(){
    
        return id;
    }
    
    public void setId(int id) {
        
        this.id = id;
    }
    
    public UtentiRegistrati getUtente(){
    
        return utente;
    }
    
    public void setUtente(UtentiRegistrati utente) {
        
        this.utente = utente;
    }
    
     public String getContenuto() {
         
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        
        this.contenuto = contenuto;
    }

    public Tipo getPostTipo() {
        
        return postTipo;
    }

    public void setPostTipo(Tipo postTipo) {
        
        this.postTipo = postTipo;
    }
}
