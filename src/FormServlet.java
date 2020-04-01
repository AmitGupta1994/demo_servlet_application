import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//
//        int sum = num1 + num2;
        System.out.println("This is FormServlet ");

//        PrintWriter out = resp.getWriter();
//        out.println("/add_form.jsp");

        resp.setContentType("text/html");
        RequestDispatcher dispatcher =
                req.getRequestDispatcher("add_form.jsp");
        dispatcher.forward(req, resp);

        //req.getRequestDispatcher("/add_form.jsp").forward(req, resp);

    }
}
