package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Usuario;

@WebServlet({ "/login", "/logout" })
public class ControllerUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ControllerUsuario() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Usuario u = new Usuario();
		u.setLogin(request.getParameter("login"));
		u.setSenha(request.getParameter("senha"));
		
		if(u.getLogin().equals("lpjr") && u.getSenha().equals("123")) {
			session.setAttribute("login", u);
			response.sendRedirect("home.jsp");
		}
	}

}
