    <%-- 
    Document   : Dangky
    Created on : Aug 10, 2020, 11:10:58 PM
    Author     : Minh Dao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Đăng ký tài khoản</title>
        <link rel="stylesheet" type="text/css" href="css/dangky.css" />
    </head>

    <body>
        <div>
            <div class="header">
                <div class="topbar"></div>
                <div class="topbarseconds">

                </div>
                <div class="content">
                    <h3 class="title">Đăng ký</h3>
                    <form id="FDK" action="XuLyThemTKAdmin" method="post">
                        <table border="0" align="center" >
                            <tr>
                                <td>
                                    <input  class="hienthi" type="text" name="email" id="email" placeholder="   Email"/>

                                    <br /><br />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input  class="hienthi" type="password" name="Password" id="Password" placeholder="   Password"/>
                                    <br /><br />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input  class="hienthi" type="password" name="nhaplaimatkhau" id="nhaplaimatkhau" placeholder="   Nhập lại password"/>
                                    <br /><br />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input  class="hienthi" type="text" name="hoten" id="hoten" placeholder="   Họ tên"/>
                                    <br /><br />
                                </td>
                            </tr>
                             <tr>
                                <td>
                                    <input  class="hienthi" type="text" name="tenhienthi" id="tenhienthi" placeholder="   Tên hiển thị"/>
                                    <br /><br />
                                </td>
                            </tr>
                           

                            <tr>
                                <td>
                                    <input class="hienthi" type="text" name="sdt" id="sdt" placeholder="   Số điện thoại"/>
                                </td>
                            </tr>
                            
                            <tr>
                                <td>
                                    <input class="checkbox" type="checkbox" name="dieukhoan" id="dieukhoan" checked/>
                                    Tối đồng ý với <a href="#">Điều khoản dịch vụ</a> và <a href="#">Chính sách bảo mật</a> 
                                    <br /><br />
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2" align="center">
                                    <input  type="submit" id="DangKyNgay" name="DangKyNgay" value="Đăng ký ngay" style="width:100%;height:40px;background-color:red;border-radius:10px;"/>
                                </td>
                            </tr>
                        </table>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
