<%@page import="util.StringUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

    <jsp:include page = "WEB-INF/head_tag.jsp">
        <jsp:param name = "title" value="Register"></jsp:param>
    </jsp:include>

    <body>
        <nav class="container-fluid" id="main-nav-login">
            <div class="container">
                <div class="row">
                    <div class="col-md-6">
                        <a href="/" id="logo-large">BMAGBOOK</a>
                    </div>
                    <div class="col-md-6">
                        <form action="/" method="post" class="login-form-top">
                            <div class="login-form-input">
                                <label>Email or phone</label>
                                <input type="text" name="user-login-id" />
                            </div>
                            <div class="login-form-input">
                                <label>Password</label>
                                <input type="password" name="user-login-password" />
                                <button type="button" id="btn-login">Login</button>
                                <a href="/">Forgotten password?</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </nav>

        <section class="container-fluid" id="body-register-form">
            <div class="container">
                <div class="row">
                    <div class="col-md-6">
                        <h3>BMAGBOOK helps you connect and share with the people in your life.</h3>
                        <img src="img/user-map.png">
                    </div>
                    <div class="col-md-6">
                        <h3>Create an account</h3>
                        <p>It's free and always will be.</p>
                        <%
                            Object error = request.getAttribute("error");
                            if (!StringUtil.getString(error).equals("")) {
                        %>
                        <div class="alert-danger" style="padding: 5px 15px">
                            <%= error%>
                        </div>
                        <%
                            }
                        %>
                        <form action="dang-ky" method="post" class="register-form">
                            <div class="reg-input-full-name">
                                <div class="reg-input" id="first-name">
                                    <input type="text" name="first-name" placeholder="First name" 
                                           value="<%=StringUtil.getString(request.getParameter("first-name"))%>">
                                    <i class="fa fa-exclamation-triangle" aria-hidden="true"></i>
                                    <span class="error-popup">Input your first name
                                        <span></span><span></span>
                                    </span>
                                </div>
                                <div class="reg-input" id="last-name">
                                    <input type="text" name="last-name" placeholder="Last name"
                                           value="<%=StringUtil.getString(request.getParameter("last-name"))%>">
                                    <i class="fa fa-exclamation-triangle" aria-hidden="true"></i>
                                    <span class="error-popup">Input your last name
                                        <span></span><span></span>
                                    </span>
                                </div>
                            </div>
                            <div class="reg-input" id="mobile-or-email">
                                <input type="text" name="mobile-or-email" placeholder="Mobile phone or email address"
                                       value="<%=StringUtil.getString(request.getParameter("mobile-or-email"))%>">
                                <i class="fa fa-exclamation-triangle" aria-hidden="true"></i>
                                <span class="error-popup">Input your email or phone
                                    <span></span><span></span>
                                </span>
                            </div>
                            <div class="reg-input" id="user-password">
                                <input type="password" name="user-password" placeholder="New password">
                                <i class="fa fa-exclamation-triangle" aria-hidden="true"></i>
                                <span class="error-popup">Input your password
                                    <span></span><span></span>
                                </span>
                            </div>
                            <label style="display:block;">Birthday</label>
                            <div class="reg-input">
                                <select name="day" id="days">
                                    <option>Day</option>
                                </select>
                                <select name="month" id="months">
                                    <option>Month</option>
                                </select>
                                <select name="year" id="years">
                                    <option>Year</option>
                                </select>
                                <i class="fa fa-exclamation-triangle" aria-hidden="true"></i>
                                <span class="error-popup">Select your birthday
                                    <span></span><span></span>
                                </span>
                            </div>
                            <div class="reg-input">
                                <input checked="true" type="radio" name="sex" value="female"><label>Female</label>
                                <input type="radio" name="sex" value="male"><label>Male</label>
                            </div>
                            <p class="help-block">
                                By clicking Create an account, you agree to our Terms and that you have read our Data Policy, including our Cookie Use.
                            </p>
                            <button type="submit" id="reg-button" name="submit">Create an account</button>
                        </form>
                    </div>
                </div>
            </div>
        </section>

        <footer class="container">
            <ul id="lans">
                <li>English (UK)</li>
                <li>
                    <a href="#">Tiáº¿ng viá»t</a>
                </li>
                <li>
                    <a href="#">ä¸­æ(å°ç£)</a>
                </li>
                <li>
                    <a href="#">íêµ­ì´</a>
                </li>
                <li>
                    <a href="#">æ¥æ¬èª</a>
                </li>
                <li>
                    <a href="#">FranÃ§ais (France)</a>
                </li>
                <li>
                    <a href="#">à¸ à¸²à¸©à¸²à¹à¸à¸¢</a>
                </li>
                <li>
                    <a href="#">EspaÃ±ol</a>
                </li>
                <li>
                    <a href="#">PortuguÃªs (Brasil)</a>
                </li>
                <li>
                    <a href="#">Deutsch</a>
                </li>
                <li>
                    <a href="#">Italiano</a>
                </li>
                <li>+</li>
            </ul>
            <ul id="footer-tools">
                <li><a href="/">Sign Up</a></li>
                <li>
                    <a href="#">Log In</a>
                </li>
                <li>
                    <a href="#">Messenger</a>
                </li>
                <li>
                    <a href="#">Facebook Lite</a>
                </li>
                <li>
                    <a href="#">Mobile</a>
                </li>
                <li>
                    <a href="#">Find Friends</a>
                </li>
                <li>
                    <a href="#">Badges</a>
                </li>
                <li>
                    <a href="#">People</a>
                </li>
                <li>
                    <a href="#">Pages</a>
                </li>
                <li>
                    <a href="#">Places</a>
                </li>
                <li>
                    <a href="#">Games</a>
                </li>
                <li><a href="/">Locations</a></li>
                <li>
                    <a href="#">Celebrities</a>
                </li>
                <li>
                    <a href="#">Groups</a>
                </li>
                <li>
                    <a href="#">Facebook Lite</a>
                </li>
                <li>
                    <a href="#">Mobile</a>
                </li>
                <li>
                    <a href="#">Find Friends</a>
                </li>
                <li>
                    <a href="#">Badges</a>
                </li>
                <li>
                    <a href="#">People</a>
                </li>
                <li>
                    <a href="#">Pages</a>
                </li>
                <li>
                    <a href="#">Places</a>
                </li>
                <li>
                    <a href="#">Games</a>
                </li>
            </ul>
            BMAGBOOK &copy; 2016
        </footer>

        <script src="./js/app.js"></script>

        <script>
            $(function () {
                var day = "<%=StringUtil.getString(request.getParameter("day"))%>"
                var month = "<%=StringUtil.getString(request.getParameter("month"))%>"
                var year = "<%=StringUtil.getString(request.getParameter("year"))%>"
                var sex = "<%=StringUtil.getString(request.getParameter("sex"))%>"
                
                for (var i = 1; i <= 31; i++) {
                    if(i == day)
                        $("#days").append("<option selected>" + i + "</option>");
                    else
                    $("#days").append("<option >" + i + "</option>");
                }

                for (var i = 1; i <= 12; i++) {
                    if(i == month)
                        $("#months").append("<option selected>" + i + "</option>");
                    else
                    $("#months").append("<option>" + i + "</option>");
                }

                for (var i = 2010; i >= 1900; i--) {
                    if(i == year)
                        $("#years").append("<option selected>" + i + "</option>");
                    else
                    $("#years").append("<option>" + i + "</option>");
                }
                
                $("input[name=sex][value=" + sex + "]").prop("checked", true);
            });
        </script>
    </body>

</html>