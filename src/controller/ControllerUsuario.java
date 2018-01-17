package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Usuario;

@WebServlet({ "/login", "/logout", "/edit" })
public class ControllerUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControllerUsuario() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		// remove a sess�o "USUARIO"
		session.removeAttribute("usuario");

		// destroi todas as sess�es
		session.invalidate();

		// redireciona para a home.jsp
		response.sendRedirect("home.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getServletPath().equals("/login")) {
			HttpSession session = request.getSession();

			Usuario u = new Usuario();

			u.setLogin(request.getParameter("login"));
			u.setSenha(request.getParameter("senha"));
			u.setNome("Luis");

			if (u.getLogin().equals("lpjr") && u.getSenha().equals("123")) {
				session.setAttribute("usuario", u);
				response.sendRedirect("home.jsp");
			} else {
				response.sendRedirect("error.jsp");
			}
		} else if (request.getServletPath().equals("/edit")) {
			gerPerfil(request, response);
		}
	}

	private void gerPerfil(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Usuario usuario = (Usuario) session.getAttribute("usuario");

		usuario.setNome(request.getParameter("nome"));
		session.removeAttribute("usuario");
		session.setAttribute("usuario", usuario);
		response.sendRedirect("home.jsp");
	}
}
