package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3307/dbfilme?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "12345";
	
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	//teste de conexão
	public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// Crud create
	public void inserirFilme(JavaBeans filme) {
		String create = "insert into filmes (nome, autor, descricao) values (?,?,?)";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);
			pst.setString(1, filme.getNome());
			pst.setString(2, filme.getAutor());
			pst.setString(3, filme.getDescricao());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public ArrayList<JavaBeans> listarFilmes() {
		ArrayList<JavaBeans> filmes = new ArrayList<>();
		String read = "select * from filmes order by nome";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String id = rs.getString(1);
				String nome = rs.getString(2);
				String autor = rs.getString(3);
				String descricao = rs.getString(4);
				filmes.add(new JavaBeans(id, nome, autor, descricao));
			}
			con.close();
			return filmes;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public void selecionarFilme(JavaBeans filme) {
		String read2 = "select * from filmes where id = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setString(1, filme.getId());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				filme.setId(rs.getString(1));
				filme.setNome(rs.getString(2));
				filme.setAutor(rs.getString(3));
				filme.setDescricao(rs.getString(4));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void alterarFilme(JavaBeans filme) {
		String update = "update filmes set nome=?,autor=?,descricao=? where id=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(update);
			pst.setString(1, filme.getNome());
			pst.setString(2, filme.getAutor());
			pst.setString(3, filme.getDescricao());
			pst.setString(4, filme.getId());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void deletarFilme(JavaBeans filme) {
		String delete = "delete from filmes where id=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setString(1, filme.getId());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}