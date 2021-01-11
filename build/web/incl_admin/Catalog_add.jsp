<%-- 
    Document   : Admin_main
    Created on : Sep 7, 2020, 10:04:53 PM
    Author     : Minh Dao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="row">
    <div class="col-xs-12">
        <div class="box">
            <div class="box-body table-responsive no-padding">
                </table>
                <form id="FDK" action="XuLythemLoaiSach" method="post">
                    <table border="0" align="center" >
                        <tr>
                            <td>
                                <input  class="hienthi" type="text" name="loaisach" id="loaisach" placeholder="   Tên loại sách"/>

                                <br /><br />
                            </td>
                        </tr>
                        <tr>
                            <td>
                              Bày bán  <input  class="hienthi" type="checkbox" name="trangthai" id="trangthai" value="1"/> 
                                <br /><br />
                            </td>
                        </tr>


                        <tr>
                            <td colspan="2" align="center">
                                <input  type="submit" id="Themmoi" name="Themmoi" value="Thêm mới" style="width:100%;height:40px;background-color:red;border-radius:10px;"/>
                            </td>
                        </tr>
                    </table>
                </form>

            </div><!-- /.box-body -->
        </div><!-- /.box -->
    </div>
</div>