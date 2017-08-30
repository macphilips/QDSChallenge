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
<head>
    <title>Title</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 50%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<h1>Authors: Morolari Titilope</h1>
<p>
<h2 id="date"></h2>

<script>
    var d = new Date();
    document.getElementById("date").innerHTML = d.toLocaleString();

</script>


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
<!--<script>
    var items = JSON.parse(${json});
    var result = '';
    result += '<tr><th>Name</th>        <th>Price</th>        <th>Color</th>        </tr>'
    for (var i = 0; i < item.length; i++) {
        var item = items[i];
        result += "<tr>";
        result += '<td>' + item.name + '</td>';
        result += '<td>' + item.price + '</td>';
        result += '<td>' + item.color + '</td>';
        result += '</tr>';
    }

    document.getElementById("test").innerHTML = ${json};
    document.getElementById("data_table").innerHTML = result;
</script> -->
</body>
</html>
