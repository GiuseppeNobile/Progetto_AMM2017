<%-- 
    Document   : login
    Created on : 27-apr-2017, 18.21.18
    Author     : Giuseppe Nobile
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
        <title>Login</title>
        <meta charset="UTF-8">        
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Pagina di login">
        <meta name="keywords" content="Login, Social, Network">
        <meta name="author" content="Giuseppe Nobile">
        <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
        <script type="text/javascript" src="js/jjavascript.js"></script>
    </head>
    
    <body>
        <header>
            <div>
                
                <h1 id="loginTitolo">Login</h1>
            </div>
            
            <div>
                
                <a href="descrizione.jsp" class="linksito">Pagina di descrizione</a>

                <a href="profilo.jsp" class="linksito">Profilo</a>

                <a href="bacheca.jsp" class="linksito">Bacheca</a>
            </div>
        </header>
        
        <div id="formlogin">
            <form name="login" action="Login" method="post" accept-charset="utf-8">
                <ul>
                    <li><label class="label">Email</label>
                    <input type="email" name="usermail" placeholder="Inserire email" required id="login"></li>
                    <li><label class="label">Username</label>
                    <input type="username" name="username" placeholder="Inserire username" required id="login"></li>
                    <li><label class="label">Password</label>
                    <input type="password" name="password" placeholder="Inserire password" required id="password"></li>
                    
                    <li><input type="submit" value="Login"></li>
                </ul>
            </form>
        </div>
        
    </body>
    

</html>

