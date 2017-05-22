package amm.nerdbook.classi;

/**
 *
 * @author Giuseppe Nobile
 */
public class Gruppi {

//variabili
    protected int id;
    protected String nome;
    protected int numeroIscritti;
    

//costruttori
    public Gruppi(){
        
        id = 0;
        numeroIscritti = 0;
        nome = "";
        numeroIscritti = 0;
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
    
    public int getNumeroIscritti(){
    
        return numeroIscritti;
    }
    
    public void setNumeroIscritti(int numeroIscritti) {
        
        this.numeroIscritti = numeroIscritti;
    }
        
}
