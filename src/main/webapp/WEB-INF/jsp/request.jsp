<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<style>
    input[type=submit] {
        width: 100%;
        background-color: #0f83af;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }
</style>
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