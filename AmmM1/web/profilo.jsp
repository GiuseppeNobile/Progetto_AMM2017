<%--
    Document   : profilo
    Created on : 27-apr-2017, 18.22.06
    Author     : Giuseppe Nobile
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
        <meta charset="utf-8"/>
        <meta name="author" content="Giuseppe Nobile"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <meta name="description" content="Profilo"/>
        <meta name='keywords' content="Nerd, social, network, social network, profilo"/>
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
        <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
        <script type="text/javascript" src="js/jjavascript.js"></script>
        
        <title>Profilo</title>
        
    </head>
    
    <body>
    
        <header>
            <div>
                
                <h1 id="profiloTitolo">Profilo - Nerdbook</h1>
            </div>
        
            <div>
                
                <a href="descrizione.jsp" class="linksito">Pagina di descrizione</a>
            
                <a href="bacheca.jsp" class="linksito">Bacheca</a>
            </div>
        </header>
        
        
        <!-- Sidebar -->
        <jsp:include page="sidebar.jsp"/>
        
                     
        <div id="formprofilo">
            <form name="formprofilo" action="index_submit" method="get" accept-charset="utf-8">
                <ul>
                    <li><label>Nome</label>
                    <input type="text" name="nome" placeholder="Inserire nome" required></li>                 
                    <li><label>Cognome</label>
                    <input type="text" name="cognome" placeholder="Inserire cognome" required></li>                   
                    <li><label>Immagine Profilo</label>
                    <input id="URLProfilo" type="url" name="url" placeholder="URL" required></li>                    
                    <li><label>Frase di presentazione</label></li>
                    <li><textarea rows='5' cols='20' name='frase' placeholder='Inserire frase di presentazione'></textarea></li>                   
                    <li><label>Data di nascita</label>
                    <input type="date" name="data"></li>                  
                    <li><label>Password</label>
                    <input type="password" name="password" placeholder="Inserire password" required></li>                   
                    <li><label>Conferma Password</label>
                    <input type="password" name="password" placeholder="Ripetere password" required></li>                  
                    <li><input type="submit" value="Aggiorna"></li>
                </ul>
            </form>
        </div>
    </body>
</html>

