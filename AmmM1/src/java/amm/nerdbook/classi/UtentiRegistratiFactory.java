package amm.nerdbook.classi;

import java.util.ArrayList;

/**
 *
 * @author Giuseppe Nobile
 */
public class UtentiRegistratiFactory {
    
    String connectionString;
    private static UtentiRegistratiFactory singleton;
    
    public static UtentiRegistratiFactory getInstance() {
        if (singleton == null) {
            singleton = new UtentiRegistratiFactory();
        }
        return singleton;
    }
    
    
    
    private ArrayList<UtentiRegistrati> listaUtenti = new ArrayList<UtentiRegistrati>();

//creazione utenti
    private UtentiRegistratiFactory(){
        
        //Djino
        UtentiRegistrati utente1 = new UtentiRegistrati();
        utente1.setId(0);
        utente1.setNome("Djino");
        utente1.setEmail("djino_the_cat@purrmail.com");
        utente1.setPassword("miaomiao");
        utente1.setUrlFoto("images/djino.png");
        
        //Djovanni
        UtentiRegistrati utente2 = new UtentiRegistrati();
        utente2.setId(1);
        utente2.setNome("Djovanni");
        utente2.setEmail("dj.ovanni@gmail.com");
        utente2.setPassword("ovanni");
        utente2.setUrlFoto("images/einstein.jpg");
        
        //Ainstain
        UtentiRegistrati utente3 = new UtentiRegistrati();
        utente3.setId(2);
        utente3.setNome("Ainstain");
        utente3.setEmail("best_physician_eva@gmail.com");
        utente3.setPassword("mcalquadrato");
        utente3.setUrlFoto("images/einstein.jpg");
    }
    
    public UtentiRegistrati getUtenteById(int id) {
        for (UtentiRegistrati utente : this.listaUtenti) {
            if (utente.getId() == id) {
                return utente;
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
