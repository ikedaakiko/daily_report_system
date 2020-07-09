package controllers.employees;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Report;

/**
 * Servlet implementation class ReportNew2Servlet
 */
@WebServlet("/reports/new2")
public class ReportNew2Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReportNew2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
        request.setAttribute("_token", request.getSession().getId());

        Report r = new Report();
        r.setReport_date(new Date(System.currentTimeMillis()));
        request.setAttribute("report", r);

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/reports/new2.jsp");
        rd.forward(request, response);
    }
}
