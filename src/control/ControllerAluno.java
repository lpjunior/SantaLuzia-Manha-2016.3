package control;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.entity.Aluno;
import model.implement.AlunoDAOImp;

@WebServlet({ "/salvar", "/buscar", "/excluir" })
public class ControllerAluno extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public ControllerAluno() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		AlunoDAOImp daoImp = new AlunoDAOImp();
		Aluno a = new Aluno();
		
		if (request.getServletPath().equals("/buscar")) {
			// id, nome, email, vazio
			if (request.getParameter("id") != null) {
				a.setId(Long.parseLong(request.getParameter("id")));
				//response.getWriter().append(daoImp.buscar(a).toString());
				
				request.setAttribute("aluno", daoImp.buscar(a));
				request.getRequestDispatcher("index.jsp").forward(request, response);
				
			} else if (request.getParameter("nome") != null) {
				a.setNome(request.getParameter("nome"));
				//response.getWriter().append(daoImp.listar(a).toString());
				request.setAttribute("alunos", daoImp.listar(a));
				request.getRequestDispatcher("index.jsp").forward(request, response);
			} else if (request.getParameter("email") != null) {
				a.setEmail(request.getParameter("email"));
				//response.getWriter().append(daoImp.buscar(a).toString());
				request.setAttribute("aluno", daoImp.buscar(a));
				request.getRequestDispatcher("index.jsp").forward(request, response);
			} else {
				//response.getWriter().append(daoImp.listar(a).toString());
				request.setAttribute("alunos", daoImp.listar(a));
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		} else if (request.getServletPath().equals("/excluir")) {
			a.setId(Long.parseLong(request.getParameter("id")));
			if(daoImp.excluir(a))
				response.getWriter().append("aluno excluido com sucesso!");
			request.setAttribute("msgtab", " aluno excluido com sucesso!");
			request.getRequestDispatcher("/buscar").forward(request, response);
		} else {
			response.sendRedirect("404.html");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getServletPath().equals("/salvar")) {
			
			AlunoDAOImp daoImp = new AlunoDAOImp();
			
			Aluno aluno = new Aluno();

			aluno.setNome(request.getParameter("nome"));
			aluno.setEmail(request.getParameter("email"));
			aluno.setTelefone(request.getParameter("tel"));
			aluno.setDtNascimento(LocalDate.parse(request.getParameter("dtNasc")));

			if (request.getParameter("id") != null) {

				aluno.setId(Long.parseLong(request.getParameter("id")));
				if(daoImp.editar(aluno))
					
					request.setAttribute("msg", aluno.getNome() + " editado com sucesso.");
				request.getRequestDispatcher("index.jsp").forward(request, response);
					//response.getWriter().append(aluno.getNome()).append(" ").append("editado com sucesso.");
			} else {
				if(daoImp.cadastrar(aluno))
					//response.getWriter().append(aluno.getNome() + " cadastrado com sucesso.");
					
					request.setAttribute("msg", aluno.getNome() + " cadastrado com sucesso.");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		} else {
			response.sendRedirect("404.html");
		}
	}
}
