package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/salvar", "/buscar", "/excluir" })
public class ControleAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControleAluno() {
		super();
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String method = request.getMethod();

		if (method.equals("GET")) {
			this.doGet(request, response);
		} else if (method.equals("POST")) {
			this.doPost(request, response);
		} else if (method.equals("PUT")) {
			this.doPut(request, response);
		} else if (method.equals("DELETE")) {
			this.doDelete(request, response);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String method = request.getMethod();
		response.getWriter().append("Served at: ").append(request.getContextPath()).append(" " + method);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
