<%--
  Created by IntelliJ IDEA.
  User: MOROLANI
  Date: 8/29/2017
  Time: 11:33 AM
  To change this template use File | Settings | File Templates.
--%>
<html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<head><title>QDS: Exercise</title>

    <spring:url value="/resources/core/css/style.css" var="coreCss"/>
    <spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss"/>
    <spring:url value="/resources/core/js/script.js" var="coreJs"/>
    <spring:url value="/resources/core/js/bootstrap.min.js" var="bootstrapJs"/>

    <link href="${bootstrapCss}" rel="stylesheet"/>
    <link href="${coreCss}" rel="stylesheet"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="${bootstrapJs}"></script>
    <script src="${coreJs}"></script>
</head>
<body>

<h1>Author: Morolari Titilope</h1>
<h2 id="date"></h2>
<div id="results">
    <script>
        parseJSON(${json} );
    </script>
</div>
<!--
<table border="1">
    <tr>
        <th>Name</th>
        <th>Price</th>
        <th>Color</th>
    </tr>
    <c:forEach items="${results}" var="author">
        <tr>
            <td> ${ author.name } </td>
            <td> ${ author.price }</td>
            <td> ${ author.color }</td>
        </tr>
    </c:forEach>
</table>
-->
</body>
</html>
