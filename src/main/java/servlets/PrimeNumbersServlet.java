package servlets;

import services.PrimeNumbersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/prime")
public class PrimeNumbersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/primeNumbers.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var number = request.getParameter("number");
        var primeService = new PrimeNumbersService();

        request.setAttribute("number", number);
        request.setAttribute("isPrime", primeService.isPrime(Integer.parseInt(number)));

        this.getServletContext().getRequestDispatcher("/WEB-INF/primeNumbersResponse.jsp").forward(request, response);

    }
}
