<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>ewallet Demo - sck4academy</title>
    </head>

    <body>
        <c:choose>
            <c:when test="${not empty dummyDataList}">
                <c:forEach var="dummyData" items="${dummyDataList}">
                    ${dummyData}
                </c:forEach>
            </c:when>
         </c:choose>
    </body>
</html>