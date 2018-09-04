<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <jsp:include page = "WEB-INF/head_tag.jsp">
        <jsp:param name = "title" value="Search Result"></jsp:param>
    </jsp:include>

    <body>
        <%@include file="WEB-INF/top_nav.jspf" %>

        <section class="container-fluid" id="main-body">
            <div class="row no-pad">
                <div class="col-md-2 no-pad">
                    <div class="left-tool-section">
                        <a href="">
                            <img src="img/avatar.jpg"> Ngo Dang Ha An
                        </a>
                        <a href=""><i class="fa fa-pencil" aria-hidden="true"></i> Edit Profile</a>
                    </div>

                    <div class="left-tool-section">
                        <h4>FAVORITES</h4>
                        <a href=""><i class="fa fa-newspaper-o" aria-hidden="true"></i> News Feed</a>
                        <a href=""><i class="fa fa-globe" aria-hidden="true"></i> Messages</a>
                        <a href=""><i class="fa fa-weixin" aria-hidden="true"></i> Events</a>
                        <a href=""><i class="fa fa-life-ring" aria-hidden="true"></i> Sales Group</a>
                    </div>

                    <div class="left-tool-section">
                        <h4>FRIENDS</h4>
                        <a href=""><i class="fa fa-location-arrow" aria-hidden="true"></i> Ho Chi Minh City</a>
                        <a href=""><i class="fa fa-graduation-cap" aria-hidden="true"></i> Truong THPT Le Hong Phong</a>
                        <a href=""><i class="fa fa-building" aria-hidden="true"></i> GSC Corporation</a>
                        <a href=""><i class="fa fa-graduation-cap" aria-hidden="true"></i> BMAG</a>
                    </div>

                    <div class="left-tool-section">
                        <h4>APPS</h4>
                        <a href=""><i class="fa fa-industry" aria-hidden="true"></i> Live Videos</a>
                        <a href=""><i class="fa fa-gamepad" aria-hidden="true"></i> Games</a>
                        <a href=""><i class="fa fa-heart-o" aria-hidden="true"></i> On This Day</a>
                        <a href=""><i class="fa fa-picture-o" aria-hidden="true"></i> Photos</a>
                        <a href=""><i class="fa fa-gamepad" aria-hidden="true"></i> Games Feed</a>
                    </div>

                    <div class="left-tool-section">
                        <h4>EVENTS</h4>
                        <a href=""><i class="fa fa-bicycle" aria-hidden="true"></i> Live Videos</a>
                        <a href=""><i class="fa fa-music" aria-hidden="true"></i> Musics</a>
                        <a href=""><i class="fa fa-fax" aria-hidden="true"></i> Re-Union</a>
                        <a href=""><i class="fa fa-deaf" aria-hidden="true"></i> Company Trips</a>
                        <a href=""><i class="fa fa-credit-card-alt" aria-hidden="true"></i> Family Trips</a>
                    </div>
                </div>
                <div class="col-md-5 no-pad">
                    <div class="middle-section search-result-box">
                        <div class="search-result-box-header">
                            <i class="fa fa-users" aria-hidden="true"></i>
                            <span>PEOPLE</span>
                        </div>
                        <div class="search-result-box-content">
                            <div class="search-result-box-content-item">
                                <img src="img/result1.jpg">
                                <span>
                                    <a href="">Ha An</a>
                                    <a href="">HÃ  Ná»i, Viet Nam</a>
                                    <a href="">Live in HÃ  Ná»i, Viá»t Nam</a>
                                    <a href="">2 mutual friends: Thao Phan and Thanh Mai</a>
                                </span>
                                <button><i class="fa fa-user-plus" aria-hidden="true"></i> Add friend</button>
                            </div>
                            <div class="search-result-box-content-item">
                                <img src="img/result2.jpg">
                                <span>
                                    <a href="">Tran Anh Tuan</a>
                                    <a href="">Studied at Yale University, US</a>
                                    <a href="">Live in HÃ  Ná»i, Viá»t Nam</a>
                                    <a href="">2 mutual friends: NgÃ´ Thu Huyá»n ...</a>
                                </span>
                                <button><i class="fa fa-user-plus" aria-hidden="true"></i> Add friend</button>
                            </div>
                            <div class="search-result-box-content-item">
                                <img src="img/result3.jpg">
                                <span>
                                    <a href="">Lam Ha An</a>
                                    <a href="">Studied at Uni Tuebingen</a>
                                    <a href="">HÃ  Ná»i, Viet Nam</a>
                                    <a href="">Live in HÃ  Ná»i, Viá»t Nam</a>
                                </span>
                                <button><i class="fa fa-user-plus" aria-hidden="true"></i> Add friend</button>
                            </div>
                            <div class="search-result-box-content-item">
                                <img src="img/result4.jpg">
                                <span>
                                    <a href="">Bang Kieu</a>
                                    <a href="">HÃ  Ná»i, Viet Nam</a>
                                    <a href="">Live in HÃ  Ná»i, Viá»t Nam</a>
                                </span>
                                <button><i class="fa fa-user-plus" aria-hidden="true"></i> Add friend</button>
                            </div>
                            <div class="search-result-box-content-item">
                                <img src="img/result1.jpg">
                                <span>
                                    <a href="">Truong My Linh</a>
                                    <a href="">HÃ  Ná»i, Viet Nam</a>
                                    <a href="">Live in HÃ  Ná»i, Viá»t Nam</a>
                                </span>
                                <button><i class="fa fa-user-plus" aria-hidden="true"></i> Add friend</button>
                            </div>
                        </div>
                        <div class="search-result-box-footer">
                        </div>
                    </div>
                </div>
                <div class="col-md-3 no-pad">
                    <div class="middle-right-section">
                        <div class="middle-right-section-header">
                            <span>
                                <i class="fa fa-gift" aria-hidden="true"></i>
                                <a href="#">3 event invitations today</a>
                            </span>
                            <span>
                                <i class="fa fa-calendar" aria-hidden="true"></i>
                                <a href="">LÃª Thá» CÃ  Chua</a>'s birthday is today
                            </span>
                        </div>
                        <div class="middle-right-section-body">
                            <div class="middle-right-section-body-title">
                                <label>PEOPLE YOU MAY KNOW</label>
                                <a href="#">See All</a>
                            </div>
                            <div class="friend-item">
                                <img src="img/friend1.jpg">
                                <span>
                                    <a href="#">Tráº§n XuÃ¢n KhÃ´i</a> 
                                    <span style="display:block;">123 mutual friends </span>
                                    <button><i class="fa fa-user-plus" aria-hidden="true"></i> Add friend</button>
                                </span>
                                <a href="#"><i class="fa fa-times" aria-hidden="true" class="ignore-friend"></i></a>
                            </div>

                            <div class="friend-item">
                                <img src="img/friend2.jpg">
                                <span>
                                    <a href="#">Tráº§n VÄn á»t</a> 
                                    <span style="display:block;">A mutual friend ...</span>
                                    <button><i class="fa fa-user-plus" aria-hidden="true"></i> Add friend</button>
                                </span>
                                <a href="#"><i class="fa fa-times" aria-hidden="true" class="ignore-friend"></i></a>
                            </div>

                            <div class="friend-item">
                                <img src="img/friend3.jpg">
                                <span>
                                    <a href="#">LÃª XuÃ¢n Xoáº¡n</a> 
                                    <span style="display:block;">A mutual friend ...</span>
                                    <button><i class="fa fa-user-plus" aria-hidden="true"></i> Add friend</button>
                                </span>
                                <a href="#"><i class="fa fa-times" aria-hidden="true" class="ignore-friend"></i></a>
                            </div>

                            <div class="friend-item">
                                <img src="img/friend2.jpg">
                                <span>
                                    <a href="#">Tráº§n VÄn á»t</a> 
                                    <span style="display:block;">A mutual friend ...</span>
                                    <button><i class="fa fa-user-plus" aria-hidden="true"></i> Add friend</button>
                                </span>
                                <a href="#"><i class="fa fa-times" aria-hidden="true" class="ignore-friend"></i></a>
                            </div>

                            <div class="friend-item">
                                <img src="img/friend3.jpg">
                                <span>
                                    <a href="#">Tráº§n VÄn á»t</a> 
                                    <span style="display:block;">A mutual friend ...</span>
                                    <button><i class="fa fa-user-plus" aria-hidden="true"></i> Add friend</button>
                                </span>
                                <a href="#"><i class="fa fa-times" aria-hidden="true" class="ignore-friend"></i></a>
                            </div>

                            <div class="friend-item">
                                <img src="img/friend1.jpg">
                                <span>
                                    <a href="#">Tráº§n VÄn á»t</a> 
                                    <span style="display:block;">A mutual friend ...</span>
                                    <button><i class="fa fa-user-plus" aria-hidden="true"></i> Add friend</button>
                                </span>
                                <a href="#"><i class="fa fa-times" aria-hidden="true" class="ignore-friend"></i></a>
                            </div>
                            <div class="friend-item">
                                <img src="img/friend3.jpg">
                                <span>
                                    <a href="#">Tráº§n VÄn á»t</a> 
                                    <span style="display:block;">A mutual friend ...</span>
                                    <button><i class="fa fa-user-plus" aria-hidden="true"></i> Add friend</button>
                                </span>
                                <a href="#"><i class="fa fa-times" aria-hidden="true" class="ignore-friend"></i></a>
                            </div>
                            <div class="friend-item">
                                <img src="img/friend3.jpg">
                                <span>
                                    <a href="#">Tráº§n VÄn á»t</a> 
                                    <span style="display:block;">A mutual friend ...</span>
                                    <button><i class="fa fa-user-plus" aria-hidden="true"></i> Add friend</button>
                                </span>
                                <a href="#"><i class="fa fa-times" aria-hidden="true" class="ignore-friend"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-2 no-pad">
                    <div id="online-list">
                        <ul>
                            <li>
                                <img src="img/friend1.jpg">
                                <span>Trung Hiáº¿u</span>
                                <span></span>
                            </li>
                            <li>
                                <img src="img/friend2.jpg">
                                <span>Há»ng Ngá»c</span>
                                <span></span>
                            </li>
                            <li>
                                <img src="img/friend3.jpg">
                                <span>Ca Chua</span>
                                <span></span>
                            </li>
                            <li>
                                <img src="img/avatar.jpg">
                                <span>HÃ  An</span>
                                <span></span>
                            </li>
                            <li>
                                <img src="img/user-comment1.jpg">
                                <span>Há»ng Ngá»c</span>
                                <span></span>
                            </li>
                            <li>
                                <img src="img/user_comment2.jpg">
                                <span>Háº£i SÆ¡n</span>
                                <span></span>
                            </li>
                            <li>
                                <img src="img/user-comment3.jpg">
                                <span>HÃ  Giang</span>
                                <span></span>
                            </li>
                            <li>
                                <img src="img/friend1.jpg">
                                <span>Trung Hiáº¿u</span>
                                <span></span>
                            </li>
                            <li>
                                <img src="img/friend2.jpg">
                                <span>Há»ng Ngá»c</span>
                                <span></span>
                            </li>
                            <li>
                                <img src="img/friend3.jpg">
                                <span>Ca Chua</span>
                                <span></span>
                            </li>
                            <li>
                                <img src="img/avatar.jpg">
                                <span>HÃ  An</span>
                                <span></span>
                            </li>
                            <li>
                                <img src="img/user-comment1.jpg">
                                <span>Há»ng Ngá»c</span>
                                <span></span>
                            </li>
                            <li>
                                <img src="img/user_comment2.jpg">
                                <span>Háº£i SÆ¡n</span>
                                <span></span>
                            </li>
                            <li>
                                <img src="img/user-comment3.jpg">
                                <span>HÃ  Giang</span>
                                <span></span>
                            </li>
                            <li>
                                <img src="img/friend1.jpg">
                                <span>Trung Hiáº¿u</span>
                                <span></span>
                            </li>
                            <li>
                                <img src="img/friend2.jpg">
                                <span>Há»ng Ngá»c</span>
                                <span></span>
                            </li>
                            <li>
                                <img src="img/friend3.jpg">
                                <span>Ca Chua</span>
                                <span></span>
                            </li>
                            <li>
                                <img src="img/avatar.jpg">
                                <span>HÃ  An</span>
                                <span></span>
                            </li>
                            <li>
                                <img src="img/user-comment1.jpg">
                                <span>Há»ng Ngá»c</span>
                                <span></span>
                            </li>
                            <li>
                                <img src="img/user_comment2.jpg">
                                <span>Háº£i SÆ¡n</span>
                                <span></span>
                            </li>
                            <li>
                                <img src="img/user-comment3.jpg">
                                <span>HÃ  Giang</span>
                                <span></span>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </section>
        <script>
            $(function () {
                var viewportHeight = $(window).height();
                $("#online-list").css("max-height", viewportHeight);
            });
        </script>
        <script src="js/app.js"></script>
    </body>

</html>
