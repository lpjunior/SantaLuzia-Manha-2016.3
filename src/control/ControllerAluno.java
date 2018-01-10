package control;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Aluno;

@WebServlet({ "/salvar", "/buscar", "/excluir" })
public class ControllerAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControllerAluno() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		if(request.getServletPath().equals("/buscar")) {
			// id, nome, email, vazio
			if(request.getParameter("id") != null) {
				response.getWriter().append("Busca por id");
			} else if(request.getParameter("nome") != null) {
				response.getWriter().append("Busca por nome");
			} else if(request.getParameter("email") != null) {
				response.getWriter().append("Busca por email");
			} else {
				response.getWriter().append("Busca todos");
			}
		} else if(request.getServletPath().equals("/excluir")) {
			response.getWriter().append("excluir aluno");
		} else {
			response.sendRedirect("404.html");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		if(request.getServletPath().equals("/salvar")) {
			
			Aluno aluno = new Aluno();
			
			aluno.setNome(request.getParameter("nome"));
			aluno.setEmail(request.getParameter("email"));
			aluno.setTelefone(request.getParameter("tel"));
			aluno.setDtNascimento(LocalDate.parse(request.getParameter("dtNasc")));
			
			if(request.getParameter("id") != null) {
				
				aluno.setId(Long.parseLong(request.getParameter("id")));
				
				response.getWriter().append(aluno.toString()).append(" ").append("Dados alterados com sucesso.");
			} else {
				
				
				response.getWriter().append(aluno.toString() + "\n\nDados gravados com sucesso.");
			}
		} else {
			response.sendRedirect("404.html");
		}
		
	}
}
