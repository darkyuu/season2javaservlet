<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Pui Bank Demo:Show dummy data</title>
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