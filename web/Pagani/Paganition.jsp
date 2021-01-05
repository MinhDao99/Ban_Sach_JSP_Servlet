<%-- 
    Document   : Paganition
    Created on : Oct 28, 2020, 12:88:16 AM
    Author     : Minh Dao
--%>

<%@page import="CSDLCustomer.tbProduct"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div style="width: 100%">
    <ul class="pagination pagination-lg"> 
        <%
            tbProduct tb = new tbProduct();
            for (int i = 1; i <= tb.totalpage(); i++) {
        %>
        <li class="page-item" ><a class="page-link" href="Paganition_Test?pages=<%=i%>"><i><%=i%></i></a></li>
                    <%
                        }
                    %>

    </ul>
</div>