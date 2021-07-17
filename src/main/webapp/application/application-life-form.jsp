<%--
  Created by IntelliJ IDEA.
  User: cs
  Date: 17.07.2021
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<html>
<%@ include file="../head.jspf" %>
<body>
<%@include file="../header.jspf"%>
<h1>Składanie wniosku o ubezpieczenie Life</h1>
<form method="post">
    <fieldset>
        <input type="text" name="firstName" required><br>
        <input type="text" name="lastName" required><br>
        <input type="date" name="birthDate" required><br>
        <input type="text" name="pesel" required><br>
        <input type="email" name="email" required><br>
    </fieldset>
    <fieldset>
        <input type="text" name="name" required><br>
        <input type="number" name="insuranceAmount" required><br>
    </fieldset>
    <input type="submit" value="Wyślij">
</form>
<%@ include file="../footer.jspf" %>
</body>
</html>
