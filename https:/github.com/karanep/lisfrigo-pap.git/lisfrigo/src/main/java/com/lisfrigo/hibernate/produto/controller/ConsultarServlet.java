package main.java.com.lisfrigo.hibernate.produto.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.com.lisfrigo.hibernate.produto.dao.Return;

public class ConsultarServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		PrintWriter out = response.getWriter();
		Return r = new Return();
		// int idp=Integer.parseInt(request.getParameter("idpro"));
		int idP = Integer.parseInt(request.getParameter("param2"));
		response.setContentType("text/html");
		out.println("<html lang='pt'>" + "<head> " + "<meta charset='UTF-8'>"
				+ "</head>" + "<body>" + "<h1>Ficha de Produto</h1>"
				+ "<b>Nome: </b>" + r.nome(idP) + "</br>"
				+ "<b>Descrição: </b>" + r.descricao(idP) + "<br/>"
				+ "<b>Preço: </b>"+r.preco(idP)+"<br/>"
				+ "<b>Altura: </b>" + r.altura(idP) + "<br/>"
				+ "<b>Profundidade: </b>" + r.profundidade(idP) + "<br/>"
				+ "<b>Volume: </b>" + r.volume(idP) + "<br/>" + "<b>Peso: </b>"
				+ r.peso(idP) + "<br/>" + "<b>Potencia: </b>" + r.potencia(idP)
				+ "<br/> <b>Observações: </b>"+r.observacao(idP)
				+ "</br>" +"</body></html>");

	}

}
