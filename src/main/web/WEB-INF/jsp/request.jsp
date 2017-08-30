<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>

<body>
<h2>Request Items</h2>
<form:form method="POST" action="/result">
    <table>
        <tr style="display: none;">
            <td><form:label path="req">Name</form:label></td>
            <td><form:input path="req"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Request Items"/>
            </td>
        </tr>
    </table>
</form:form>

</body>

</html>