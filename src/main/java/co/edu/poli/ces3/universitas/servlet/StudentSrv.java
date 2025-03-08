package co.edu.poli.ces3.universitas.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;


@WebServlet (name="studentSrv", value="/student")
public class StudentSrv extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("hello modarfa");
        super.init();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(HttpServletResponse.SC_CREATED);
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();
        out.println("Hela desde student");

        }
}
