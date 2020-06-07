package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calcular")
public class CalculadoraController extends HttpServlet{
    
    @Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		try{
			req.getRequestDispatcher("/WEB-INF/calcular.jsp").forward(req, res);
		} catch (Exception e){
			System.out.println("Erro");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		try {
			String a = req.getParameter("a");
			String b = req.getParameter("b");
			String operacao = req.getParameter("operacao");

			System.out.println("a = " + a + operacao + "b = " + b);
			resp.setContentType("text/html;charset=UTF-8");
        	resp.getWriter().write("Success Data");

		} catch (Exception e) {
			System.out.println("Erro na API");
		}
	}
}