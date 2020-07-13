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
			req.getRequestDispatcher("/view/calcular.jsp").forward(req, res);
		} catch (Exception e){
			System.out.println(e);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		try {
			String a = req.getParameter("a");
			String b = req.getParameter("b");
			String operacao = req.getParameter("operacao");

			b = b.substring(1, b.length());
			Double num1 = Double.parseDouble(a);
			Double num2 = Double.parseDouble(b);
			Double resultado = 0.0;

			//System.out.println("b convertido = " + teste);
			//System.out.println("a = " + a + operacao + "b = " + b);

			if(operacao.equals("+")){
				resultado = num1 + num2;
			}
			else if(operacao.equals("-")){
				resultado = num1 - num2;
			}
			else if(operacao.equals("x")){
				resultado = num1 * num2;
			}
			else if(operacao.equals("/")){
				if( operacao.equals("/") && num2 == 0 ){
					String msg = "Nao e possivel fazer divisao com 0.";
				} 
				else {
					resultado = num1/num2;
				}
			}
			else if(operacao.equals("raiz")){
				if(operacao.equals("raiz") && (num2 < 0)){
					String msg = "Nao e possivel resolver a raiz de um numero negativo considerando apenas numeros reais";
				}
				else{
					resultado = Math.sqrt(num2);
				}
			}
			else if(operacao.equals("^")){
				resultado = Math.pow(num1, num2);
			}

			System.out.println("Resultado: " + resultado);

			resp.setContentType("text/html;charset=UTF-8");
			resp.getWriter().write(resultado.toString());


			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}