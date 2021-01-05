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
        <script language="javascript">
            function kiemtra()
            {
                f = document.FDK;
                email = f.email.value;
                re_email = /^\w+([\.\-]?\w+)*@\w+(\.\w+){1,2}$/;

                if (re_email.test(email) == false)
                {
                    document.getElementById("loi_email").innerHTML = "Bạn nhập sai định dạng";
                    return false;
                } else {
                    document.getElementById("loi_email").innerHTML = "";
                }
                pass = f.Password.value;
                re_pass = /^[A-Za-z]\w{7,14}$/;
                if (re_pass.test(pass) == false)
                {
                    document.getElementById("loi_pass").innerHTML = "Mật khẩu từ 8-14 kí tự và bắt đầu bằng chữ cái";
                    return false;
                } else {
                    document.getElementById("loi_pass").innerHTML = "";
                }
                pass_again = f.nhaplaimatkhau.value;
                if (pass_again!=pass)
                {
                    document.getElementById("loi_passAgain").innerHTML = "Không trùng mật khẩu";
                    return false;
                } else {
                    document.getElementById("loi_passAgain").innerHTML = "";
                }
                hoten=f.hoten.value;
                if(hoten=="")
                {
                    document.getElementById("loi_hoten").innerHTML = "Chưa nhập họ tên";
                    return false;
                } else {
                    document.getElementById("loi_hoten").innerHTML = "";
                }
                sdt=f.sdt.value;
                re_sdt = /^(\+84)?0?\d[1-9]{9,11}$/;
                if(re_sdt.test(sdt)==false)
                {
                    document.getElementById("loi_sdt").innerHTML = "Bạn nhập điện thoại sai";
                    return false;
                } else
                {
                    document.getElementById("loi_sdt").innerHTML = "";
                }
            }
        </script>
    </head>

    <body>
        <div>
            <div class="header">
                <div class="topbar"></div>
                <div class="topbarseconds">

                </div>
                <div class="content">
                    <h3 class="title">Đăng ký</h3>
                    <form id="FDK" name="FDK" action="user_Register" method="post">
                        <table border="0" align="center" >
                            <tr>
                                <td>
                                    <input  class="hienthi" type="text" name="email" id="email" placeholder="   Email"/>
                                    <br>
                                        <span id="loi_email" class="baoloi" style="color: red"></span>
                                        <br /><br />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input  class="hienthi" ng-copy type="password" name="Password" id="Password" placeholder="   Password"/>
                                    <br>
                                        <span id="loi_pass" class="baoloi" style="color: red"></span>
                                        <br /><br />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input  class="hienthi" type="password" name="nhaplaimatkhau" id="nhaplaimatkhau" placeholder="   Nhập lại password"/>
                                    <br>
                                        <span id="loi_passAgain" class="baoloi" style="color: red"></span>
                                        <br /><br />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input  class="hienthi" type="text" name="hoten" id="hoten" placeholder="   Họ tên"/>
                                    <br>
                                        <span id="loi_hoten" class="baoloi" style="color: red"></span>
                                        <br /><br />
                                </td>
                            </tr>


                            <tr>
                                <td>
                                    <input class="hienthi" type="text" name="sdt" id="sdt" placeholder="   Số điện thoại"/>
                                    <br>
                                        <span id="loi_sdt" class="baoloi" style="color: red"></span>
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
                                    <input  type="submit" id="DangKyNgay" name="DangKyNgay" value="Đăng ký ngay"  onclick="return kiemtra();" style="width:100%;height:40px;background-color:red;border-radius:10px;"/>
                                </td>
                            </tr>
                        </table>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
