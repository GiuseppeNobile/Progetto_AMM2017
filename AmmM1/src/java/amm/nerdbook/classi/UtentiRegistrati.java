package amm.nerdbook.classi;

/**
 *
 * @author Giuseppe Nobile
 */
public class UtentiRegistrati {

//variabili
    protected int id;
    protected String nome;
    protected String cognome;
    protected String email;
    protected String password;
    protected String urlFoto;

//costruttori
    public UtentiRegistrati(){
        
        id = 0;
        nome = "";
        cognome = "";
        email = "";
        password = "";
    }
    
//metodi
    public int getId(){
    
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail(){
    
        return email;
    }
    
    public void setEmail(String email){
    
        this.email = email;
    }
    
    public String getPassword(){
    
        return password;
    }
    
    public void setPassword(String password){
    
        this.password = password;
    }
    
    public String getUrlFoto(){
    
        return urlFoto;
    }
    
    public void setUrlFoto(String urlFoto){
    
        this.urlFoto = urlFoto;
    }
}
