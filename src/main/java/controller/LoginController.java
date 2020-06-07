package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginController extends HttpServlet{
    
    @Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		try {
			req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, res);
		} catch (Exception e) {
			System.out.println("Erro na API");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		try {
			String email = req.getParameter("email");
			String senha = req.getParameter("senha");

			if( email != null && senha != null) {
				System.out.println(email);
				//req.getRequestDispatcher("/WEB-INF/calcular.jsp").forward(req, resp);
				resp.setContentType("text/html;charset=UTF-8");
        		resp.getWriter().write("Success Data");

			} else {
				req.setAttribute("message", "Erro ao realizar login. Verifique email e senha e tente novamente");
				req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
			}

		} catch (Exception e) {
			System.out.println("Erro na API");
		}
	}
}