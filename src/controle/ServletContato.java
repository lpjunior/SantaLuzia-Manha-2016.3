package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidade.Contato;

@WebServlet({ "/enviar", "/buscar" })
public class ServletContato extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletContato() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Contato c1 = new Contato();
		
		c1.setNome(request.getParameter("nome"));
		c1.setEmail(request.getParameter("email"));
		c1.setTelefone(request.getParameter("telefone"));
		
		request.setAttribute("contato", c1);
		
		request.getRequestDispatcher("jstl/dados.jsp").forward(request, response);
	}

}








