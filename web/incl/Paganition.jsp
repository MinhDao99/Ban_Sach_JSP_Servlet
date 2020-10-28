<%-- 
    Document   : Paganition
    Created on : Oct 28, 2020, 12:44:16 AM
    Author     : Minh Dao
--%>

<%@page import="CSDLCustomer.tbProduct"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="pagination"><ul class="pagination">    
        <%                //Button Previous
             int first = 0, last = 0, pages = 1;
              int total = new tbProduct().getCount();
            int back = 0;
            if (pages == 0 || pages == 1) {
                back = 1;//Luon la page 1
            } else {
                back = pages - 1;//Neu pages tu 2 tro len thi back tru 1
            }
        %>
        <%
            //Button Number pages
            int loop = 0, num = 0;
            if ((total / 8) % 2 == 0) {
                num = total / 8;
            } else {
                num = (total + 1) / 8;
            }
            //Nếu total lẻ thêm 1
            if (total % 2 != 0) {
                loop = (total / 8) + 1;

            } else {
                //Nếu total chẵn nhỏ hơn fullpage và # fullPage thì thêm 1
                if (total < (num * 8) + 8 && total != num * 8) {
                    loop = (total / 8) + 1;
                } else {
                    //Nếu bằng fullPage thì không thêm
                    loop = (total / 8);
                }
            }
            //Lap so pages
            for (int i = 1; i <= loop; i++) {%>
        <% if (pages == i) {%> 

        <h2> <li><span><a href="index.jsp?pages=<%=i%>"><%=i%></a></span></li></h2>
                        <%} else {%>
        <h2> <li class="pagination"><a href="index.jsp?pages=<%=i%>"><%=i%></a> </li></h2>

        <%}
                            }%>

    </ul>
</div>