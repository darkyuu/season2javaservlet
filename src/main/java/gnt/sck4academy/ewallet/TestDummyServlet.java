package gnt.sck4academy.ewallet;

import java.io.IOException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "TestDummyServlet",
        urlPatterns = {"/testDummy"}
)

public class TestDummyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
        throws ServletException, IOException {
        
        List<String> result = new ArrayList<String>();
        
        try {
            Statement stat = ConnectionUtils.getConnection().createStatement();
            ResultSet rs = stat.executeQuery("select * from tbl_presentation_test_data;");
            
            while (rs.next()) {
                result.add("<h2>|" + rs.getString("ID") + "|" +rs.getString("name")+"</h2><br/>");
            }
            rs.close();
            ConnectionUtils.closeQuietly(MySQLConnUtils.getMySQLConnection());
            
        } catch (Exception ex) {
            result.add("No Dummy Data") ;
            ex.printStackTrace();
        }
        
        String nextJSP = "/testdummy.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        req.setAttribute("dummyDataList", result);
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        
        doGet(req, resp);
    }
}
