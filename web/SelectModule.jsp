<%-- 
    Document   : modules
    Created on : 22-Feb-2017, 12:01:18
    Author     : iain
--%>
  <!--refactored to increase usability and normalize design-->

<%@include file="header.jsp"%>

        <title>
            QuizMe
        </title>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
        <div style="margin: 1% 10% 10% 10%">
        <div class="jumbotron">
        
        
        <h1 class="display-1">Select a Module:</h1>
        <br>
        
            <div class="col-12 center"><h2></h2></div>
            <form role="form" action="SelectModule" method="post">
            <div class="list-group display-5">
            <%for (int i=0; i<modfinder.getSize(); i++)
                   {String a=modfinder.getModule(i);int b=i;b++;String c=Integer.toString(b);%>
         
                <button type="submit" style="cursor: pointer;" name="module"  value="<%=c%>"
                        class="list-group-item list-group-item-action"><p style="text-align:center;"><%=a%></p></button>
            
         <%}%> 
            </div>
            </form>
        </div>
        </div>
    
        
       <%@include file="footer.jsp"%>
