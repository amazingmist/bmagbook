<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" %>
<div id="online-list">
    <div id="friend-detail-popup">
        <span id="back-triange"></span>
        <span id="front-triange"></span>
        <img src="" id="friend-image">
        <div id="friend-detail-popup-detail">
            <p>
                <a href="#" id="friend-name"></a>
                <span>36 followers</span>
            </p>
            <p>
                <i class="fa fa-user-plus" aria-hidden="true"></i> Became friends with <br><a href="/">Hien Tran and 3 others...</a>
            </p>
            <p>
                <i class="fa fa-user-plus" aria-hidden="true"></i> Became friends with <br><a href="/">Ca Chua and 3 others...</a>
            </p>
        </div>
    </div>
    <ul>
        <c:set var="list" value="${requestScope.friendList}"></c:set>
        <c:forEach var="friend" items="${list}">
            <li id="${friend.emailOrPhone}">
                <img class="avatar-small" src="${pageContext.servletContext.contextPath}/ProcessImage?emailOrPhone=${friend.emailOrPhone}">
                <span>
                    ${friend.lastName}
                    ${friend.firstName}
                </span>
            </li>
        </c:forEach>
    </ul>
</div>