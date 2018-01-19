package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Usuario;

@WebServlet({ "/login", "/logout", "/edit", "/sign_in" })
public class ControllerUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControllerUsuario() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		// remove a sessão "USUARIO"
		session.removeAttribute("usuario");

		// destroi todas as sessões
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

			if (u.getLogin().equalsIgnoreCase("lpjr") && u.getSenha().equals("123")) {
				session.setAttribute("usuario", u);
				response.sendRedirect("home.jsp");
			} else {
				response.sendRedirect("error.jsp");
			}
		} else if (request.getServletPath().equals("/edit")) {
			gerPerfil(request, response);
		} else if (request.getServletPath().equals("/sign_in")) {
			cadPerfil(request, response);
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
	
	private void cadPerfil(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		Usuario usuario = new Usuario();

		usuario.setNome(request.getParameter("nome"));
		usuario.setLogin(request.getParameter("login"));
		usuario.setSenha(request.getParameter("senha"));
		
		session.setAttribute("usuario", usuario);
		session.setAttribute("msg", 
				"$(function() {\r\n" + 
				"	setTimeout(function() {\r\n" + 
				"		$.bootstrapGrowl(\"<strong>Cadastro!</strong><br>Registro feito com sucesso.\", {\r\n" + 
				"			type : 'success'\r\n" + 
				"		});\r\n" + 
				"	}, 0);\r\n" + 
				"});");
		response.sendRedirect("home.jsp");
	}
}
