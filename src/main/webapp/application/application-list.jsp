<%--
  Created by IntelliJ IDEA.
  User: cs
  Date: 17.07.2021
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<%@ include file="../head.jspf"%>
<body>
<%@include file="../header.jspf"%>
<h1>Lista wniosków</h1>
<table>
    <jsp:useBean id="applications" scope="request" type="java.util.List"/>
    <c:forEach var="app" items="${applications}">
        <tr>
            <td>
                ${app.id}
            </td>
            <td>
                ${app.client.firstName}
            </td>
            <td>
                ${app.client.lastName}
            </td>
            <td>
                ${app.insurance.insuranceAmount}
            </td>
        </tr>
    </c:forEach>
</table>
<%@ include file="../footer.jspf"%>
</body>
</html>
