<%-- 
    Document   : SuaDuLieuLoaiSP
    Created on : Sep 7, 2020, 10:04:53 PM
    Author     : Minh Dao
--%>

<%@page import="model.ListProduct"%>
<%@page import="CSDL.tbProduct"%>
<%@page import="java.util.Vector"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="row">
    <div class="col-xs-12">
        <div class="box">
            <div class="box-header">
                <div class="box-tools">
                    <div class="input-group">
                        <input type="text" name="table_search" class="form-control input-sm pull-right" style="width: 150px;" placeholder="Search"/>
                        <div class="input-group-btn">
                            <button class="btn btn-sm btn-default"><i class="fa fa-search"></i></button>
                        </div>
                    </div>
                </div>
            </div><!-- /.box-header -->
            <div class="box-body table-responsive no-padding">
                </table>
                <%
                    int id;
                    if (request.getParameter("id") == null || Controller.Tientich.isInteger(request.getParameter("id")) == false) {
                        out.println("<h3>Lỗi ID</h3>");
                    } else {
                        id = Integer.parseInt(request.getParameter("id"));
                        Product pro = new Product();
                        int kq = tbProduct.GetOneTypeProduct(id, pro);
                        if (kq > 0) {

                %>
                <form id="FDK" action="XuLySuaLoaiSP" method="post">
                    <table border="0" align="center" >
                        <input type="hidden" readonly name="id" id="id" value="<%=pro.getId()%>"/>
                        <tr>
                            <td>
                               Tên sách <input type="text" name="Ten" id="Ten" value="<%=pro.getTen()%>"/>
                                <br /><br />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Bày bán  <input  class="hienthi" type="checkbox" name="trangthai" id="trangthai" value="1"<%=(pro.isTrangthai() == true) ? "checked" : ""%>/> 
                                <br /><br />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <input  type="submit" id="Sua" name="Sua" value="Sửa" style="width:100%;height:40px;background-color:red;border-radius:10px;"/>
                            </td>
                        </tr>

                    </table>
                </form>
                <%
                        }
                    }
                %>
            </div><!-- /.box-body -->
        </div><!-- /.box -->
    </div>
</div>