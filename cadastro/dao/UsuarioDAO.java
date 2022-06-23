/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.dao;

import cadastro.entidades.Usuario;
import cadastroprodutos.ConexaoMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection con = ConexaoMySql.conectarBanco();
    String sql = null;
    Statement declaracao;
    ResultSet resultado;

    public void inserir(Usuario u) {
        sql = "INSERT INTO usuario (nomeusuario, email, senha, permissoes) VALUES(?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, u.getNomeusuario());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getSenha());
            ps.setString(4, u.getPermissoes());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuario inserido com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir usuario!");
            e.printStackTrace();
        }
    }

    public void atualizar(Usuario u) {
        sql = "UPDATE usuario SET senha = ?, tipo = ? WHERE idusuario = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, u.getNomeusuario());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getSenha());
            ps.setString(4, u.getPermissoes());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuario atualizado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar usuario!");
            e.printStackTrace();
        }
    }

    public void excluir(Usuario u) {
        sql = "DELETE FROM usuario WHERE idusuario = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, u.getIdusuario());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario excluído com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir usuario!");
            e.printStackTrace();
        }
    }

    public int buscarId() {
        int id = 0;

        sql = "SELECT MAX(id) FROM usuario";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.first()) {
                id = rs.getInt(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar id do usuario!");
            e.printStackTrace();
        }

        return id + 1;
    }

    public ArrayList<Usuario> listar() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        sql = "SELECT * FROM usuario";

        try {
            Statement st = con.createStatement();
            ResultSet resultado = st.executeQuery(sql);

            while (resultado.next()) {
                int idusuario = resultado.getInt("idusuario");
                String nomeusuario = resultado.getString("nomeusuario");
                String email = resultado.getString("email");
                String senha = resultado.getString("senha");
                String permissoes = resultado.getString("permissoes");
                Usuario usuario = new Usuario(idusuario, nomeusuario, email, senha, permissoes);
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar lista de usuarios!");
            e.printStackTrace();
        }

        return usuarios;
    }

    public ArrayList<Usuario> pesquisarPorDescricao(String pesquisa) {
        ArrayList<Usuario> usuariosPesquisados = new ArrayList<>();
        sql = "SELECT * FROM usuario WHERE login LIKE '%" + pesquisa + "%'";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {
                int idusuario = resultado.getInt("idusuario");
                String nomeusuario = resultado.getString("nomeusuario");
                String email = resultado.getString("email");
                String senha = resultado.getString("senha");
                String permissoes = resultado.getString("permissoes");
                Usuario usuario = new Usuario(idusuario, nomeusuario, email, senha, permissoes);
                usuariosPesquisados.add(usuario);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar usuarios!");
            e.printStackTrace();
        }

        return usuariosPesquisados;
    }

    public ArrayList<Usuario> pesquisarPorTipo(int pesquisa) {
        ArrayList<Usuario> usuariosPesquisados = new ArrayList<>();
        sql = "SELECT * FROM usuario WHERE tipo = " + pesquisa;

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.first()) {

                int idusuario = resultado.getInt("idusuario");
                String nomeusuario = resultado.getString("nomeusuario");
                String email = resultado.getString("email");
                String senha = resultado.getString("senha");
                String permissoes = resultado.getString("permissoes");
                Usuario usuario = new Usuario(idusuario, nomeusuario, email, senha, permissoes);
                usuariosPesquisados.add(usuario);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar codigo!");
            e.printStackTrace();
        }
        return usuariosPesquisados;
    }
}
