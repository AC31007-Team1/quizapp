<%-- 
    Document   : modules
    Created on : 22-Feb-2017, 12:01:18
    Author     : iain
--%>
<!--refactored to increase usability and normalize design-->

<%@include file="header.jsp"%>

<title>
    Select a Module
</title>
</head>
<body>
    <%@include file="navbar.jsp"%>
    <div style="margin: 1% 10% 10% 10%">
        <div class="jumbotron">


            <h1 class="display-1">Select a Module:</h1>
            <br>

            <div class="col-12 center"><h2></h2></div>
            
                <%for (int i = 0; i < modfinder.getSize(); i++) 
                { String a = modfinder.getModule(i); int b = i; b++; String c = Integer.toString(b);%>
                <form role="form" class="form-group row" action="SelectModule" method="post">
             
                    <button type="submit" style="cursor: pointer;" name="module"  value="<%=c%>"
                            class="col-lg-12 btn btn-lg btn-primary"><%=a%></button>
                </form>
                <%}%> 

            
        </div>



        <%@include file="footer.jsp"%>
