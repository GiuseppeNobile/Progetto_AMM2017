<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
        <title>Nerdbook</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Giuseppe Nobile"/>
        <meta name="description" content="Bacheca"/>
        <meta name='keywords' content="Nerd, social, network, social network, bacheca"/>
        <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
        <script type="text/javascript" src="js/jjavascript.js"></script>
    </head>
    
    <body>
        <header id="headerCercaAmici">
            <div id="CercaAmiciTitolo">
                <h1 id="h1CercaAmici">Cerca Amici</h1>
            </div>
            
            <div id= "linkbacheca">
                <a href="bacheca.jsp" class="linksito">Bacheca</a>
            </div>
        </header>
        <div id="ricerca">
            <div id="cerca">
                <input id="searchField" type="text" placeholder="Cerca i tuoi amici!" value="">
                <button id="searchButton">Cerca</button>
            </div>
            
            <div id="usersList">
            <c:forEach var="utenti" items="${utenti}">
                <div class="utente">
                    <div class="fotoprofilo">
                        <img alt="Foto Profilo" src="${utenti.urlFoto}">
                    </div>
                    
                    <div class="userData">
                        <h2>${utenti.nome}</h2>
                            
                        <a href="index.html?user=${utenti.id}">Link al profilo</a>
                    </div>
                </div>
                </c:forEach>
            </div>
        </div>
        
        
        
    </body>
</html>
