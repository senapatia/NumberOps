package operation.number.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddNumber extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int firstNumber = Integer.parseInt(req.getParameter("num1"));
		int secondNumber = Integer.parseInt(req.getParameter("num2"));
				
		int sum = firstNumber + secondNumber;

// PrintWriter out = res.getWriter();
// res.getWriter().println("result is = "+sum);
// req.setAttribute("sum", sum);
// RequestDispatcher rd = req.getRequestDispatcher("Square");
// rd.forward(req, res);
		
		res.sendRedirect("Square?sum=" + sum);

	}
}
