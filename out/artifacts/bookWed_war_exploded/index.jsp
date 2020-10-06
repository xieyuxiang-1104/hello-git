<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>图书管理</title>
</head>
<body>

<%--<a href="/IdeaBook/mybook?method=qure">sdf</a>--%>

<form action="/IdeaBook/mybook?method=qure" method="post" enctype="content-type">
    书名:<input type="text"  name="bookName"  >

    作者:<input type="text" name="bookAuthor"  >

    <input type="submit" value="查询"/>
</form>

<table border 1px dashed #F00;>

    <tr>
        <th>书名</th>
        <th>作者</th>
        <th>出版社</th>
        <th>页数</th>
        <th>价格</th>
    </tr>
    <c:forEach items="${books}" var="book" >
    <tr>

                    <td><span>${book.bookName }</span></td>
                    <td><span>${book.bookAuthor}</span></td>
                    <td><span>${book.bookPublish }</span></td>
                    <td><span>${book.bookPage}</span></td>
                    <td><span>${book.bookPrice }</span></td>
    </tr>
        </c:forEach>


</body>
</html>