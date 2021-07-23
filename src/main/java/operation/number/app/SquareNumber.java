package operation.number.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareNumber extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int sum = Integer.parseInt(req.getParameter("sum"));
		
		int Result = sum * sum;
		
		PrintWriter out = res.getWriter();
		out.println("Square Of Sum Of The Two Numbers Is " + Result);
		// System.out.println("Square called");

	}
}
