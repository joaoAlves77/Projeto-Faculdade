package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Document;

import model.DAO;
import model.JavaBeans;

@WebServlet(urlPatterns = { "/Controller", "/main", "/insert", "/select", "/update", "/delete" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	JavaBeans filme = new JavaBeans();
       
    public Controller() {
        super();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		if (action.equals("/main")) {
			filmes(request, response);
		} else if (action.equals("/insert")) {
			adicionarFilme(request, response);
		} else if (action.equals("/select")) {
			listarFilme(request, response);
		} else if (action.equals("/update")) {
			editarFilme(request, response);
		} else if (action.equals("/delete")) {
			removerFilme(request, response);
		} else {
			response.sendRedirect("index.html");
		}
	}
    
    // filmes
    protected void filmes(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<JavaBeans> lista = dao.listarFilmes();
		request.setAttribute("filmes", lista);
		RequestDispatcher rd = request.getRequestDispatcher("filme.jsp");
		rd.forward(request, response);
	}
    
    // Adicionar Filme
	protected void adicionarFilme(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		filme.setNome(request.getParameter("nome"));
		filme.setAutor(request.getParameter("autor"));
		filme.setDescricao(request.getParameter("descricao"));
		dao.inserirFilme(filme);
		response.sendRedirect("main");
	}
	
	// Lista filmes
	protected void listarFilme(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		filme.setId(request.getParameter("id"));
		dao.selecionarFilme(filme);
		request.setAttribute("id", filme.getId());
		request.setAttribute("nome", filme.getNome());
		request.setAttribute("autor", filme.getAutor());
		request.setAttribute("descricao", filme.getDescricao());
		RequestDispatcher rd = request.getRequestDispatcher("editar.jsp");
		rd.forward(request, response);
	}
	
	// Editar Filme
	protected void editarFilme(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		filme.setId(request.getParameter("id"));
		filme.setNome(request.getParameter("nome"));
		filme.setAutor(request.getParameter("autor"));
		filme.setDescricao(request.getParameter("descricao"));
		dao.alterarFilme(filme);
		response.sendRedirect("main");
	}
	
	
	// Remove Filme
	protected void removerFilme(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		filme.setId(request.getParameter("id"));
		dao.deletarFilme(filme);
		response.sendRedirect("main");
	}

}