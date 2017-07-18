<%-- 
    Document   : bacheca
    Created on : 27-apr-2017, 17.53.52
    Author     : Giuseppe Nobile
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
        <title>Bacheca</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Giuseppe Nobile"/>
        <meta name="description" content="Bacheca"/>
        <meta name='keywords' content="Nerd, social, network, social network, bacheca"/>
        <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
        <script type="text/javascript" src="js/jjavascript.js"></script>
    </head>
       
    <body>
        
        <header>
            <div>    
            <h1 id="bachecaTitolo">Bacheca - Nerdbook</h1>
            </div>
            
            <div>
            <a href="cercaamici.jsp" class="linksito">Cerca Amici</a>
            
            <a href="descrizione.jsp" class="linksito">Pagina di descrizione</a>
        
            <a href="login.jsp" class="linksito">Login</a>
        </div>
        </header>
       
        <!-- Sidebar -->
        <jsp:include page="sidebar.jsp"/>
        
        
        <!-- contenuto bacheca -->  
        <div id="content">
        
            <!-- form per nuovo post -->
            <div id="newpost" style="display: inline-block">
                <h3>Inserisci un nuovo post</h3>
                <textarea id="TextPost" rows='4' cols='155' name='post' placeholder='Scrivi qui...'></textarea>
                <input id="URLPost" type="url" name="url" placeholder="URL" required>
                <input id="bottonePubblica" type="submit" value="Pubblica">
            </div>

            <!-- PRIMO POST -->
            <div class="stato">
                <div class="nomefoto">
                    <img class="fotoprofilo fotonick" title='djinopic' alt='djino' src='images/djino.png' width="120" height="120">
                    <h2 class="fotonick">Djino</h2>
                </div>
                
                <!-- Stato -->
                <div class="post">
                    <p>MIAO!!!</p>
                </div>
            </div>

            <!-- SECONDO POST -->
            <div class="stato">
                <div class="nomefoto">
                    <img class="fotoprofilo fotonick" title='einsteinpic' alt='einstein' src='images/einstein.jpg' width="120" height="120">
                    <h2 class="fotonick">Ainstain</h2>
                </div>
                
                <!-- Immagine -->
                <div class="post">
                    <p><img title='imagelink' alt='linkeinstein' src='http://www.fumettologica.it/wp-content/uploads/2016/08/labadessa-670x335.jpg' width="120" height="120"></p>
                </div>
            </div>

            <!-- TERZO POST -->
            <div class="stato">
                <div class="nomefoto">
                    <img class="fotoprofilo fotonick"  title='einsteinpic' alt='einstein' src='images/einstein.jpg' width="200" height="200"> 
                    <h2 class="fotonick">Djovanni</h2>
                </div>
                
                <!-- Link -->
                <div class="post">
                    <p>https://www.w3schools.com/html/default.asp</p> 
                </div>
            </div>
        </div>
     
        
    </body>