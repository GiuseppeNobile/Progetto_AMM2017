package amm.nerdbook.classi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Giuseppe Nobile
 */
public class GruppiFactory {
    
    String connectionString;
    private static GruppiFactory singleton;
    
    public static GruppiFactory getInstance() {
        if (singleton == null) {
            singleton = new GruppiFactory();
        }
        return singleton;
    }
    
    private ArrayList<Gruppi> listaGruppi= new ArrayList<Gruppi>();

//creazione Gruppi
    private GruppiFactory(){
        
        //Primo gruppo
        Gruppi gruppo1 = new Gruppi();
        gruppo1.setId(0);
        gruppo1.setNome("Gatti DJ nel Mondo");
        gruppo1.getNumeroIscritti();
        
        
        listaGruppi.add(gruppo1);
    
    }
    
    public Gruppi getGruppoyId(int id) {
        for (Gruppi gruppo : this.listaGruppi) {
            if (gruppo.getId() == id) {
                return gruppo;
            }
        }
        return null;
    }
    
    //task 3 milestone 4
    public void setConnectionString(String s){
	this.connectionString = s;
    }
    
    public String getConnectionString(){
	return this.connectionString;
    }   
}
