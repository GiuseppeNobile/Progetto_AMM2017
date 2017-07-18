package amm.nerdbook.classi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
        
    }
    
    public UtentiRegistrati getUtenteById(int id) {
        for (UtentiRegistrati utente : this.listaUtenti) {
            if (utente.getId() == id) {
                return utente;
            }
        }
        return null;
    }
    
    
    public void setConnectionString(String s){
	this.connectionString = s;
    }
    
    public String getConnectionString(){
	return this.connectionString;
    }
    
    
    public List getUtentiList() {
        List<UtentiRegistrati> listaUtenti = new ArrayList<>();
        
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "username", "password");
            
             String query = 
                      "select * from utenti";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            while (res.next()) {
                UtentiRegistrati current = new UtentiRegistrati();
                current.setId(res.getInt("id"));
                current.setNome(res.getString("nome"));
                current.setEmail(res.getString("cognome"));
                current.setEmail(res.getString("email"));
                current.setPassword(res.getString("password"));
                current.setUrlFoto(res.getString("urlFoto"));
                
                listaUtenti.add(current);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e){
        
        }
        
        return listaUtenti;
    }
}
