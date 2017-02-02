<%@ page contentType="text/html" %>
<%@ page import="java.sql.*" %>
<%@ page import="org.sqlite.*" %>
 
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Pui Bank Demo</title>
    </head>
    <body>
        <h2>Hello World!</h2>
        <%
            Class.forName("org.sqlite.JDBC");
            Connection conn =
                 DriverManager.getConnection("jdbc:sqlite:src/main/resources/PuiBank.db");
            Statement stat = conn.createStatement();

            ResultSet rs = stat.executeQuery("select * from tbl_presentation_test_data;");

            while (rs.next()) {
                out.println("<h2>|" + rs.getString("ID") + "|" +rs.getString("name")+"</h2>");
                out.println("<br/>");
            }

            rs.close();
            conn.close();
        %>
    </body>
</html>
