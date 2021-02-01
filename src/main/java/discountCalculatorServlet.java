import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "discountCalculatorServlet" , urlPatterns = "/Calculator")
public class discountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float price = Float.parseFloat(request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount"));
        double discount_amount = price * discount * 0.01;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Price: " + price+ "</h1>");
        writer.println("<h1>discount: " + discount+ "</h1>");
        writer.println("<h1>discount_amount: " + discount_amount+ "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
