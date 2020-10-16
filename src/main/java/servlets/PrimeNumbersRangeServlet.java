package servlets;

import services.PrimeNumbersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/primeRange")
public class PrimeNumbersRangeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/primeNumbersRange.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var startNumber = Integer.parseInt(req.getParameter("startNumber"));
        var endNumber = Integer.parseInt(req.getParameter("endNumber"));
        var primeService = new PrimeNumbersService();

        req.setAttribute("numbers", primeService.isPrimeRance(startNumber, endNumber));

        this.getServletContext().getRequestDispatcher("/WEB-INF/primeNumbersRangeResponse.jsp").forward(req, resp);
    }
}
