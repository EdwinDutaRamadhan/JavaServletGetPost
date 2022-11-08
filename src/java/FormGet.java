
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class FormGet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String title = "Method GET";
        String docType = ""
                + "<!doctype html public \\\"-//w3c//dtd html 4.0 "
                + "transitional//en\\\">\n";
        
        out.println(docType + ""
                + "<html>\n"
                + "<head><title>"+ title +"</title></head>\n"
                + "<h1> " + title +" </h1>"
                + "<ul>\n"
                + "<li> Nama : "
                + req.getParameter("nama") + "\n"
                + "<li> NIM : "
                + req.getParameter("nim") + "\n"
                + "</ul>\n"
                + "</body></html>");
    }
    
    
}
