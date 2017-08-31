<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>QDS: Exercise</title>
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
<h1>Authors: Morolari Titilope</h1>
<h2 id="date"></h2>
<h2>Request Items</h2>
<div>
    <a class="btn qds-button" href="/result">Click Me</a>
</div>
</body>

</html>