<%-- 
    Document   : editnote
    Created on : 21 Sep, 2022, 11:22:19 AM
    Author     : manisha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Simple Note Keeper</h1>
       <h2>View Note</h2><!-- comment -->
    
       <form action="note" method="post">
           <p>
           <label>
               Tittle:
               <input type="text" name="tittle"> 
           </label>
           </p>
           <p>
           <label for="">Contents:</label>
           <textarea id="contents" name="contents"></textarea>
           </p>
           
           <button type="submit">Submit</button>
           
           
           
           
           
           
           
           
       </form>
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    </body>
</html>
