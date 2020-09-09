<%-- 
    Document   : Admin_main
    Created on : Sep 7, 2020, 10:04:53 PM
    Author     : Minh Dao
--%>

<%@page import="java.text.DecimalFormat"%>
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
                <table class="table table-hover">
                    <br>
                    <tr>

                        <th>STT</th>
                        <th>Tên sách</th>
                        <th>Giá sách</th>
                        <th>Hình Ảnh</th>
                        <th>Mô tả</th>
                        <th>Nhóm sản phẩm </th>
                        <th>Trạng thái</th>
                        <th>Thao tác</th>


                    </tr>
                    <%
                        Vector<ListProduct> ds = new Vector<ListProduct>();
                        ListProduct pro = new ListProduct();
                        tbProduct.LayDuLieuAdmin(ds);
                        int dem = 0;
                        DecimalFormat formatter = new DecimalFormat("###,###,###");
                        for (ListProduct p : ds) {
                            String img = "noimage.jpg";
                            if (p.getHinhAnh() != null && p.getHinhAnh().equals("") == false) {
                                img = p.getHinhAnh();
                            }
                            
                            dem++;

                    %>
                    <tr>
                        <td><%=dem%></td>
                        <td style="width: 100px"><%=p.getTensp()%></td>
                        <td><%=formatter.format(Integer.parseInt(p.getGiaSP()))%></td>
                        <td><img src="Uploads/<%=img%>" height="100px" width="100px"></td>
                        <td style="width: 500px"><%=p.getMoTa()%></td>
                        <td><%=p.getIdproducts()%></td>
                        <td><%=p.isTrangthai() ? "Đang bán" : "Không được bán"%></td>
                        <th><a href="admin.jsp?module=SuaDulieuSP&id=<%=p.getId()%>"><input type="submit" name="fix" id="fix" value="Sửa" ></a>
                            <a href="XuLyXoa?id=<%=p.getId()%>"><input type="submit" name="delete" id="delete" value="Xóa"></a>
                            <a href="DoiTrangThaiSP?id=<%=p.getId()%>&tt=<%=p.gettrangthai()%>"><input type="submit" name="fix" id="fix" value="Đổi trạng thái" ></a>
                        </th>
                    </tr>
                    <%    }
                    %>
                </table>
            </div><!-- /.box-body -->
        </div><!-- /.box -->
    </div>
</div>